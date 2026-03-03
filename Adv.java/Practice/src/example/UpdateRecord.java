package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		Scanner sc=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, user, password);
			String s="update student set name=?, age=?,pwd=? where id=?";
			pre=con.prepareStatement(s);
			
			sc=new Scanner(System.in);
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println("Enter password");
			String pwd=sc.next();
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			pre.setString(1, name);
			pre.setInt(2, age);
			pre.setString(3, pwd);
			pre.setInt(4, id);
			
			int i=pre.executeUpdate();
			System.out.println("Updated........");
			
			rs=pre.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				if(rs!=null)
				   rs.close();
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
