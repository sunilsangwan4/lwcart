<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<%@include file="css.jsp" %>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
<%@include file="_mainheader.jsp" %>
  <!-- Left side column. contains the logo and sidebar -->
  <%@include file="_leftSideBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
 
    
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.1
    </div>
    <strong>Copyright &copy; 2017-2018 <a href="https://adminlte.io">lwseckcart</a>.</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
  <%@include file="_layoutControl.jsp" %>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
<%@include file="js.jsp" %>
</body>
</html>