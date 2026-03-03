package servlet_chaining_programs;

import java.io.IOException;
import java.io.PrintWriter;
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

public class Form extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		
		String url="jdbc:mysql://localhost:3306/jdbc_test1";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			 pre=con.prepareStatement("select * from admin where email=? and pwd=?");
			pre.setString(1, email);
			pre.setString(2, pwd);
			 rs=pre.executeQuery();
			if(rs.next())
			{
				RequestDispatcher rd=req.getRequestDispatcher("homepage.html");
				rd.forward(req, resp);
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("form.html");
				PrintWriter pw=resp.getWriter();
				pw.println("<h1 style=color:red;> invalid Email and Password...</h1>");
				rd.include(req, resp);
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
				   rs.close();
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
