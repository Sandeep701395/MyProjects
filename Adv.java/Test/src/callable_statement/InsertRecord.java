package callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			String s="insert into demo(did,dname,d_age,d_sal)values(?,?,?,?)";
			CallableStatement c=con.prepareCall(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Insert no of employees");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter age");
				int age=sc.nextInt();
				System.out.println("Enter sal");
				int sal=sc.nextInt();
				c.setInt(1, id);
				c.setString(2,name);
				c.setInt(3,age);
				c.setInt(4,sal);
				
				c.executeUpdate();
				System.out.println("inserted.....");
				
				
				
			}
			System.out.println("inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
