<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="beans.User" %>    
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<link href=admin.css type=text/css rel=stylesheet>
</head>
<center>

<table  border="0" cellpadding="0" cellspacing="1" class="table_">
  <tr height="20px">
    <td><a href="#"><font >ID</font></a></td>
    <td><a href="#"><font >用户名 </font> </a></td>
    <td><a href="#"><font >分数</font></a></td>
    <td><a href="#"><font >真实姓名</font></a></td>
    <td><a href="#"><font >E-mail</font></a></td>
    <td><a href="#"><font >是否启用</font></a></td>
    <td><a href="#"><font >是否禁言</font></a></td>
    <td><a href="#"><font >上次登录</font></a></td>
    <td><a href="#"><font >操作</font></a></td>
  </tr>
<logic:present name="userList"  scope="session">  
  <logic:iterate id="t" name="userList" type="User">
  <tr height="20px">
    <td bgcolor="#FFFFFF"><bean:write name="t" property="num" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="username" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="score" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="realName" /></td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="email" /></td>
    <td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="useable" value="true">是</logic:equal>
    	<logic:equal name="t" property="useable" value="false">否</logic:equal>
    </td>
    <td bgcolor="#FFFFFF">
    	<logic:equal name="t" property="speakable" value="true">否</logic:equal>
    	<logic:equal name="t" property="speakable" value="false">是</logic:equal>
    </td>
    <td bgcolor="#FFFFFF"><bean:write name="t" property="lastLoginTime" /></td>
    <td bgcolor="#FFFFFF">
        <logic:equal name="t" property="useable" value="true"><a href="user_manage.do?method=change&code=1&property=<bean:write name="t" property="num" />">删除</a></logic:equal>
    	<logic:equal name="t" property="useable" value="false"><a href="user_manage.do?method=change&code=2&property=<bean:write name="t" property="num" />">启用用户 </a></logic:equal>
		<logic:equal name="t" property="speakable" value="true"><a href="user_manage.do?method=change&code=3&property=<bean:write name="t" property="num" />">禁言 </a></logic:equal>
    	<logic:equal name="t" property="speakable" value="false"><a href="user_manage.do?method=change&code=4&property=<bean:write name="t" property="num" />">启用言论 </a></logic:equal>
    </td>
  </tr>
  </logic:iterate>
</logic:present>  
  <tr>
    <td colspan="9">
    <%@ include file="ye.jsp"%>
    </td>
    </tr>
</table>

</center>
