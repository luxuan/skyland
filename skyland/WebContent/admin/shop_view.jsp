<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="jsp.admin.ShopListView" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href=admin.css type=text/css rel=stylesheet>
</head>
<body>
<logic:present name="adminShopList"  scope="session">

<center>
<table  border="0" cellpadding="0" cellspacing="1" class="table_">
  <tr height="20px">
    <td><a href="#"><font >商店名称</font></a></td>
    <td><a href="#"><font >商店编号 </font> </a></td>
    <td><a href="#"><font >店主</font></a></td>
    <td><a href="#"><font >现存商品数量</font></a></td>
    <td><a href="#"><font >卖出商品数量</font></a></td>
    <td><a href="#"><font >电话</font></a></td>    
    <td><a href="#"><font >e-mail</font></a></td>
    <td><a href="#"><font >操作</font></a></td>
  </tr>
  <logic:iterate id="t" name="adminShopList" type="ShopListView">
  <tr height="20px">
    <td bgcolor="#FFFFFF"><bean:write name="t" property="shopName" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="num" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="adminName" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="goodsCount" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="soldCount" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="phone" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="email" /></td>
    <td bgcolor="#FFFFFF">
    <html:form  action="/admin/shopDelete-do.htm?method=setIsUsed" method="post" >
    	<html:hidden name="t" property="num" />
    	<html:submit value="删除" />
    </html:form>
    
    <html:form  action="/admin/shopUpdateView-do.htm?method=updateView" method="post" >
    	<html:hidden name="t" property="num" />
    	<html:submit value="查看" />
    </html:form>
  </tr>
  </logic:iterate>

  <tr>
    <td colspan="8"><%@ include file="ye.jsp"%></td>
    </tr>
</table>

</center>
<% session.removeAttribute("adminShopList"); %>
</logic:present>
</body>
</html>


