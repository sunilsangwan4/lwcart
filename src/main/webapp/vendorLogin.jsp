<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/abc/vendorLogin" method="post">  
  
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

<p>   <a href="vendorRegistration.jsp">register as vendor</a>  </p>

</body>
</html>