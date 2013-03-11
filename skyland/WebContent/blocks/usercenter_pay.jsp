<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/tld/lius-name.tld" prefix="lius" %>

<link href="blocks/main.css" type=text/css rel=stylesheet>
<link href="blocks/add.css" type=text/css rel=stylesheet>
<script language = "JavaScript" src = "ajax/count.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312" />


<logic:notPresent name="userCartList"  scope="session"> 
	购物车中没有货物，<a href="goods_list.htm">浏览商品</a>
</logic:notPresent> 

<logic:present name="userCartList"  scope="session">  
 

<table border="0" cellpadding="0" cellspacing="0" width="100%" id="table37" align="center" >
	<tr>
		<th height="26" align="center" background="imgs/images/table_bj_center.gif">
		商品名称</th>
		<th background="imgs/images/table_bj_center.gif" align="center">单价</th>
		<th background="imgs/images/table_bj_center.gif" align="center">
		数量</th>
		<th background="imgs/images/table_bj_center.gif" align="center">小计</th>
		<th background="imgs/images/table_bj_center.gif" align="center">操作</th>
	</tr>
  <logic:iterate id="t" name="userCartList" type="beans.user.GoodsCart"> 	
	<tr>
		<td height="30" align="center"><a href="goods_detail.htm?property=<bean:write name="t" property="goodsNum" />">
			<lius:toname function="goodsName">
				<bean:write name="t" property="goodsNum" />
			</lius:toname>
		</a></td>
		<td align="center">
			<lius:toname function="goodsPrice">
				<bean:write name="t" property="goodsNum" />
			</lius:toname>
		</td>
		<td align="center"><bean:write name="t" property="goodsCount" /></td>
		<td align="center"><font color="#ff6600">998.00</font></td>
		<td align="center"><a href="delete-cart.htm?property=<bean:write name="t" property="num" />">删除</a></td>
	</tr>
  </logic:iterate>
	
	<tr>
		<td height="30" colspan="5" align="right">商品总价(不含运费)：<font color="#ff6600" id="total" size="5" face="Tahoma">8.00</font>元</td>
	</tr>
	<script type="text/javascript">
	count_total("table37",1,2,3,"total");
	</script>
</table>
				
<div class="user_center"> 
<logic:present name="userOrderAddressList"  scope="session">  
           
<div class="user_head_l">
<font size="+1">已有收货地址</font></div>
                <div class="user_head_r">
                <p></p>
                </div>
       <div >
       <html:form  action="/user-order-do.htm?method=add" method="post"> 
       <table border="0" cellpadding="0" cellspacing="0" width="100%" id="table37" align="center">
	<tr>
	  <th align="center" background="imgs/images/table_bj_center.gif">选择</th>
		<th height="26" align="center" background="imgs/images/table_bj_center.gif">收货人</th>
		<th background="imgs/images/table_bj_center.gif" align="center">地址</th>
		<th background="imgs/images/table_bj_center.gif" align="center">邮编</th>
		<th background="imgs/images/table_bj_center.gif" align="center">电话</th>
		<th background="imgs/images/table_bj_center.gif" align="center">手机</th>
		<th background="imgs/images/table_bj_center.gif" align="center">操作</th>
	</tr>
	
	<logic:iterate id="t" name="userOrderAddressList" type="beans.transaction.OrderAddress"> 
	<tr>
		<td align="center">
			<!-- value=user.defaultAddressNum -->
			<html:radio property="isDefault" name="t" value="true" ></html:radio>
		</td>
		<td height="30" align="center"><bean:write name="t" property="name" /></td>
		<td align="center"><bean:write name="t" property="address" /></td>
		<td align="center"><bean:write name="t" property="postcode" /></td>
		<td align="center"><bean:write name="t" property="areaCode" />-<bean:write name="t" property="telephone" /></td>
		<td align="center"><bean:write name="t" property="mobilphone" /></td>
		<td align="center">
			<a href="set-default-order-address.htm?property=<bean:write name="t" property="num" />">设为默认</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="delete-order-address.htm?property=<bean:write name="t" property="num" />">删除</a>
		</td>
	</tr>
	</logic:iterate>
	

	<tr>
	  <td height="30" colspan="7" align="right">
                     <input type="submit" value="     提交    " name="B1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     </td>
	</tr>
	
	</table>
	</html:form>
       </div>
</logic:present>
</div>


<div class="user_center">
       	  <div class="user_head_l">
  <font size="+1">新增收货地址</font></div>
            <div class="user_head_r">
            <p></p>
            </div>
</div>

<html:form  action="/add-order-address-do.htm" method="post">   
      	<div class="register">
        	
        	<div class="register_element">
           	  <div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;收货人姓名</p>
              </div>
              <div class="register_element_r">
                <html:text property="name" size="25"/>
              </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;收信地址</p>
                </div>
                <div class="register_element_r">
                <html:text property="address"/>
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;邮政编码</p>
                </div>
                <div class="register_element_r">
                <html:text property="postcode" size="25"/><span class="spark-indeed"><font color="#ff0000">*</font></span> <span class="ex-margin-left ex-weaken-gray"><font color="#808080">大陆以外地区可不填写</font></span>
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;电话号码</p>
                </div>
              <div class="register_element_r">
                <html:text property="areaCode"/> - <html:text property="telephone"/>  <span class="ex-margin-left ex-weaken-gray"><font color="#808080">区号-电话号码</font></span>
              </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;手机号码</p>
                </div>
                <div class="register_element_r">
                <html:text property="mobilphone"/>
                </div>
            </div>
            
            <div class="register_element">
            	<div class="register_element_l">
                <img class="img_left" border="0" src="imgs/images/reg_jia.gif" width="8" height="8">
                <p>&nbsp;设为默认</p>
                </div>
                <div class="register_element_r">
                <html:checkbox value="true" property="isDefault"/>
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
            
        </div>
        </html:form>
</logic:present>
