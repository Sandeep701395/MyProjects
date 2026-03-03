package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/practice";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		
		try {
			con=DriverManager.getConnection(url, user, password);
			String s="insert into emp(id,name,sal,email,pwd,age)values(?,?,?,?,?,?)";
			pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how many employees you want:");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("enter salary");
				double sal=sc.nextDouble();
				System.out.println("Enter email");
				String email=sc.next();
				System.out.println("Enter password");
				String pwd=sc.next();
				System.out.println("Enter age");
				int age=sc.nextInt();
				
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setDouble(3, sal);
				pre.setString(4, email);
				pre.setString(5, pwd);
				pre.setInt(6, age);
				
				int i1=pre.executeUpdate();
				System.out.println(i1);
			}
			System.out.println("Records Inserted.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				if(pre!=null)
				   pre.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("connection closed....");
		}
		
	}

}
