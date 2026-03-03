package jdbc_steps;

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
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
//			Here we going with jdbc_steps database name in connection to avoid repetation of database name
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps?user=root&&password=root");
			Statement st=con.createStatement();
//			boolean b=st.execute("insert into jdbc_steps.emp values(101,'Ram',10000)");
			st.executeUpdate("insert into emp values(102,'Sham',5000)");
			// excuteUpdate method return int value how many rows was inserted or updated
			System.out.println("Record inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
