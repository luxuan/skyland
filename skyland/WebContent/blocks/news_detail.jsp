
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<div class="info_details">

<logic:present name="news"  scope="session">

        	<p align="center">
				<span style="font-size: 11pt; font-weight: 700"><bean:write name="news" property="title" /></span>
			</p>
                
            <div class="infor_details_head">
            <img class="img_left"  hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
            <div class="infor_details_head_text">发表时间：<bean:write name="news" property="time" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 浏览次数：<bean:write name="news" property="viewCount" /></div>
          <img class="img_right" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
          </div>
          
                
        	<div class="info_details_text">
        	<br/>
        	<bean:write name="news" property="detail" filter="false" />
        	</div>
	<% session.removeAttribute("news"); %>          	
</logic:present>        	
        	
            <div class="infor_details_head">
            <img class="img_left"  hspace="0" vspace="0" border="0" src="imgs/images/table_bj_left.gif" width="5" height="26">
            <p style="margin-top:5px;text-align:center;"><a href="javascript:window.close();">关闭窗口</a></p>
          <img class="img_right" hspace="0" vspace="0" border="0" src="imgs/images/table_bj_right.gif" width="5" height="26">
          </div>
        </div>