package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&&password=root");
			Statement st=con.createStatement();
			int i=st.executeUpdate("update student set sname='Nandi' where sid=3");
			System.out.println(i);
			
			int i1=st.executeUpdate("update student set sname='Virat',marks=40,contact=9959392305 where sname='venky'");
			System.out.println(i1);
			System.out.println("Record Updated......");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
