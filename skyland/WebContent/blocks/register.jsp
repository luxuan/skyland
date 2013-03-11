<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
  <div class="user_center">
        	<div class="user_head_l">
            <img class="img_left" border="0" src="imgs/images/register_c.gif" width="98" height="22"></div>
            <div class="user_head_r">
            <p></p>
            </div>
        </div>
        
       	<logic:present name="registerFail" scope="session">
       		<bean:message key="error.register.fail"/>
       		<% session.removeAttribute("registerFail"); %>
       	</logic:present>
       	
      	<div class="register">

        <html:form  action="register-do.htm" method="post">

        	<div class="register_element">
           	  <div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.username" /></p>
              </div>
              <div class="register_element_r">
              	<html:text property="username" size="25"/>　
              	<html:errors property="username" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.password" /></p>
                </div>
                <div class="register_element_r">
                <html:text property="password" size="25" />　
                <html:errors property="password"/>
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.passwordAgain" /></p>
                </div>
                <div class="register_element_r">
                <html:text property="passwordAgain" size="25" />　　
                <html:errors property="passwordAgain"/>
                </div>
            </div>
 
             <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.realName" /></p>
                </div>
                <div class="register_element_r">
                	<html:text property="realName" size="25" />　
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.phone" /></p>
                </div>
                <div class="register_element_r">
                	<html:text property="phone" size="25" />　
                	<html:errors property="phone" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.email" /></p>
                </div>
                <div class="register_element_r">
                <html:text property="email" size="25" />　
                	<html:errors property="email" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.zip" /></p>
                </div>
                <div class="register_element_r">
                	<html:text property="zip" size="25" />　
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.address" /></p>
                </div>
                <div class="register_element_r">
                    <html:text property="address" size="48" />
               </div>
            </div>
            
            <div class="register_element">
           	  <div class="register_textbox_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p><bean:message key="register.remark" /></p>
                </div>
                <div class="register_element_r">
                	<html:textarea property="remark" cols="57" rows="8" />　
               </div>
             </div>
             
            <div class="register_element">
            	<div class="register_element_l">
                
                <p></p>
                </div>
                <div class="register_element_r">
                	<html:submit style="width:80px;" >
                		<bean:message key="register.submit" />
                	</html:submit>
                	&nbsp;&nbsp;
                	<html:reset  style="width:80px;" >
                		<bean:message key="register.reset" />
                	</html:reset>
                </div>
            </div>
            
            <html:errors property="all" />
                        
 	</html:form>           
        </div>