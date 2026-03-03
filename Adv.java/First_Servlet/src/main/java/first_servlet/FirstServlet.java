package first_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginForm from FirstServlet");
		
		Connection con=null;
		PreparedStatement pre=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet?user=root&&password=root");
			
			
			pre=con.prepareStatement("insert into users(fname,lname,pwd,email,mobileNo) values(?,?,?,?,?)");
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String pwd=req.getParameter("pwd");
			String email=req.getParameter("email");
			long phno=Long.parseLong(req.getParameter("phno"));
			pre.setString(1, fname);
			pre.setString(2, lname);
			pre.setString(3, pwd);
			pre.setString(4, email);
			pre.setLong(5, phno);
			
			int i=pre.executeUpdate();
			System.out.println(i+"  inserted...");
			
			PrintWriter pw=resp.getWriter();
			
			pw.println("<h1 style=color:'green'>"+fname+" " +lname+"inserted...</h1>");
			
			
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
