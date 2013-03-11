<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><bean:message key="admin.title.index" /></title>
<link href=main.css type=text/css rel=stylesheet>

<script language = "JavaScript" src = "blocks/Main.js"></script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
</head>
<frameset framespacing="0" border="false" rows="118,*" frameborder="0"> 
  <frame src="head.jsp" name="head" frameborder="0"  scrolling="no" noresize marginwidth="0" marginheight="0">
  <frameset  cols="158,*" >
  <frame src="left.jsp" name="left"  scrolling="yes" noresize   >
  <frame src="main.jsp" name="right"  scrolling="yes" noresize     target="_blank">
</frameset>
  <!--,91<frame src="bottom.jsp" name="bottom" frameborder="no" scrolling="no" >-->
</frameset><noframes></noframes>


</html>