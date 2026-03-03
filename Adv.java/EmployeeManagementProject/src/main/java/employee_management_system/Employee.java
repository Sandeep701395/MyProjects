package employee_management_system;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int eid=Integer.parseInt(req.getParameter("eid"));
		String ename=req.getParameter("ename");
		int age=Integer.parseInt(req.getParameter("age"));
		int salary=Integer.parseInt(req.getParameter("salary"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		long phno=Long.parseLong(req.getParameter("phno"));
		
		
		String url="jdbc:mysql://localhost:3306/employee_management";
		String user="root";
		String password="root";
		Connection con=null;
		PreparedStatement pre=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("insert into employee(eid,ename,age,salary,address,email,pwd,phno) values(?,?,?,?,?,?,?,?)");
			pre.setInt(1, eid);
			pre.setString(2, ename);
			pre.setInt(3, age);
			pre.setInt(4, salary);
			pre.setString(5, address);
			pre.setString(6, email);
			pre.setString(7, pwd);
			pre.setLong(8, phno);
			
			pre.executeUpdate();
			
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, resp);
			
		
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
