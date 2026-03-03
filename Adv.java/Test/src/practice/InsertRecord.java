package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&&password=root");
			Statement st=con.createStatement();
			int i=st.executeUpdate("insert into demo values(1,'raj',20,5000)");
			System.out.println(i);
			System.out.println("inserted...");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
