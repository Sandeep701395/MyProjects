package emp_project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class EditServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
		resp.setContentType("text/html");
	    int eid = Integer.parseInt(req.getParameter("eid"));

	    String url="jdbc:mysql://localhost:3306/employee_management";
		String user="root";
		String password="root";
	    Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet rs = null;

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection(url, user, password);
	        pre = con.prepareStatement("SELECT * FROM employees WHERE id=?");
	        pre.setInt(1, eid);
	        rs = pre.executeQuery();

	        PrintWriter out = resp.getWriter();
	        

	        if (rs.next()) {
	            out.println("<html><body>");
	            out.println("<h2>Edit Employee</h2>");

	            out.println("<form action='update' method='post'>");

	            out.println("EID: <input type='text' name='eid' value='" + rs.getInt("id") + "' readonly><br>");
	            out.println("Name: <input type='text' name='ename' value='" + rs.getString("name") + "' readonly><br>");
	            out.println("Age: <input type='text' name='age' value='" + rs.getInt("age") + "'><br>");
	            out.println("Salary: <input type='text' name='salary' value='" + rs.getDouble("salary") + "'><br>");
	            out.println("Address: <input type='text' name='address' value='" + rs.getString("address") + "'><br>");
	            out.println("Email: <input type='email' name='email' value='" + rs.getString("email") + "'><br>");
	            out.println("Password: <input type='password' name='password' value='" + rs.getString("pwd") + "'><br>");
	            out.println("Phone: <input type='text' name='phno' value='" + rs.getString("phno") + "'><br>");

	            out.println("<input type='submit' value='Update'>");
	            out.println("</form>");

	            out.println("</body></html>");
	        }

	    } catch (Exception e) {
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

