<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<logic:present name="goods" scope="session">
	<div class="goods_pic">

            	<img border="0" src="imgs/<bean:write name="goods" property="pic" />" width="341" height="276">
                <b>
							<span style="font-size: 11pt">
				<img border="0" src="imgs/images/fdj_small.gif" width="24" height="23" align="absmiddle">同类商品</span></b>
          <div class="goods_other">
            	<a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
                <a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
                <a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
                <a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
       		 </div>
            <b>
						<span style="font-size: 11pt">
			<img border="0" src="imgs/images/fdj_small.gif" width="24" height="23" align="absmiddle" />相关商品</span></b>
            <div class="goods_other">
            	<a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
                <a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
                <a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
                <a href="#"><img src="imgs/cp_img/1_1.gif" width="70" height="70" hspace="0" vspace="0" border="0" /></a>
   		  </div>
                 
	</div>
            
    <div class="goods_info_r">
         		<img class="img_left" border="0" hspace="0" vspace="0" src="imgs/images/goods_infor_top.gif" width="384" height="12">
               <div class="goods_info_middle">
               <div class="goods_info_head">
               	<p style="margin-top:15px;">
               	<bean:write name="goods" property="name" />
               	</p>
               </div>
               <div class="goods_info_main">
               	<span>价格：<bean:write name="goods" property="price" /> 元</span><br>
				<span>规格：<bean:write name="goods" property="specification" /></span><br>
				<span>型号：<bean:write name="goods" property="type" /></span><br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
               </div>
               <div class="goods_info_bottom">
               <a href="add_cart.htm?property=<bean:write name="goods" property="num" />">
               		<img border="0" src="imgs/images/goods_infor_gm.gif" width="98" height="32">
               </a>
               <a href="#a">
               		<img border="0" src="imgs/images/goods_infor_tj.gif" width="98" height="32">
               </a>
               <a href="#a">
	               	<img border="0" src="imgs/images/goods_infor_sc.gif" width="98" height="32">
               </a>
               </div>
               </div>
               <img class="img_left" border="0" hspace="0" vspace="0" src="imgs/images/goods_infor_down.gif" width="384" height="12">
    </div>
	<div class="goods_info_text">
		<bean:write name="goods" property="detail" filter="false" />
   	</div>
   	<% session.removeAttribute("goods"); %>
</logic:present>