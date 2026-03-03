package executeQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/practice";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=null;
		try {
			con=DriverManager.getConnection(url, user, password);
			String s="delete from emp where id=?";
			pre=con.prepareStatement(s);
			
			 sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			pre.setInt(1, id);
			int i=pre.executeUpdate();
			System.out.println(i);
			
			st=con.createStatement();
			rs=st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
				   rs.close();
				if(st!=null)
					st.close();
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
