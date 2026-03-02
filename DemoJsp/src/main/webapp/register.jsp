<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
padding: 0;
margin: 0;
box-sizing: border-box;
}
body{
	height: 100vh;
	background-color: lightblue;
	display: flex;
	justify-content: center;
	align-items: center;
	
	
}
form{
	background: black;
	padding: 30px;
	border-radius: 15px;
	box-shadow: inset 0px 0px 10px red,inset 0px 0px 20px red,inset 0px 0px 30px red;
	
}
input{
	display: block;
	margin: 10px ;
	padding: 8px;
	border-radius:10px;
	outline:none;
	border:none;
	width: 250px;
	font-weight: bold;
	box-shadow: inset 0px 0px 10px greenyellow;
	
}
button {
	padding:5px 25px;
	margin-left: 80px;
	margin-top:10px;
	font-size:20px;
	border-radius:20px;
	color:white;
	border:none;
	outline:none;
	font-weight: bold;
	background-color: orange;
	
}
</style>
</head>
<body>
<form action="registration.jsp">
	<input type="text" placeholder="EmployeeID" name="id">
	<input type="text" placeholder="EnterName" name="name">
	<input type="text" placeholder="Enter age" name="age">
	<input type="text" placeholder="Enter mail" name="email">
	<input type="text" placeholder="Enter password" name="pwd">
	<input type="text" placeholder="salary" name="salary">
	<input type="text" placeholder="location" name="location">
	<input type="text" placeholder="phno" name="phno">
	<button>Submit</button>
</form>
</body>
</html>