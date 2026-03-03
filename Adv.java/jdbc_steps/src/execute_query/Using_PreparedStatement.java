package execute_query;

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
		String url="jdbc:mysql://localhost:3306/jdbc_steps";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			String s="select * from emp where id=?";
			PreparedStatement ps=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
