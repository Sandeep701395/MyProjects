package emp_management;

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
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		
		String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("select * from emp where email=? and pwd=?");
			pre.setString(1, email);
			pre.setString(2, pwd);
			
			rs=pre.executeQuery();
			if(rs.next())
			{
				HttpSession hs=req.getSession();
				hs.setAttribute("id",rs.getInt("id") );
				RequestDispatcher rd=req.getRequestDispatcher("homepage.html");
				rd.forward(req, resp);
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.include(req, resp);
				PrintWriter pw=resp.getWriter();
				pw.println("<html><body>"
						+ "<h1>Invalid Email Or Password</h1>"
						+ "</body></html>");
			}
		} catch (ClassNotFoundException | SQLException e) {
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
