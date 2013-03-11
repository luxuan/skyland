<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
			<table border="0" cellpadding="0" cellspacing="0" width="30%" id="table1" class="menutable">
				<tr>
					<td ><b>个人信息</b> →</td>
					<td ><img border="0" src="images/line_top.gif" width="1" height="12">修改密码</td>
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

<table cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td bgcolor="#8f8f8f" style="text-align:left"><img border="0" src="images/black_left.gif" width="3" height="29"></td>
		<td bgcolor="#8F8F8F" class="td2"  style="text-align:left">修改密码</td>
		<td bgcolor="#8f8f8f" style="text-align:right"><img border="0" src="images/black_right.gif" width="3" height="29"></td>
	</tr>

	</table>

</div>

<html:form  action="/admin/adminUpdate-do.htm?method=changePassword" method="post">
<div align="center">

<logic:present name="admin"  scope="session">
<table cellpadding="5" cellspacing="0" width="95%" background="images/list_bj.gif" border="0">
	
	<tr>
		<td width="18%" height="28" align="right">用户名</td>
		<td width="82%"><bean:write property="adminName" name="admin" /></td>
	</tr>
	<tr>
		<td align="right" height="28">原密码<font color="#FF0000">*</font></td>
		<td>
		<html:text property="password" size="20" /></td>
	</tr>
	<tr>
		<td align="right" height="28">新密码<font color="#FF0000">*</font></td>
		<td>
		<html:text property="newPassword" size="20" /></td>
	</tr>
	<tr>
		<td align="right" height="28">重复新密码<font color="#FF0000">*</font></td>
		<td>
		<html:text property="newPasswordAgain" size="20" /></td>
	</tr>

	<tr>
		<td style="Background-color:#DADADA;height:3 px" colspan="2"></td>
	</tr>
	</table>
</logic:present>

</div>

<div align="center">

<table border="0" cellpadding="5" cellspacing="3" width="95%">
	<tr>
		<td>
　　　　 <input name="" type="image" src="images/button_submit.gif" onclick="this.form.submit()" />
        <input name="" type="image" src="images/button_reset.gif" onclick="this.form.reset()" /></td>
	</tr>
</table>

</div>

</html:form>
</body>

</html>