<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"  %>
<%@ page import="net.fckeditor.FCKeditor" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天地汇--汇天下精品</title>
<style type="text/css">


</style></head>

<body>
	<div align="center">

<table cellpadding="0" cellspacing="0" width="95%">
	<tr>
	  <td bgcolor="#8f8f8f" style="text-align:left"><img border="0" src="images/black_left.gif" width="3" height="29"></td>
		<td bgcolor="#8F8F8F" class="td2" id="helpinfo"  style="text-align:left">　添加新产品</td>
		<td bgcolor="#8f8f8f" style="text-align:right"><img border="0" src="images/black_right.gif" width="3" height="29"></td>
	</tr>

	</table>

</div>
<html:form  action="/admin/goods-update.do?method=add" method="post" enctype="multipart/form-data" >
	<div align="center">

<table class="add_table" cellpadding="5" cellspacing="0" width="95%" background="images/list_bj.gif" border="0">
	
	<tr>
		<td align="right">类型<font color="#FF0000">*</font></td>
		<td>
		<html:select property="categoryNum" size="1" >
		    <html:optionsCollection name="goodsCategoryList" label="name" value="num"/>
		</html:select>　　
		</td>
	</tr>
	<tr bgcolor="#FFFFFF">
		<td align="right">商品图片<font color="#FF0000">*</font></td>
		<td valign="middle" >
        <img src="../imgs/cp_img/1_8.gif" width="100" hspace="0" vspace="3" border="1" >
        <html:file property="pic" size="20"/>
  　　</td>
	</tr>
	
	<tr>
		<td align="right">商品名称<font color="#FF0000">*</font></td>
		<td><html:text property="name" size="30"/></td>
	</tr>
	<tr>
		<td align="right">商品价格<font color="#FF0000">*</font></td>
		<td><html:text property="price" size="30"/></td>
	</tr>
	<tr>
		<td align="right">品牌</td>
		<td>
		<html:select property="brandNum" size="1" >
		    <html:optionsCollection name="goodsBrandList" label="name" value="num"/>
		</html:select>
		</td>
	</tr>
	<tr>
		<td align="right">规格</td>
		<td><html:text property="specification" size="20"/>(可不填)　　</td>
	</tr>
	<tr>
		<td align="right">颜色</td>
		<td><html:text property="colour" size="30"/>(可不填)</td>
	</tr>
	<tr>
	  <td align="right">重量</td>
	  <td><html:text property="weight" size="20"/>(可不填)</td>
    </tr>
	<tr>
		<td align="right">出品公司</td>
		<td><html:text property="company" size="30"/></td>
	</tr>
	<tr>
	  <td align="right">出品日期</td>
	  <td><html:text property="produceTime" size="30"/></td>
    </tr>
	<tr>
		<td align="right">　</td>
		<td><html:checkbox value="true" property="isRecommend" />是否推荐　　
        	<html:checkbox value="true" property="isBargain" />是否特价
            <html:checkbox value="true" property="isHot" />是否热销
            <html:checkbox value="true" property="isFresh" />是否新鲜</td>
	</tr>
	<tr>
		<td align="right" valign="top" bgcolor="#FFFFFF">详细信息</td>
		<td bgcolor="#FFFFFF">
        <FCK:editor instanceName="detail" width="100%" height="500px">			
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
</html:form>
</body>

</html>