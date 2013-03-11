<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天地汇--汇天下精品</title>
<style type="text/css">

table
{
	line-height:19px;}
</style></head>

<body>
	<div align="center">

<table cellpadding="0" cellspacing="0" width="95%">
	<tr>
	  <td bgcolor="#8f8f8f" style="text-align:left"><img border="0" src="images/black_left.gif" width="3" height="29"></td>
		<td bgcolor="#8F8F8F" class="td2" id="helpinfo"  style="text-align:left">添加商品大类</td>
		<td bgcolor="#8f8f8f" style="text-align:right"><img border="0" src="images/black_right.gif" width="3" height="29"></td>
	</tr>

	</table>

</div>

<html:form  action="/admin/goodsCategory-update.do?method=update" method="post">
<logic:present name="adminGoodsCategory"  scope="session">
<!-- different from goods_category_add.jsp -->
<html:hidden name="adminGoodsCategory" property="num" />
<!-- different from goods_category_add.jsp -->
<div align="center">

<table cellpadding="5" cellspacing="0" width="95%" background="images/list_bj.gif" border="0">
	
	<tr>
		<td align="right">大类名称<font color="#FF0000">*</font></td>
		<td><html:text property="name" name="adminGoodsCategory" size="30"/></td>
	</tr>

	<tr>
		<td align="right">是否热销<font color="#FF0000">*</font></td>
		<td><html:checkbox value="true" property="isHot" name="adminGoodsCategory"/></td>
	</tr>

	<tr>
		<td style="Background-color:#DADADA;height:3 px" colspan="2"></td>
	</tr>
	</table>

</div>
</logic:present>
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