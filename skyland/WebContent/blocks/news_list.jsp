
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

      <img style="float:left;" border="0" src="imgs/images/infor_banner.jpg" width="735" height="134">
      <div class="sequence">
        <img hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
        	<div class="sequence_head">            
            </div>
            <img style="margin-right:10px;" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
            <img  hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
            <div class="sequence_element">
            <p style="width:600px;"></p>
            </div>
            <img style="margin-right:10px;" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
        </div>
        
<logic:present name="newsList" scope="session">
	<logic:iterate id="t" name="newsList" type="jsp.NewsList">  
        <div class="info_text">
        	<p class="p1">【<a href="news_list.htm?property=<bean:write name="t" property="categoryNum" />"><bean:write name="t" property="categoryTitle" /></a>】</p>
        	<p class="p2"><a href="news_detail.htm?property=<bean:write name="t" property="num" />" ><bean:write name="t" property="title" /></a></p>
        	<p class="p3"><bean:write name="t" property="time" /></p>
        </div>
	</logic:iterate>
        
        <div class="sequence">
        <img hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
        	<div class="sequence_head">            
            </div>
            <img style="margin-right:10px;" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
            <img  hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
            <div class="sequence_element">
            <p style="width:600px;"></p>
            </div>
            <img style="margin-right:10px;" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
        </div>
        <div class="info_bottom">
        
        <p>共<font color="#FF0000"><b>213</b></font>个主题 
					<font color="#FF0000">11</font>页 当前是第 <font color="#FF0000">
					1</font> 页 首页 上页 <a href="#a">下页</a> <a href="#a">尾页</a>
        </div>
	
	<% session.removeAttribute("newsList"); %>
</logic:present>