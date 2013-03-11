<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<img class= border="0" src="imgs/images/service_banner.gif" width="638" height="117"><br>
				　
                <img class="service_img" border="0" src="imgs/images/shfw_xlh1.gif" width="180" height="82">

<html:form  action="serial-do.htm" method="post">                
                <div class="service_textbox" >
                <html:text property="serial" size="46" />
                <html:errors property="serialError"/>
				<br/>
				<br/>
				<html:submit>
                	<bean:message key="serial.submit" />
                </html:submit>
                </div>
</html:form>                
                <div class="service_middle">
                <div class="service_middle_top">
               	  <img src="imgs/images/conner_tl.gif" width="25" height="25" vspace="0" border="0">
                </div>
<logic:present name="serialSearch"  scope="session">               
                <div class="service_middle_main">
                <p>
                				序列号：<bean:write name="serialSearch" property="serial" /><br>
								品名：<bean:write name="serialSearch" property="name" /><br>
								规格：<bean:write name="serialSearch" property="specification" /><br>
								出售日期：<bean:write name="serialSearch" property="soldShop" /><br>
								出售店铺：<bean:write name="serialSearch" property="soldTime" />
                                </p>
                </div>
                <p class="service_middle_text">查询结果：</p>
   <% session.removeAttribute("serialSearch"); %>               
</logic:present>                
                
                <div class="service_middle_bottom">
                	<img style="margin:0,0,0,0;" src="imgs/images/conner_rd.gif" width="25" height="25" hspace="0" vspace="0" border="0"></div>
<div class="fix">
                    	<img class="img_left" border="0" src="imgs/images/shfw_yywx1.gif" width="180" height="82">
                        <div class="fix_select">
                    	<select size="1" name="D1">
									<option>请选择省份</option>
						  </select><select size="1" name="D2">
									<option>请选择地区</option>
									</select><br>
									<select size="1" name="D3">
									<option>请选择产品</option>
									</select><select size="1" name="D4">
									<option>请选择产品</option>
									</select>
								<select size="1" name="D5">
								<option>请预约时间</option>
								</select>
						</div>
                  </div>
                    
                   <div class="service_middle_bottom">
                	<img style="margin:0,0,0,0;" src="imgs/images/conner_tr.gif" width="25" height="25" hspace="0" vspace="0" border="0"></div>  
                <div class="service_middle_main">
                				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="submit" value="    提交    " name="B2">
                </div>
                <div class="service_middle_top">
               	  <img src="imgs/images/conner_ld.gif" width="25" height="25" vspace="0" border="0"></div>
               
                </div>