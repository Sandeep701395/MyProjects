package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class Loaded And Rigistered...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			System.out.println("Connection Established...");
//			System.out.println(con);
			Statement stmt=con.createStatement();
			System.out.println("platform Created...");
//			4th step
			boolean b=stmt.execute("create table jdbc_steps.emp(id int,name varchar(20),sal double)");
			System.out.println(b);
			System.out.println("Table is Created...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
