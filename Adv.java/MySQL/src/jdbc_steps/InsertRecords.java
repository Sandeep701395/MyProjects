package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords 
{
	public static void main(String[] args) 
	{
		try {
		Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?user=root&&password=root");
		Statement st=con.createStatement();
//		boolean b=st.execute("insert into emp(id,name,sal,age)values(1,'virat',5000,25)");
//		System.out.println(b);
//		System.out.println("Inserted ....");
		boolean b1=st.execute("insert into emp(id,name,sal,age)values(2,'rohit',7000,28)");
		System.out.println(b1);
		System.out.println("Inserted.......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
