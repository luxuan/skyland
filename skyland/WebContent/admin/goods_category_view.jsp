<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<html><head>
<link href=admin.css type=text/css rel=stylesheet>
</head>
<center>

<table  border="0" cellpadding="0" cellspacing="1" class="table_">
  <tr height="20px">
    <td><a href="#"><font >类别名</font></a></td>
    <td><a href="#"><font >类别编码 </font> </a></td>
    <td><a href="#"><font >是否热销</font></a></td>
    <td><a href="#"><font >是否启用</font></a></td>
    <td><a href="#"><font >操作</font></a></td>
    <td><a href="#"><font >查看</font></a></td>
  </tr>
  
<logic:present name="adminGoodsCategoryList"  scope="session">  
  <logic:iterate id="t" name="adminGoodsCategoryList" type="beans.Category">  
   
  <tr height="20px">
    <td bgcolor="#FFFFFF"><bean:write name="t" property="name" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="num" /></td>
    <td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="isHot" value="true">是</logic:equal>
    	<logic:equal name="t" property="isHot" value="false">否</logic:equal>
    </td>
    <td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="isUsed" value="true">是</logic:equal>
    	<logic:equal name="t" property="isUsed" value="false">否</logic:equal>
    </td>
    <td bgcolor="#FFFFFF">
        <logic:equal name="t" property="isUsed" value="true"><a href="goodsCategory-select.do?method=setIsUsed&code=stop&property=<bean:write name="t" property="num" />">删除</a></logic:equal>
    	<logic:equal name="t" property="isUsed" value="false"><a href="goodsCategory-select.do?method=setIsUsed&code=start&property=<bean:write name="t" property="num" />">启用 </a></logic:equal>
	</td>
	<td bgcolor="#FFFFFF"><a href="goodsCategory-select.do?method=updateView&property=<bean:write name="t" property="num" />">查看</a></td>
  </tr>
  
  </logic:iterate>
  <% session.removeAttribute("adminGoodsCategoryList"); %>
</logic:present> 
 
  <tr>
    <td colspan="6">
    <%@ include file="ye.jsp"%>
    </td>
    </tr>
</table>

</center>
</html>

