<% 
/*
 *	designed:jzw
 *	coder:lius
 *	function:big sort view
*/
%>
<%@ page import="java.util.List,beans.Category,jsp.Controller,config.Hql" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<table border="0" cellpadding="0" cellspacing="0"><tr><td><div class=menuskin id=popmenu 
      onmouseover="clearhidemenu();highlightmenu(event,'on')" 
      onmouseout="highlightmenu(event,'off');dynamichide(event)" style="Z-index:100"></div></td></tr></table>
<div id="sort" >

<img border="0" hspace="0" vspace="0" src="imgs/images/spfl_top.gif" width="209" height="35" /><img border="0" hspace="0" vspace="0" src="imgs/images/spfl_mid.gif" width="209" height="13" />
<div id="sort_left" >

	<logic:iterate id="t" name="goodsCategoryList" type="Category">
	    <bean:write name="t" property="name" />
	    <logic:equal name="t" property="isHot" value="true">
	    	<img border="0" src="imgs/images/hotsale.gif" align="absmiddle">
	    </logic:equal>
	    <br/>
	</logic:iterate>
	
</div>
<img class="img_left" hspace="0" vspace="0" border="0" src="imgs/images/spfl_down.gif" width="209" height="22">
</div>