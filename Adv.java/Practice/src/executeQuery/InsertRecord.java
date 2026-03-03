package executeQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord 
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/practice";
		String user="root";
		String password="root";
		
		Connection con=null;
		PreparedStatement pre=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=null;
		try {
			con=DriverManager.getConnection(url, user, password);
			String s="insert into emp values(?,?,?,?,?,?)";
			pre=con.prepareStatement(s);
			
			 sc=new Scanner(System.in);
			System.out.println("enter how many employees you want:");
			int num=sc.nextInt();
			
			for(int i=1;i<=num;i++)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter salary");
				double sal=sc.nextDouble();
				System.out.println("enter email");
				String email=sc.next();
				System.out.println("enter password");
				String pwd=sc.next();
				System.out.println("enter age");
				int age=sc.nextInt();
				
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setDouble(3, sal);
				pre.setString(4, email);
				pre.setString(5, pwd);
				pre.setInt(6, age);
				
				int i1=pre.executeUpdate();
				System.out.println(i1);
			}
			
			st=con.createStatement();
			rs=st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
				   rs.close();
				if(pre!=null)
					pre.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
				if(sc!=null)
					sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("------------------");
		}
		
	}

}
