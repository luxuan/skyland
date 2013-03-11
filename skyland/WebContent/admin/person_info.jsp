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

<body ><table border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td align="center" height="30" valign="bottom">
		<div align="center">
			<table border="0" cellpadding="0" cellspacing="0" width="30%" class="menutable">
				<tr>
					<td><b>个人信息</b> →</td>
					<td valign="bottom">
					<img border="0" src="images/line_top.gif" width="1" height="12"></td>
					<td>修改信息</td>
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
	
<html:form  action="/admin/adminUpdate-do.htm?method=updateInfo" method="post">
<div align="center">

<table cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td bgcolor="#8f8f8f" style="text-align:left"><img border="0" src="images/black_left.gif" width="3" height="29"></td>
		<td bgcolor="#8F8F8F" class="td2"  style="text-align:left">修改个人信息</td>
		<td bgcolor="#8f8f8f" style="text-align:right"><img border="0" src="images/black_right.gif" width="3" height="29"></td>
	</tr>

	</table>

</div>
<div align="center">



<logic:present name="admin"  scope="session">
<table cellpadding="5" cellspacing="0" width="95%" background="images/list_bj.gif" border="0">
	<tr>
		<td align="right" height="28">用户名&nbsp;</td>
		<td><html:text property="adminName" size="11" name="admin" /></td>
	</tr>
	<tr>
		<td align="right" height="28">真实姓名<font color="#FF0000">*</font></td>
		<td>
			<html:text property="realName" size="11" name="admin" ></html:text>
		</td>
	</tr>
	<tr>
		<td align="right" height="28">联系电话&nbsp;</td>
		<td>
手机：<html:text property="mobil" size="11"  name="admin" />
</td>
	</tr>
	<tr>
		<td align="right" height="28">　</td>
		<td>
办公：<html:text property="officePhone" size="11" name="admin" /></td>
	</tr>
	<tr>
		<td align="right" height="28">　</td>
		<td>
住宅：<html:text property="homePhone" size="11" name="admin" /></td>
	</tr>
	<tr>
		<td align="right" height="28">Email&nbsp;</td>
		<td>
		<html:text property="email" size="11" name="admin" /></td>
	</tr>
	<tr>
		<td align="right" height="24" valign="top" bgcolor="#FFFFFF">备注&nbsp;</td>
		<td bgcolor="#FFFFFF">
			<html:textarea property="remark" name="admin" cols="57" rows="8" />
		</td>
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