package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			String s="update demo set did=? where dname=?";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			
			pre.setInt(1, id);
			pre.setString(2, name);
			
			pre.executeUpdate();
			System.out.println("Updated....");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
