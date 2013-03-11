
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<div class="shop_goods">

    <logic:present name="bargainList" scope="session">
		<div class="shop_goods_img"><img class="img_left" border="0" hspace="0" vspace="0" src="imgs/images/tjzq.gif" width="674" height="47" /></div>
		<logic:iterate id="t" name="bargainList" type="jsp.GoodsBargain">  
		    <div class="goods">
			    <div class="shop_img_div">
			    	<a href="goods_detail.htm?property=<bean:write name="t" property="num" />"><img src="imgs/<bean:write name="t" property="pic" />" hspace="0" vspace="0" border="0" class="shop_img" /></a>
			    </div>
			    <div class="shop_text">
			    	<b><a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a></b><br/>
			    	原件<span style="font-size: 11pt"><bean:write name="t" property="originalPrice" /></span>元<br/>
			    	现价<font color="#FF0000" style="font-size: 11pt"><bean:write name="t" property="price" /></font>元
			    </div>
		    </div>

		</logic:iterate>
		<% session.removeAttribute("bargainList"); %>
	</logic:present>
</div>