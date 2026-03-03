package httpservlet_programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		long phno=Long.parseLong(req.getParameter("phno"));
		
//		System.out.println("UserName:"+name+" Password: "+ pwd+" Age: "+age+" Email :"+email+" Phno: "+phno);
		
		
		String url="jdbc:mysql://localhost:3306/http_servlet";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			String s="insert into http values(?,?,?,?,?)";
			pre=con.prepareStatement(s);
			
			pre.setString(1, name);
			pre.setString(2, pwd);
			pre.setInt(3, age);
			pre.setString(4, email);
			pre.setLong(5, phno);
			
			pre.executeUpdate();
			System.out.println(name+" Record Inserted successfully.....");
			
			st=con.createStatement();
			 rs=pre.executeQuery("select * from http");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5));
			}
			
			
			PrintWriter pw=resp.getWriter();
			pw.println("<html><body style='background-color:black; color:white;'><h1>"+name+ " your records succesfully inserted.....</h1></body></html>");
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
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
