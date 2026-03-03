package batch_Execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecution 
{
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		
		String q1="insert into student values(4,'ranga',25,'ranga@gmail.com','5555')";
		String q2="update student set age=21,pwd='9999' where sid=1";
		String q3="delete from student where sid=4";
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			
			st.executeBatch();
			
			System.out.println("Batch Executed........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
