package using_ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidation 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.next();
		System.out.println("Enter password");
		String pwd=sc.next();
		
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			 con=DriverManager.getConnection(url, user, password);
			String s="select * from student where email=? and pwd=?";
			 pre=con.prepareStatement(s);
			
			pre.setString(1, email);
			pre.setString(2, pwd);
			
			 rs=pre.executeQuery();
			if(rs.next())
			{
				System.out.println("Login Successful....");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			else
			{
				System.out.println("Invalid Login.....");
			}
			
		} catch (SQLException e) {
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
