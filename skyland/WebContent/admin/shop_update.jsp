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
		<td bgcolor="#8F8F8F" class="td2" id="helpinfo"  style="text-align:left">　添加新商铺</td>
		<td bgcolor="#8f8f8f" style="text-align:right"><img border="0" src="images/black_right.gif" width="3" height="29"></td>
	</tr>

	</table>

</div>

<html:form  action="/admin/shopUpdate-do.htm?method=update" method="post" enctype="multipart/form-data" >

<logic:present name="adminShopView"  scope="session">
<!-- different from shop_add.jsp -->
<html:hidden name="adminShopView" property="num" />
<!-- different from shop_add.jsp -->
<div align="center">
<table cellpadding="5" cellspacing="0" width="95%" background="images/list_bj.gif" border="0">
	
	<tr>
		<td align="right"><bean:message key="admin.shop.add.name" /><font color="#FF0000">*</font></td>
		<td><html:text property="shopName" name="adminShopView" size="30"/></td>
	</tr>
	<tr bgcolor="#FFFFFF">
		<td align="right"><bean:message key="admin.shop.add.pic" /><font color="#FF0000">*</font></td>
		<td valign="middle" >
        <img src="../imgs/cp_img/dm.jpg" width="100" hspace="0" vspace="0" border="0" align="absbottom" >
        <html:file property="pic" name="adminShopView" size="30"/>
  　　</td>
	</tr>
	
	<tr>
		<td align="right" bgcolor="#FFFFFF"><bean:message key="admin.shop.add.license" /><font color="#FF0000">*</font></td>
		<td bgcolor="#FFFFFF"><img src="../imgs/cp_img/yyzz.jpg" width="100" hspace="0" vspace="0" border="0" align="absbottom" >
          <html:file property="license" name="adminShopView" size="30"/>
　</td>
	</tr>
	<tr>
		<td align="right"><bean:message key="admin.shop.add.city" /><font color="#FF0000">*</font></td>

		<td><font color="#000000">省</font>
          <select name="select">
            <option>浙江省 </option>
          </select>
          <font color="#000000">市</font>
          
			<html:select property="cityNum" name="adminShopView" >
			    <html:optionsCollection name="cityList" label="name" value="num"/>
			</html:select>　　
		</td>

	</tr>
	<tr>
		<td align="right"><font color="#000000"><bean:message key="admin.shop.add.realName" /></font><font color="#FF0000">*</font></td>
		<td><html:text property="realName" name="adminShopView" size="30"/></td>
	</tr>
	<tr>
	  <td align="right"><font color="#000000"><bean:message key="admin.shop.add.ID" /></font><font color="#FF0000">*</font></td>
	  <td><html:text property="ID" name="adminShopView" size="30"/></td>
    </tr>
    <tr>
	  <td align="right"><font color="#000000"><bean:message key="admin.shop.add.adminName" /></font><font color="#FF0000">*</font></td>
	  <td><html:text property="adminName" name="adminShopView" size="30"/></td>
    </tr>
	<tr>
	  <td align="right"><font color="#000000"><bean:message key="admin.shop.add.password" /></font><font color="#FF0000">*</font></td>
	  <td><html:text property="password" name="adminShopView" size="30"/></td>
    </tr>
	<tr>
	  <td align="right"><font color="#000000"><bean:message key="admin.shop.add.address" /></font><font color="#FF0000">*</font></td>
	  <td><html:text property="address" name="adminShopView" size="30"/></td>
    </tr>

	<tr>
		<td align="right"><font color="#000000"><bean:message key="admin.shop.add.phone" /></font><font color="#FF0000">*</font></td>
		<td><html:text property="phone" name="adminShopView" size="30"/></td>
	</tr>
	<tr>
		<td align="right"><font color="#000000"><bean:message key="admin.shop.add.qq" /></font></td>
		<td><html:text property="qq" name="adminShopView" size="30"/></td>
	</tr>
	<tr>
	  <td align="right"><font color="#000000"><bean:message key="admin.shop.add.email" /></font></td>
	  <td><html:text property="email" name="adminShopView" size="30"/></td>
    </tr>
	<tr>
		<td align="right"><font color="#000000"><bean:message key="admin.shop.add.fax" /></font></td>
		<td><html:text property="fax" name="adminShopView" size="30"/></td>
	</tr>
	<tr>
		<td align="right" valign="top" bgcolor="#FFFFFF"><bean:message key="admin.shop.add.detail" /></td>
		<td bgcolor="#FFFFFF"><html:textarea property="detail" name="adminShopView" rows="13" cols="64"/></td>
	</tr>
	<tr>
		<td style="Background-color:#DADADA;height:3 px" colspan="2"></td>
	</tr>
	</table>

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

</logic:present>
</html:form>

</body>

</html>