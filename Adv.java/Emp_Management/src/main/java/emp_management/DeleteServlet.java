package emp_management;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=req.getSession();
		int id=(int) hs.getAttribute("id");
		
		String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
		Connection con=null;
		PreparedStatement pre=null;
		PrintWriter pw=resp.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("delete from emp where id=?");
			pre.setInt(1, id);
			int i=pre.executeUpdate();
			if(i==1)
			{
				hs.invalidate();
				RequestDispatcher rd=req.getRequestDispatcher("dashboard.html");
				rd.forward(req, resp);
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
