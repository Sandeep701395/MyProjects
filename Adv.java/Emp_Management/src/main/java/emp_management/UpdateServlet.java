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

public class UpdateServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=req.getSession();
		int id=(int) hs.getAttribute("id");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		String location=req.getParameter("location");
		PrintWriter pw=resp.getWriter();
		
		String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("select name,email,pwd,location from emp where id=?");
			pre.setInt(1, id);
			rs=pre.executeQuery();
			if(rs.next())
			{
				String oldName=rs.getString("name");
				String oldEmail=rs.getString("email");
				String oldPwd=rs.getString("pwd");
				String oldLocation=rs.getString("location");
				
				name=(name==null || name.trim().isEmpty())?oldName:name;	
				email=(email==null || email.trim().isEmpty())?oldEmail:email;
				pwd=(pwd==null || pwd.trim().isEmpty())?oldPwd:pwd;
				location=(location==null || location.trim().isEmpty())?oldLocation:location;
				
				pre=con.prepareStatement("update emp set name=?,email=?,pwd=?,location=? where id=?");
				pre.setString(1, name);
				pre.setString(2, email);
				pre.setString(3, pwd);
				pre.setString(4, location);
				pre.setInt(5, id);
				
				int i=pre.executeUpdate();
				if(i==1)
				{
					RequestDispatcher rd=req.getRequestDispatcher("home");
					rd.forward(req, resp);
				}
				else
				{
					RequestDispatcher rd=req.getRequestDispatcher("editEmployee");
					pw.println("<html><body>"
							+ "<h4>Unable to Process Request!!!!</h4>"
							+ "</body></html>");
					rd.include(req, resp);
				}
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("editEmployee");
				pw.println("<html><body>"
						+ "<h4>Unable to Process Request!!!!</h4>"
						+ "</body></html>");
				rd.include(req, resp);
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
