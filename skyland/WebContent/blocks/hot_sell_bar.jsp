<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<div class="left">
    <img class="img_left" src="imgs/images/phb_top.gif" width="209" height="42" hspace="0" vspace="0" border="0" />

	<logic:present name="hotList" scope="session">
		<logic:iterate id="t" name="hotList" type="jsp.GoodsVisited">
		    
			<div class="buy_goods">
				<div class="buy_img">
					<a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><img border="0" src="imgs/<bean:write name="t" property="pic" />"  align="left"></a>
				</div>
				<div class="buy_text">
					<b>
						<a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a>
						<br/><bean:write name="t" property="city"/>--<bean:write name="t" property="shopName"/>
					</b>
					<br/><bean:write name="t" property="price" />元
				</div>
    		</div>
		</logic:iterate>
		<% session.removeAttribute("hotList"); %>
	</logic:present>
 
    <img class="img_left" src="imgs/images/mxsp_down.gif" width="209" height="11" hspace="0" vspace="0" border="0" />
</div>