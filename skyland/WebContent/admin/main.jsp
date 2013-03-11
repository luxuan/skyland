<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="admin.css" rel="stylesheet" type="text/css">
<title>天地汇--汇天下精品</title>

<style type="text/css">

</style>
</head>

<body >

<table border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td align="center" height="30" valign="bottom">
		<div align="center">
			<table border="0" cellpadding="0" cellspacing="0" width="30%" class="menutable">
				<tr>
					<td><b>欢迎登陆</b> →</td>
					<td valign="bottom">
					<img border="0" src="images/line_top.gif" width="1" height="12"></td>
					<td>
<!-- adminName -->					
					<logic:present name="admin"  scope="session">
						<bean:write property="adminName" name="admin" />
					</logic:present>
					
					</td>
					<td valign="bottom">
					<img border="0" src="images/line_top.gif" width="1" height="12"></td>
				</tr>
			</table>
		</div>
		</td>
	</tr>
	<tr>
		<td bgcolor="#DADADA" height="1"></td>
	</tr>
		<tr>
		<td  height="20">　</td>
	</tr>
</table>
    
    <div align="center">

<table class="datatable" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="#8f8f8f" style="text-align:left">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2">　</td>
		<td class="td2" bgcolor="#8f8f8f" style="text-align:right">　</td>
	</tr>

	<tr>
		<td colspan="10">有3新留言等待回复 →<a href="message_manage.jsp" target="right"> <font color="#808080">查看</font></a ></td>
	</tr>

	<tr>
		<td colspan="10">有4新用户等待审核 →<a href="user_manage.jsp" target="right"> <font color="#808080">查看</font></a ></td>
	</tr>

	<tr>
		<td colspan="10"><br>
　</td>
	</tr>

	<tr>
		<td style="Background-color:#DADADA;height:3 px" colspan="10">　</td>
	</tr>
	</table>

</div>

	<div align="center">

<table border="0" cellpadding="5" id="table1" cellspacing="3" width="95%">
	<tr>
		<td align="right">　</td>
		<td>
		　</td>
		<td>
		　</td>
		<td align="center">
		　</td>
		<td align="center">
		　</td>
	</tr>
</table>

</div>
</body>

</html>