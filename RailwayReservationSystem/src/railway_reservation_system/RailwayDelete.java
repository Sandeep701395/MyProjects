package railway_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RailwayDelete 
{
	public static void cancel()
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/railway_system",user="root",password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			 pre=con.prepareStatement("delete from railway where t_id=?");
			System.out.println("Enter ticket ID:");
			int tid=sc.nextInt();
			pre.setInt(1, tid);
			int i=pre.executeUpdate();
			if(i>0)
			{
				System.out.println("Ticket is Deleted!!!");
			}
			else
			{
				System.out.println("Ticket Is Not Found!!!!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
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
