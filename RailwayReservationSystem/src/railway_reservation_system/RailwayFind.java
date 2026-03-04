package railway_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RailwayFind 
{
	public static void find() {
		
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/railway_system",user="root",password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			 pre=con.prepareStatement("select * from railway where t_id=?");
			System.out.println("Enter Ticket Id");
			int tid=sc.nextInt();
			pre.setInt(1, tid);
			
			 rs=pre.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7));
			}
			else
			{
				System.out.println("Ticket Is not found....!");
			}
		} catch (ClassNotFoundException | SQLException e) {
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
