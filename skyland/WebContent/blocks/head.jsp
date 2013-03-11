<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<div id="top">
    <div id="top_left"></div>
  
<div id="flash"><object classid="clsid:D27CDB6E-AE6D-11CF-96B8-444553540000" id="obj1" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,40,0" border="0" width="800" height="85">
				<param name="movie" value="imgs/images/21.swf">
				<param name="quality" value="High">
				<param name="wmode" value="transparent">
				<embed src="imgs/images/21.swf" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" name="obj1" width="800" height="85" quality="High" wmode="transparent"></object></div>
    <div id="top_ringht"><img border="0" src="imgs/images/top_right.gif" width="254" height="25"></div>    
  </div>
  <div id="navigation">
  	
  	<!-- logic:present -->
	<logic:present name="user" scope="session">
		<bean:write name="user" property="username" /> ，你好，欢迎来到天地汇商城，你已经成功登陆！
		<html:link href="javascript:document.loginoutForm.submit()" >
			<bean:message key="user.loginout"/>
		</html:link>
	</logic:present>
	
	<!-- logic:notPresent -->
	<logic:notPresent name="user" scope="session">
		你好，欢迎来到天地汇商城，想继续购物？[<a href="#" onClick="logindiv.style.display='';">请登录</a>]新用户？[<a href="register.htm">快速注册</a>]
	</logic:notPresent>
	<br/><br/>
	<a href="index.htm"><img border="0" src="imgs/images/menu-1.gif" width="108" height="45"></a><a href="goods_list.htm"><img border="0" src="imgs/images/menu-2.gif" width="75" height="45"></a><a href="shop_list.htm"><img border="0" src="imgs/images/menu-3.gif" width="90" height="45"></a><a href="news_list.htm"><img border="0" src="imgs/images/menu-4.gif" width="78" height="45"></a><a href="service.htm"><img border="0" src="imgs/images/menu-5.gif" width="105" height="45"></a><a href="usercenter.htm"><img border="0" src="imgs/images/menu-6.gif" width="98" height="45"></a><a href="contact.htm"><img border="0" src="imgs/images/menu-7.gif" width="92" height="45"></a>
</div>

<div id="logindiv" style="display:none">
	<html:form action="login.htm" method="post">
		<p>
			<bean:message key="user.username" />
			<html:text property="username" size="14" />
		</p>
		
		<p>
			<bean:message key="user.password" />
			<html:password property="password" size="14" />
		</p>
		
		<p>
			<!--  <a href="javascript:submit()" ><img border="0" src="imgs/images/login.gif" width="61" height="21"></a>&nbsp;-->
			<html:submit value="登录" />
			<a href=# onclick="logindiv.style.display='none';"><img  border="0" src="imgs/images/login_close.gif" width="61" height="21"></a>
		</p>
	
	</html:form>
</div>
<html:form action="loginout.htm" method="post"></html:form>