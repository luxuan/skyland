<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<link href=blocks/main.css type=text/css rel=stylesheet>
<link href=blocks/add.css type=text/css rel=stylesheet>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312" />


<logic:present name="user"  scope="session"> 
<div class="register">
   <html:form  action="/change-password-do.htm" method="post">   
   <html:errors property="loginRemind" />    	
  <div class="register_element">
           	  <div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;旧密码</p>
              </div>
              <div class="register_element_r">
              <html:text property="password" size="30"/>
              <html:errors property="password" />
              </div>
            </div>
        	<div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;新密码</p>
              </div>
                <div class="register_element_r">
              <html:text property="passwordNew" size="30"/>
              <html:errors property="passwordNew" />
                </div>
  </div>
            
  <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;确定密码</p>
                </div>
              <div class="register_element_r">
              <html:text property="passwordAgain" size="30"/>
              <html:errors property="passwordAgain" />
              </div>
            </div>
            <div class="register_element">
            	<div class="register_element_l">
                
                <p></p>
              </div>
                <div class="register_element_r">
                <input type="submit" value="     提交    " name="B1">&nbsp;&nbsp;
										<input type="reset" value="    重置    " name="B2">
                </div>
  </div>
  </html:form>
            
</div>
</logic:present>
