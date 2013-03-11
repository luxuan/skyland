<%@ page import="java.util.List,jsp.*,config.Hql,beans.News" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<div id="info">
  <a href="news_list.htm"><img src="imgs/images/info_top.gif" width="209" height="37" hspace="0" vspace="0" border="0" class="img_left"></a>
    <div id="info_text">
    <%
    	List<News> listNews=Controller.getList(Hql.NewsItem);
    		pageContext.setAttribute("listNews",listNews);
    %>
	<ul>
		<logic:iterate id="t" name="listNews" type="News">
			<li><a href="news_detail.htm?property=<bean:write name="t" property="num" />">
		    <bean:write name="t" property="title" />
		    </a></li>
		</logic:iterate>
    </ul>									
                        
    </div>
    <img src="imgs/images/info_down.gif" width="209" height="9" hspace="0" vspace="0" border="0" class="img_left">
  </div>