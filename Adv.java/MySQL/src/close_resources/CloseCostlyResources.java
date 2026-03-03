package close_resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseCostlyResources 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?user=root&&password=root");
			st=con.createStatement();
			int i=st.executeUpdate("insert into emp(id,name,sal,age)values(5,'gill',8000,22)");
			System.out.println(i);
			System.out.println("Inserted.....");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			
				try {
					if(st!=null)
					   st.close();
					if(con!=null)
						con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
