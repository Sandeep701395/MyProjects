package execute_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecord 
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/jdbc_steps";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
//			rs.next();
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
//			rs.next();
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
//			rs.next();
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
//			rs.next();
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
