package railway_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RailwayUpdate 
{
	public static void update() 
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/railway_system",user="root",password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			 pre=con.prepareStatement("update railway set destination=? where t_id=?");
			System.out.println("Enter New Destination ");
			String dest=sc.next();
			System.out.println("Enter Ticket ID");
			int tid=sc.nextInt();
			pre.setString(1, dest);
			pre.setInt(2, tid);
			int i=pre.executeUpdate();
			if(i>0)
			{
				System.out.println("Destination Updated!!!!");
			}
			else
			{
				System.out.println("Ticket Not Found!!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
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
		}
		
	}

}
