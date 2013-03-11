<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<div class="visited">
	  <div class="visited_top">
	  <span style="font-size: 11pt; font-weight: 700">我最近浏览过的商铺</span>
	  </div>
    
 	<logic:present name="shopVisited" scope="session">
		<logic:iterate id="t" name="shopVisited" type="jsp.ShopVisited">
  			<div class="visited_element">
  				<a href="shop_detail.htm?property=<bean:write name="t" property="num" />" ><img class="img_left" border="0" src="imgs/<bean:write name="t" property="pic" />" align="left" /></a>
				<b><a href="shop_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a><br/></b>
				<bean:write name="t" property="address" /><br/>
				<bean:write name="t" property="phone" />
  			</div>
		</logic:iterate>
	</logic:present>
	
	<logic:notPresent name="shopVisited" scope="session">
		<div class="visited_element">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;暂时没有浏览过的商铺
		</div>
	</logic:notPresent>
  </div>