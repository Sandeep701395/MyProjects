package close_resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CloseResultSet 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/sample";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			String s="select * from emp";
			pre=con.prepareStatement(s);
			rs=pre.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "
								   +rs.getString(2)+" "
								   +rs.getDouble(3)+" "
								   +rs.getInt(4));
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
				{
					pre.close();
				}
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
