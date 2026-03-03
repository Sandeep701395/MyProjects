package emp_project;

import java.io.IOException;
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

public class UpdateServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       

        int eid = Integer.parseInt(req.getParameter("eid"));
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        double salary=Double.parseDouble(req.getParameter("salary"));
        String address = req.getParameter("address");
        String email=req.getParameter("email");
        String pwd=req.getParameter("pwd");
        long phone = Long.parseLong(req.getParameter("phone"));
        
        
        String url="jdbc:mysql://localhost:3306/employee_management";
		String user="root";
		String pasword="root";
		Connection con=null;
		PreparedStatement pre=null;


        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pasword);
             pre = con.prepareStatement("update employees set age=?, address=?,email=?,phno=? where id=?");
            pre.setInt(1, age); 
            pre.setString(2, address);
            pre.setString(3, email);
            pre.setLong(4, phone);
            pre.setInt(5, eid);

            pre.executeUpdate();

            RequestDispatcher rd=req.getRequestDispatcher("home");
            rd.forward(req, resp);
        }
        catch(Exception e)
        {
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
