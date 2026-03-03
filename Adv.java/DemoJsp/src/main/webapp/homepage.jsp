<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	HttpSession hs=request.getSession();
	String email=(String)hs.getAttribute("email");
	
	
	String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
	Connection con=null;
	PreparedStatement pre =null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url, user, password);
		pre=con.prepareStatement("select * from emp1 where email=?");
		pre.setString(1, email);
		
		ResultSet rs=pre.executeQuery();
		
%>
<h2>Employee Details</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Age</th>
    <th>Email</th>
    <th>Salary</th>
    <th>Location</th>
    <th>Phone</th>
</tr>

<%
while(rs.next()) {
%>
<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getInt("age") %></td>
    <td><%= rs.getString("email") %></td>
    <td><%= rs.getDouble("salary") %></td>
    <td><%= rs.getString("location") %></td>
    <td><%= rs.getLong("phno") %></td>
</tr>
<%
}
rs.close();
pre.close();
con.close();
%>
</table>

</body>
</html>