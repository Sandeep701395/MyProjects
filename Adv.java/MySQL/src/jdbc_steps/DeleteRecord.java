package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord 
{
	public static void main(String[] args) 
	{
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?user=root&&password=root");
			Statement st=con.createStatement();
//		    boolean	b=st.execute("delete from emp where id=1");
//		    System.out.println(b);
//		    System.out.println("Deleted....");
		    boolean b1=st.execute("delete from emp where name='dhoni'");
		    System.out.println(b1);
		    System.out.println("Deleted..........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
