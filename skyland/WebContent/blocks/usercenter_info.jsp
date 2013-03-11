<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>


<link href=blocks/main.css type=text/css rel=stylesheet>
<link href=blocks/add.css type=text/css rel=stylesheet>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312" />

<logic:present name="user"  scope="session"> 
  <div class="register">
  <html:form  action="/update-do.htm" method="post">
        	
        	<div class="register_element">
           	  <div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>用户名</p>
              </div>
              <div class="register_element_r">
                <font size="+2"><html:text property="username" name="user" size="30"/></font>
                <html:errors property="username" />
                </div>
            </div>

       	  <div class="register_element">
           	  <div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>积分</p>
                </div>
                <div class="register_element_r">
                <font size="+2"><bean:write name="user" property="score" /></font>
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>真实姓名</p>
                </div>
                <div class="register_element_r">
                	<html:text property="realName" name="user" size="30"/>
                	<html:errors property="realName" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>电话</p>
                </div>
                <div class="register_element_r">
                	<html:text property="phone" name="user" size="30"/>
                	<html:errors property="phone" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>E-mail</p>
                </div>
                <div class="register_element_r">
                <html:text property="email" name="user" size="30"/>
				<html:errors property="email" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>邮寄地址</p>
                </div>
                <div class="register_element_r">
                <html:text property="address" name="user" size="30"/>
                <html:errors property="address" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>邮编</p>
                </div>
                <div class="register_element_r">
                <html:text property="zip" name="user" size="30"/>
                <html:errors property="zip" />
                </div>
            </div>
            
            <div class="register_element">
           	  <div class="register_textbox_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>备注</p>
                </div>
                <div class="register_element_r">
                <html:textarea property="remark" name="user" rows="8" cols="57"/>
                <html:errors property="remark" />
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                
                <p></p>
                </div>
                <div class="register_element_r">
                <input type="submit" value="     修改    " name="B1">&nbsp;&nbsp;
										<input type="reset" value="    重置    " name="B2">
                </div>
            </div>
       </html:form>     
  </div>
  </logic:present>
