<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userlogin</title>
</head>
<body>
<h1>lwseckcart</h1>
<h3>user login here!</h3>
<br/>

<form action="/abc/login" method="post"> 
 <table style="width:25%">
  
 
  <tr>
    <td>Email Id:</td>
    <td><input type="text" name="userEmail"/></td>
    
  </tr>
  <tr>
   <td>Password:</td>
    <td><input type="password" name="userPassword"/></td>
    
   
  </tr>
</table>

<input type="submit" value="login"/>  
</form>

<br/>
<br/>
 <form action="index.jsp">  
 
<input type="submit" value="create user"/>  
</form>


</body>
</html>