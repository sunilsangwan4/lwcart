<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>vendorRegistration</title>
</head>
<body>

<h1> Seckcart</h1>


<h3>Register as a Vendor</h3>


<form action="/abc/Vendor_Registration" method="post">  
  <table style="width:25%">
  
  <tr>
    <td>Your name:</td>
    <td><input type="text" name="userName"/></td>
    
  </tr>
  <tr>
    <td>Email Id:</td>
    <td><input type="text" name="userEmail"/></td>
    
  </tr>
  <tr>
   <td>Password:</td>
    <td><input type="password" name="userPassword"/></td>
    
   
  </tr>

 <tr>
   <td>Confirm Password::</td>
    <td><input type="password" name="userConfirmPassword"/></td>
    
   
  </tr>

</table>
  
<br/><br/>  
<input type="submit" value="register"/>  
  
</form>  
<br/><br/>
<br/><br/>
<a href="vendorLogin.jsp">sign in</a>

</body>
</html>