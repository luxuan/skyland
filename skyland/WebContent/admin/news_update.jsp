<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"  %>
<%@ page import="net.fckeditor.FCKeditor,beans.News" %>

<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>天地汇--汇天下精品</title>
</head>

<body>
<center>
	<div align="center">

<table cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td bgcolor="#8f8f8f" style="text-align:left"><img border="0" src="images/black_left.gif" width="3" height="29"></td>
		<td bgcolor="#8F8F8F" class="td2" id="helpinfo"  style="text-align:left">修改文章</td>
		<td bgcolor="#8f8f8f" style="text-align:right"><img border="0" src="images/black_right.gif" width="3" height="29"></td>
	</tr>

	</table>
	
</div>
<html:form  action="/admin/news-update.do?method=update" method="post" >

<logic:present name="adminNews"  scope="session">
<!-- different from shop_add.jsp -->
<html:hidden name="adminNews" property="num" />
<!-- different from shop_add.jsp -->

	<div align="center">
		<table cellpadding="5" cellspacing="0" width="95%" background="images/list_bj.gif" border="0">
			<tr>
				<td align="right">标题<font color="#FF0000">*</font></td>
				<td><html:text property="title" name="adminNews" size="50" /></td>
			</tr>
			<tr>

				<td align="right">所属类别<font color="#FF0000">*</font></td>
				<td>
					<html:select property="categoryNum" name="adminNews">
					    <html:optionsCollection name="newsCategoryList" label="name" value="num"/>
					</html:select>　　　　　
				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" colspan="2">
				<FCK:editor instanceName="editorContent" value='<%=((News)session.getAttribute("adminNews")).getDetail() %>' width="100%" height="500px">			
					<FCK:config SkinPath="skins/default/"/>
				</FCK:editor>
				</td>
			</tr>
			<tr>
				<td style="Background-color:#DADADA;height:3 px" colspan="2"></td>
			</tr>
		</table>
	</div>

	<div align="center">

<table border="0" cellpadding="5" cellspacing="3" width="95%">
	<tr>
		<td align="center">
        <input name="" type="image" src="images/button_submit.gif" onclick="this.form.submit()" />
        <input name="" type="image" src="images/button_reset.gif" onclick="this.form.reset()" />
　　　　　　　　<!--<a href="#"><img border="0" src="images/button_submit.gif"></a>　<a href="#"><img border="0" src="images/button_reset.gif"></a>--></td>
	</tr>
</table>

</div>
</logic:present>
</html:form>
</center>
</body>

</html>