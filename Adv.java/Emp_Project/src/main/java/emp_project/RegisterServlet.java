package emp_project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		int age=Integer.parseInt(req.getParameter("age"));
		double sal=Double.parseDouble(req.getParameter("sal"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		long phno=Long.parseLong(req.getParameter("phno"));
		
		String url="jdbc:mysql://localhost:3306/employee_management";
		String user="root";
		String pasword="root";
		Connection con=null;
		PreparedStatement pre=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pasword);
			String s="insert into employees values(?,?,?,?,?,?,?,?)";
			pre=con.prepareStatement(s);
			pre.setInt(1, id);
			pre.setString(2, name);
			pre.setInt(3, age);
			pre.setDouble(4, sal);
			pre.setString(5, address);
			pre.setString(6, email);
			pre.setString(7, pwd);
			pre.setLong(8, phno);
			pre.executeUpdate();
			
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.forward(req, resp);
			
			
		} catch ( SQLException | ClassNotFoundException e) {
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
