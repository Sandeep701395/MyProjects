package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_steps 
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			 st=con.createStatement();
			
			boolean b=st.execute("create table practice.emp(id int,name varchar(20),sal double,email varchar(20),pwd varchar(20),age int)");
			System.out.println(b);
			System.out.println("Table is Created.....");
			
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
