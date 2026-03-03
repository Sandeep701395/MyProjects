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

public class EditDetails extends HttpServlet
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
		PrintWriter pw=resp.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("select * from emp where id=?");
			
			pre.setInt(1, id);
			rs=pre.executeQuery();
			if(rs.next())
			{
				pw.println("<html><body>"
						+ "<form action=saveChanges method=post>"
						+ "<table border=1>"
						+ "<thead>"
						+ "<tr>"
						+ "<th colspan=2> Edit Details</th>"
						+ "</tr>"
						+ "</thead>"
						+ "<tbody>"
						+ "<tr>"
						+ "<th><label>ID</label></th>"
						+ "<td><input type=number value="+rs.getInt(1)+"name=id readonly></td>"
						+ "</tr>"
						+ "<tr><th><label>Name</label></th><td><input type=text value="+rs.getString(2)+" name=name> </tr>"
						+ "<tr><th><label>Salary</label></th><td><input type=text value="+rs.getDouble(3)+" name=salary readonly></tr>"
						+ "<tr><th><label>Email</label></th><td><input type=text value="+rs.getString(4)+" name=email ></tr>"
						+ "<tr><th><label>Password</label></th><td><input type=text value="+rs.getString(5)+" name=pwd readonly></tr>"
						+ "<tr><th><label>PhNo</label></th><td><input type=text value="+rs.getLong(6)+" name=phno readonly ></tr>"
						+ "<tr><th><label>Designation</label></th><td><input type=text value="+rs.getString(7)+" name=designation readonly></tr>"
						+ "<tr><th><label>Location</label></th><td><input type=text value="+rs.getString(8)+" name=location ></tr>"
						+ "</tbody>"
						+ "</table>"
						+ "<button>Save</button>"
						+ "</form></body></html>");
				
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("home");
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
