<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user registration</title>

<style>
body  {
   color: #ffffff;
    background-image: url("./images/CoffeecreditShutterstockcom.jpg");
   
}
</style>

</head>
<body >
<h1 >lwseckcart</h1>
<h3>please register here</h3>

<form action="/abc/Registration" method="post">  
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
    <td><input type="password" name="userPass"/></td>
    
   
  </tr>

 <tr>
   <td>Confirm Password::</td>
    <td><input type="password" name="userPass1"/></td>
    
   
  </tr>


<tr>
   <td>Country: </td>
    <td><select name="userCountry">  
<option>India</option>  
<option>USA</option>  
<option>other</option>  
</select>  </td>
    
   
  </tr>



</table>



<input type="submit" value="register"/>  
  
</form>  
<br/><br/>
<br/><br/>

<form action="login.jsp">  
  

<input type="submit" value="sign in"/>  
  
</form>  
  <br/><br/>
  <br/><br/>
  <a href="vendorRegistration.jsp">register as vendor</a>
</body>
</html>