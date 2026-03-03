package using_ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Using_PreparedStatement 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/sample";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pre=con.prepareStatement("select * from emp where id=?");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			pre.setInt(1, id);
			ResultSet rs=pre.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
