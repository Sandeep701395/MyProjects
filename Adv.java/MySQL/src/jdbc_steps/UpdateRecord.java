package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord 
{
	public static void main(String[] args) 
	{
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?user=root&&password=root");
		Statement st=con.createStatement();
//		boolean b=st.execute("update emp set id=3 where name='rohit'");
//		System.out.println(b);
		boolean b=st.execute("update emp set name='dhoni',age=30,sal=10000 where id=3");
		System.out.println(b);
		System.out.println("Updated....");
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
