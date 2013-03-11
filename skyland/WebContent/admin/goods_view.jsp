<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href=admin.css type=text/css rel=stylesheet>
</head>


<center>

<table  border="0" cellpadding="0" cellspacing="1" class="table_">
  <tr height="20px">
    <td><a href="#"><font >商品名称</font></a></td>
    <td><a href="#"><font >商品编号 </font> </a></td>
    <td><a href="#"><font >规格</font></a></td>
    <td><a href="#"><font >价格</font></a></td>
    <td><a href="#"><font >是否使用</font></a></td>
    <td><a href="#"><font >是否热销</font></a></td>
    <td><a href="#"><font >是否特价</font></a></td>    
    <td><a href="#"><font >加入日期</font></a></td>
    <td><a href="#"><font >操作</font></a></td>
    <td><a href="#"><font >查看</font></a></td>
  </tr>
<logic:present name="adminGoodsList"  scope="session">  
  <logic:iterate id="t" name="adminGoodsList" type="beans.Goods">  
  <tr height="20px">
    <td bgcolor="#FFFFFF"><bean:write name="t" property="name" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="num" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="specification" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="price" /></td>
    <td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="isUsed" value="true">是</logic:equal>
    	<logic:equal name="t" property="isUsed" value="false">否</logic:equal>
    </td>
    <td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="isHot" value="true">是</logic:equal>
    	<logic:equal name="t" property="isHot" value="false">否</logic:equal>
    </td>
	<td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="isBargain" value="true">是</logic:equal>
    	<logic:equal name="t" property="isBargain" value="false">否</logic:equal>
    </td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="addTime" /></td>
    <td bgcolor="#FFFFFF">
        <logic:equal name="t" property="isUsed" value="true"><a href="goods-select.do?method=setIsUsed&code=stop&property=<bean:write name="t" property="num" />">删除</a></logic:equal>
    	<logic:equal name="t" property="isUsed" value="false"><a href="goods-select.do?method=setIsUsed&code=start&property=<bean:write name="t" property="num" />">启用 </a></logic:equal>
	</td>
	<td bgcolor="#FFFFFF"><a href="goods-select.do?method=updateView&property=<bean:write name="t" property="num" />">查看</a></td>
  </tr>
  </logic:iterate>
  <% session.removeAttribute("adminGoodsList"); %>
</logic:present>  

  <tr>
    <td colspan="8"><%@ include file="ye.jsp"%></td>
    </tr>
</table>

</center>



