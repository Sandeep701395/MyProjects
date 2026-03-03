package using_Callable_Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
			String s="update emp set name=?,sal=? where id=?";
			CallableStatement cs=con.prepareCall(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name ");
			String name=sc.next();
			System.out.println("Enter sal");
			double sal=sc.nextDouble();
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			cs.setString(1, name);
			cs.setDouble(2, sal);
			cs.setInt(3, id);
			
			int i=cs.executeUpdate();
			System.out.println(i);
			System.out.println("Updated.......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
