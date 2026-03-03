package using_Callable_Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
			CallableStatement cs=con.prepareCall(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how many employees you want");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter Salary");
				double sal=sc.nextDouble();
				System.out.println("Enter age");
				int age=sc.nextInt();
				
				cs.setInt(1, id);
				cs.setString(2, name);
				cs.setDouble(3, sal);
				cs.setInt(4, age);
				
				int i1=cs.executeUpdate();
				System.out.println(i1+" record inserted..");
				
				
			}
			System.out.println("Inserted........");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
