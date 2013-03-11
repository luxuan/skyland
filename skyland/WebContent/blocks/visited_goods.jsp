<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<div class="visited">  
	<div class="visited_top">
		<span style="font-size: 11pt; font-weight: 700">我最近浏览过的商品</span>
	</div>
	
	<logic:present name="goodsVisited" scope="session">
		<logic:iterate id="t" name="goodsVisited" type="jsp.GoodsVisited">
			<div class="visited_element">
				<a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><img border="0" src="imgs/<bean:write name="t" property="pic" />"  align="left"></a>
				<b>
					<a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a>
					<br/><bean:write name="t" property="city"/>--<bean:write name="t" property="shopName"/>
				</b>
				<br/><bean:write name="t" property="price" />元
			</div>
		</logic:iterate>
	</logic:present>
	<logic:notPresent name="goodsVisited" scope="session">
		<div class="visited_element">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;暂时没有浏览过的商品
		</div>
	</logic:notPresent>
</div>