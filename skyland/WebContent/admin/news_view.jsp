<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href=admin.css type=text/css rel=stylesheet></head>
<center>

<table  border="0" cellpadding="0" cellspacing="1" class="table_">
  <tr height="20px">
    <td><a href="#"><font >资讯名称</font></a></td>
    <td><a href="#"><font >资讯编号 </font> </a></td>
    <td><a href="#"><font >类型</font></a></td>
    <td><a href="#"><font >添加者</font></a></td>
    <td><a href="#"><font >添加时间</font></a></td>
    <td><a href="#"><font >操作</font></a></td>
    <td><a href="#"><font >查看</font></a></td>
  </tr>
<logic:present name="adminNewsList"  scope="session">  
  <logic:iterate id="t" name="adminNewsList" type="jsp.admin.NewsListView">  
  <tr height="20px">
    <td bgcolor="#FFFFFF"><bean:write name="t" property="title" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="num" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="categoryName" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="author" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="date" /></td>
    <td bgcolor="#FFFFFF">
        <logic:equal name="t" property="isUsed" value="true"><a href="news-select.do?method=setIsUsed&code=stop&property=<bean:write name="t" property="num" />">删除</a></logic:equal>
    	<logic:equal name="t" property="isUsed" value="false"><a href="news-select.do?method=setIsUsed&code=start&property=<bean:write name="t" property="num" />">启用 </a></logic:equal>
	</td>
	<td bgcolor="#FFFFFF"><a href="news-select.do?method=updateView&property=<bean:write name="t" property="num" />">查看</a></td>
	
  </tr>
  </logic:iterate>
  <% session.removeAttribute("adminNewsList"); %>
</logic:present>  
  <tr>
    <td colspan="7">
    <%@ include file="ye.jsp"%>
    </td>
    </tr>
</table>

</center>
</html>

