package using_Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/sample";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			String s="insert into emp(id,name,sal,age)values(?,?,?,?)";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how many employees you want:");
			int num=sc.nextInt();
			
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter id :");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter salary");
				double sal=sc.nextDouble();
				System.out.println("Enter age");
				int age=sc.nextInt();
				
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setDouble(3, sal);
				pre.setInt(4, age);
				
				int i1=pre.executeUpdate();
				System.out.println(i1);
			}
			System.out.println("Inserted....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
