<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<div class="left">
    <img class="img_left" src="imgs/images/mxsp_top.gif" width="209" height="42" hspace="0" vspace="0" border="0" />
    
    
    <logic:present name="cart" scope="session">
		<logic:iterate id="t" name="cart" type="jsp.CartGoods">    
		    <div class="buy_goods">
			    <div class="buy_img">
			    <a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><img src="imgs/<bean:write name="t" property="pic" />"  hspace="0" vspace="0" border="0"></a>
			    </div>
			    
			    <div class="buy_text">
			   	<b>
					<a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a>
					<br/><bean:write name="t" property="buyCount"/> 件
					<br/><bean:write name="t" property="city"/>--<bean:write name="t" property="shopName"/>
				</b>
				<br/>单价：<bean:write name="t" property="price" /> 元
			    </div>
		    </div>
		</logic:iterate>
		
		<div id="buy_total">
		    购物车内共<font color="#FF0000"><b><bean:write name="cartCount"/></b></font>件商品， 合计<font color="#FF0000"><b><bean:write name="cartTotalPrice"/></b></font>元
		</div>
		
		<div id="buy_jie">
	    	<a href="usercenter.htm?property=11"><img border="0" src="imgs/images/jz.gif" width="158" height="43"></a>
    	</div>
		</logic:present>
		<logic:notPresent name="cart" scope="session">
			<div id="buy_total">
			    购物车内暂时没有商品
			</div>
		</logic:notPresent>
		

    
    
    <img class="img_left" src="imgs/images/mxsp_down.gif" width="209" height="11" hspace="0" vspace="0" border="0">
    </div>