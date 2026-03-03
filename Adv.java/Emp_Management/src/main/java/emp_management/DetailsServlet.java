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

public class DetailsServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=req.getSession();
		int id=(int) hs.getAttribute("id");
		
		
		String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("select * from emp where id=?");
			
			pre.setInt(1, id);
			rs=pre.executeQuery();
			if(rs.next())
			{
				PrintWriter pw=resp.getWriter();
				pw.println("<html><body>"
						+ "<table>"
						+ "<thead>"
						+ "<tr>"
						+ "<th colspan=2>Emp Information</th>"
						+ "</tr>"
						+ "</thead>"
						+ "<tbody>"
						+ "<tr>"
						+ "<th>ID</th>"
						+ "<td>"+rs.getInt(1)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Name</th>"
						+ "<td>"+rs.getString(2)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Salary</th>"
						+ "<td>"+rs.getDouble(3)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Email</th>"
						+ "<td>"+rs.getString(4)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Password</th>"
						+ "<td>"+rs.getString(5)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Phno</th>"
						+ "<td>"+rs.getLong(6)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Designation</th>"
						+ "<td>"+rs.getString(7)+"</td>"
						+ "</tr>"
						+ "<tr>"
						+ "<th>Location</th>"
						+ "<td>"+rs.getString(8)+"</td>"
						+ "</tr>"
						+ "</tbody>"
						+ "</table>"
						+"<form method=post>"
						+ "<input type=submit formaction=editEmployee value=Edit>"
						+ "<input type=submit formaction=deleteEmployee value=Delete>"
						+ "<a href=dashboard.html>dashboard</a>"
						+ "</form>"
						+ "</body></html>");
				
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("homepage.html");
				PrintWriter pw=resp.getWriter();
				pw.println("<html><body>"
						+ "<p>unable Process request</p>"
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
