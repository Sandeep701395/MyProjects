package first_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Second Login Form");
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		long phno=Long.parseLong(req.getParameter("phno"));
		
		String url="jdbc:mysql://localhost:3306/servlet";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection(url, user, password);
			String s="insert into form values(?,?,?,?,?)";
			 pre=con.prepareStatement(s);
			 
			 pre.setString(1, name);
			 pre.setString(2, pwd);
			 pre.setInt(3, age);
			 pre.setString(4, email);
			 pre.setLong(5, phno);
			 
			 pre.executeUpdate();
			 
			 
			 PrintWriter pw=resp.getWriter();
			 pw.println("<html><body style='background-color:blue; color:white;'>"+"<h1>Hello Mr."+name+" Your data is Successfully Inserted....</h1>"+"</body></html>");
			 
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
            try {
                if (pre != null) 
                	 pre.close();
                if (con != null) 
                	con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
	}
	

	}
}
