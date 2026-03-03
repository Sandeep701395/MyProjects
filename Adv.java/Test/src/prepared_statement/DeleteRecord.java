package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			String s="delete from demo where did=?";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id ");
			int id=sc.nextInt();
			pre.setInt(1, id);
			
			pre.executeUpdate();
			System.out.println("Deleted....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
