package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUserInput_InsertingRecods 
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/jdbc_steps";
		String user="root";
		String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			String s="insert into emp(id,name,sal) values (?,?,?)";
			PreparedStatement pre=con.prepareStatement(s);
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter emp details n employees");
			int num=sc.nextInt();
			for(int i=1; i<=num; i++)
			{
				System.out.println("enter employee id: ");
				int id=sc.nextInt();
				System.out.println("enter employee name");
				String name=sc.next();
				System.out.println("enter employee sal");
				double sal=sc.nextDouble();
				
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setDouble(3, sal);
				
				pre.executeUpdate();
				System.out.println("records inserted successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
