package httpservlet_programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentLogin extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		long phno=Long.parseLong(req.getParameter("phno"));
		
//		System.out.println(name);
//		System.out.println(pwd);
//		System.out.println(age);
//		System.out.println(email);
//		System.out.println(address);
//		System.out.println(phno);
		
		String url="jdbc:mysql://localhost:3306/http_servlet";
		String user="root";
		String password="root";
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			String s="insert into login values(?,?,?,?,?,?)";
			 pre=con.prepareStatement(s);
			
			pre.setString(1, name);
			pre.setString(2, pwd);
			pre.setInt(3, age);
			pre.setString(4, email);
			pre.setString(5, address);
			pre.setLong(6, phno);
			
			pre.executeUpdate();
			System.out.println(name+" Record Inserted successfully.....");
			
			 rs=pre.executeQuery("select * from login");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getLong(6));
			}
			
			PrintWriter pw=resp.getWriter();
			pw.println("<html><body><h1> "+name+" your Record Inserted Successfully..</h1></body></html>");
			
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
