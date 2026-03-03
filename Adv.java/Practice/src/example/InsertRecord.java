package example;

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
		Scanner sc=null;
		Connection con=null;
		PreparedStatement pre=null;
		try {
			con=DriverManager.getConnection(url, user, password);
			String s="insert into student (id,name,age,email,pwd) values(?,?,?,?,?)";
			pre=con.prepareStatement(s);
			
		      sc=new Scanner(System.in);
			System.out.println("Enter how many students you want:");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter id:");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter age");
				int age=sc.nextInt();
				System.out.println("Enter Email");
				String email=sc.next();
				System.out.println("Enter password");
				String pwd=sc.next();
				
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setInt(3, age);
				pre.setString(4, email);
				pre.setString(5, pwd);
				
				int i1=pre.executeUpdate();
				System.out.println(i1+"record Inserted");
			}
			System.out.println("Students records Inserted.......");
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
				if(sc!=null)
					sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
