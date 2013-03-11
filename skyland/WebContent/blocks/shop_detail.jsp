<% 
/*
 *	designed:jzw
 *	coder:lius
 *	function:big sort view
*/
%>
<%@ page import="java.util.*,beans.Shop,jsp.*" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<div id="shop_info">
	<logic:present name="shop"  scope="session">
	
	<!-- !!!!should reset the size of picture!!! -->
	
	
	    <img src="imgs/<bean:write name="shop" property="pic" />" height="132" hspace="0" vspace="0" border="0"  class="img_float_l" />
	    <div class="shop_text" id="shop_info_left">							
			<b><span style="FONT-SIZE: 11pt"><bean:write name="shop" property="name" /></span><br></b>
			<bean:write name="shop" property="address"/><br>
			<bean:write name="shop" property="phone"/><br>
			QQ:<bean:write name="shop" property="qq"/>
	    </div>
	    <img src="imgs/<bean:write name="shop" property="license"/>" width="189" height="132" hspace="0" vspace="0" border="0" class="img_float_l">
	    <div class="shop_text" id="shop_info_right">							
			<span style="font-size: 11pt;align:center">
			[<bean:write name="shop" property="detail"/>]<br>
			</span>
			<a href="/infor_details.htm">促销</a><br>
			<a href="/infor_details.htm">鞋子</a><br>
			<a href="/infor_details.htm">阳光</a><br>
			<a href="/infor_details.htm">宇宙</a><br>
	    </div>
	    <% session.removeAttribute("shop"); %>   
	</logic:present>
</div>