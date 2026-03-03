package using_ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmailIdAndPassword 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pre=con.prepareStatement("select * from student where email=? and pwd=?");
			
			pre.setString(1, email);
			pre.setString(2, pwd);
			
			
			ResultSet rs=pre.executeQuery();
			if(rs.next())
			{
				System.out.println("login successful...");
			}
			else
			{
				System.out.println("Login failed...");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
