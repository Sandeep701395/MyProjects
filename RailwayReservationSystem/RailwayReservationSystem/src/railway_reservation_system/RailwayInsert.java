package railway_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RailwayInsert 
{
	public static void insert() 
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/railway_system",user="root",password="root";
		Connection con=null;
		PreparedStatement pre=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, password);
			 pre=con.prepareStatement("insert into railway values(?,?,?,?,?,?,?)");
			System.out.println("Enter how many tickets you want: ");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter Ticket ID:");
				int tid=sc.nextInt();
				System.out.println("Enter Passenger Name:");
				String pname=sc.next();
				System.out.println("Enter Source");
				String source=sc.next();
				System.out.println("Enter Destination:");
				String destination=sc.next();
				System.out.println("Enter Train Name:");
				String trainName=sc.next();
				System.out.println("Enter SeatNO");
				int seatNo=sc.nextInt();
				System.out.println("Enter Travel Date");
				String travelDate=sc.next();
				
				pre.setInt(1, tid);
				pre.setString(2, pname);
				pre.setString(3, source);
				pre.setString(4, destination);
				pre.setString(5, trainName);
				pre.setInt(6, seatNo);
				pre.setString(7, travelDate);
				
				int i1=pre.executeUpdate();
			}
			System.out.println("Ticket Booked Successfully!!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(pre!=null)
				{
					pre.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
