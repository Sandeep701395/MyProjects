package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordUsingPreparedStatement 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/jdbc_steps";
		String user="root";
		String password="root";
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			String s="delete from emp where id=?";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Delete  record from table");
			System.out.println("Enter id ");
			int id=sc.nextInt();
			pre.setInt(1, id);
			pre.executeUpdate();
			System.out.println("Detele record successfully.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
