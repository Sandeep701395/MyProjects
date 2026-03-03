package test;

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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			Statement st=con.createStatement();
//			boolean b=st.execute("insert into demo.student values(1,'Ram',56,9846032764)");
//			System.out.println(b);
//			boolean b1=st.execute("insert into demo.student values(2,'venky',90,7013956497)");
//			System.out.println(b1);
			boolean b2=st.execute("insert into demo.student values(3,'sikki',75,9398110479)");
			System.out.println(b2);
			System.out.println("Inserted ....");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
