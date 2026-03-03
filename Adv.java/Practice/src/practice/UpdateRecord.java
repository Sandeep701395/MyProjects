package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord 
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
			String s="update emp set sal=?,age=? where id=?";
			 pre=con.prepareStatement(s);
			 
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter salary");
			 double sal=sc.nextDouble();
			 System.out.println("enter age");
			 int age=sc.nextInt();
			 System.out.println("enter id ");
			 int id=sc.nextInt();
			 
			 pre.setDouble(1, sal);
			 pre.setInt(2, age);
			 pre.setInt(3, id);
			 
			 int i=pre.executeUpdate();
			 System.out.println(i);
			 
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
			System.out.println("Updated ....");
		}
		
	}

}
