package emp_project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=req.getSession();
		String email=(String) hs.getAttribute("email");
		if(email==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, resp);
			return;
		}
		PrintWriter pw=resp.getWriter();
		pw.println("<h1>Employee Details</h1>");
		pw.println("<table border='1' cellpadding='10'>"
				+ "<tr>"
				+ "<th>EID</th>"
				+ "<th>Name</th>"
				+ "<th>Age</th>"
				+ "<th>Salary</th>"
				+ "<th>Address</th>"
				+ "<th>Email</th>"
				+ "<th>Password</th>"
				+ "<th>Phone</th>"
				+ "</tr>");
		
		String url="jdbc:mysql://localhost:3306/employee_management";
		String user="root";
		String password="root";
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			 pre=con.prepareStatement("select * from employees");
			 rs=pre.executeQuery();
			
			while(rs.next())
			{
				pw.println("<tr>"
						+ "<td>"+rs.getInt(1)+"</td>"
						+ "<td>"+rs.getString(2)+"</td>"
						+ "<td>"+rs.getInt(3)+"</td>"
						+ "<td>"+rs.getDouble(4)+"</td>"
						+ "<td>"+rs.getString(5)+"</td>"
						+ "<td>"+rs.getString(6)+"</td>"
						+ "<td>"+rs.getString(7)+"</td>"
						+ "<td>"+rs.getLong(8)+"</td>"
						+ "</tr>");
			}
			pw.println("</table><br>");
			
			pw.println("<form action='edit' method='post'>");
			pw.println("Enter EID to Edit: <input type='number' name='eid' required>");
			pw.println("<button>Edit</button>");
			pw.println("</form><br>");

			pw.println("<form action='delete' method='post'>");
			pw.println("Enter EID to Delete: <input type='number' name='eid' required>");
			pw.println("<button>Delete</button>");
			pw.println("</form>");
			
			
//			hs.setAttribute("email", email);
			
			
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
