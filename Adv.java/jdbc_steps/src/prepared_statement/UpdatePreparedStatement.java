package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePreparedStatement 
{
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc_steps";
		String user="root";
		String pwd="root";
		
		try {
			Connection con= DriverManager.getConnection(url,user,pwd);
			String s="update emp set name=? where id=?";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the name to update");
			String name=sc.next();
			
			System.out.println("enter the id ");
			int id=sc.nextInt();
			
			pre.setString(1, name);
			pre.setInt(2, id);
			
			pre.executeUpdate();
			System.out.println("record updating successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
