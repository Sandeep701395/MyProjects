package using_Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/sample";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			String s="update emp set name=? where id=?";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name to update:");
			String name=sc.next();
			System.out.println("Enter id ");
			int id=sc.nextInt();
			
			pre.setString(1, name);
			pre.setInt(2, id);
			
			int i=pre.executeUpdate();
			System.out.println(i);
			System.out.println("Updated......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
