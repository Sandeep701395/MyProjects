package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertedRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			String s="insert into demo(did,dname,d_age,d_sal) values(?,?,?,?)";
			PreparedStatement pre=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Insert employees and enter number of employees");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter age");
				int age=sc.nextInt();
				System.out.println("Enter salary");
				int sal=sc.nextInt();
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setInt(3, age);
				pre.setInt(4, sal);
				
				
				int i1=pre.executeUpdate();
				System.out.println(i1);
				System.out.println("Inserted...");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
