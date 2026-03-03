<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file="nav.jsp" %>
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
	font-family:sans-serif;
}

form{
	height: 100vh;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	background-color:lightblue;
	
}
#container{
	height: 30vh;
	width: 20%;
	background-color: lightgray;
	padding:10px;
	border-radius:10px;
	display: flex;
	flex-direction: column;
	justify-content:space-around;
	align-items: center;
	box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px, rgba(10, 37, 64, 0.35) 0px -2px 6px 0px inset;
	overflow: hidden;
}
h3{
	color: red;
	margin-bottom: 10px;
	font-size: 25px;
}
.numbers{
	padding: 5px 8px;
	border-radius: 10px;
	border: none;
	outline: none;
	
}
button{
	padding: 5px 35px;
	border-radius: 10px;
	border: none;
	outline: none;
	cursor: pointer;
	font-size: 15px;
	transition:all 3s;

}
button:hover {
	background-color:green;
	color: white; 
	transform:scale(1.1);
	
}

</style>
</head>
<body>

<form action="substraction.jsp">

<div id="container">
<h3>SubStraction</h3>
<input type="number" class="numbers" name="num1" placeholder="Enter number">
<input type="number" class="numbers" name="num2" placeholder="Enter number">
<button>Sub</button>
</div>
</form>

</body>
</html>