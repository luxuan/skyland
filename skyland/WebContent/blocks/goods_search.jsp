
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<logic:present name="searchList" scope="session">
<div id="goods_info">

    	<logic:iterate id="t" name="searchList" type="jsp.GoodsSearch">  
		  <div class="goods_detail">
			  <div class="goods_top">
			  	<font color="#FFFFFF"><bean:write name="t" property="category" /></font>
			  </div>
			  
			  <div class="goods_middle">
			  	<a href="goods_detail.htm?property=<bean:write name="t" property="num" />"><img src="imgs/<bean:write name="t" property="pic" />" width="130" height="127" hspace="0" vspace="0" border="0"  /></a>
			  </div>
			  
			  <div class="goods_bottom">
			  	<a href="goods_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="name" /></a><br/>
				<bean:write name="t" property="caption" /><br/>
				<font color="#FF0000">现价仅需<bean:write name="t" property="price" />元</font>
			  </div>
		  </div>
  	</logic:iterate>
  	<% session.removeAttribute("searchList"); %>

</div>
<div class="ye">共 1 <a href="#a">2</a> 3 4 5 页</div>
</logic:present>