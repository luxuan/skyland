<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.List,jsp.admin.ShopListView" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href=admin.css type=text/css rel=stylesheet>
</head>


<center>
	<logic:present name="adminSuccessInfo"  scope="session">
		<bean:write name="adminSuccessInfo"  filter="false" />
		<% session.removeAttribute("adminSuccessInfo"); %>
	</logic:present>
</center>



