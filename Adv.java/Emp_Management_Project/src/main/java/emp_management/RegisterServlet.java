package emp_management;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int salary=Integer.parseInt(req.getParameter("sal"));
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		long phno=Long.parseLong(req.getParameter("phno"));
		String designation=req.getParameter("designation");
		String location=req.getParameter("location");
		
		String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
		Connection con=null;
		PreparedStatement pre=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			pre=con.prepareStatement("insert into emps values(?,?,?,?,?,?,?,?)");
			pre.setInt(1, id);
			pre.setString(2, name);
			pre.setInt(3, salary);
			pre.setString(4, email);
			pre.setString(5, pwd);
			pre.setLong(6, phno);
			pre.setString(7, designation);
			pre.setString(8, location);
			int i=pre.executeUpdate();
			if(i!=0)
			{
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.forward(req, resp);
			}
			else
			{
				PrintWriter pw=resp.getWriter();
				pw.println("Registration Failed....!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(pre!=null)
					pre.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
