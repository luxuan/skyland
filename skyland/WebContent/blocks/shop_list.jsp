
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<div class="shops_">
        	
				<p align="left">寻找您所在地区的商店：<select size="1" name="D1">
							<option>浙江省</option></select><select size="1" name="D2">
							<option>杭州市</option></select>&nbsp;&nbsp;</p>
             <div class="sequence">
        <img hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
        	<div class="sequence_head">
            <p>排序方式 &gt;&gt;</p>
            </div>
            <img style="margin-right:10px;" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
            <img  hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
            <div class="sequence_element">
            <a href="#a"><p>好评度</p></a>
            
            
            <a href="#a"><p>商品数量</p></a>
            
            
            <a href="#a"><p>成交量</p></a>
            
            
            <a href="#a"><p>商店名称</p></a>
            </div>
            <img style="margin-right:10px;" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
        </div>
        
        
 	<logic:present name="shopList" scope="session">
		<logic:iterate id="t" name="shopList" type="beans.Shop">  
			<div  class="shop_element">
				<div class="shop_element_head">
					<p><font color="#FFFFFF"><b><span style="font-size: 11pt">
						<bean:write name="t" property="name" />
					</span></b></font></p>
				</div>
				<a href="shop_detail.htm?property=<bean:write name="t" property="num" />" ><img width="150" height="114" border="0" src="imgs/<bean:write name="t" property="pic" />" /></a>
				<p class="shop_element_text"><b><span style="font-size: 11pt">
					<a href="shop_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a>
				</span><br/></b>				
					<bean:write name="t" property="address" /><br/>
					<bean:write name="t" property="phone" />
				</p>
			</div>
        </logic:iterate>
        <% session.removeAttribute("shopList"); %>
	</logic:present>
        
        
         
        <div class="ye">共 1 <a href="#a">2</a> 3 4 5 页</div>
        
      </div>