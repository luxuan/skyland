<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/lius-name.tld" prefix="lius" %>

<link href=blocks/main.css type=text/css rel=stylesheet>

<meta http-equiv="Content-Type" content="text/html; charset=GB2312" />


<logic:notPresent name="userOrderList"  scope="session"> 
	暂时没有订单
</logic:notPresent> 

<logic:present name="userOrderList"  scope="session">  

<table border="0" cellpadding="0" cellspacing="0" width="100%" id="table37" align="center">
	<tr>
		<th background="imgs/images/table_bj_center.gif" align="center" width="100" height="26">编号</th>
		<th background="imgs/images/table_bj_center.gif" align="center">商品名称</th>
		<th background="imgs/images/table_bj_center.gif" align="center">订货时间</th>
		<th background="imgs/images/table_bj_center.gif" align="center">数量</th>
		<th background="imgs/images/table_bj_center.gif" align="center">单价</th>
		<th background="imgs/images/table_bj_center.gif" align="center">操作</th>
	</tr>
	
  <logic:iterate id="t" name="userOrderList" type="beans.transaction.Order">  	
	<tr>
		<td height="30" align="center"><bean:write name="t" property="num" /></td>
		<td align="center"><a href="goods_detail.htm?property=<bean:write name="t" property="goodsNum" />">
			<lius:toname function="goodsName">
				<bean:write name="t" property="goodsNum" />
			</lius:toname>
		</a></td>
		<td align="center"><bean:write name="t" property="orderTime" /></td>
		<td align="center"><bean:write name="t" property="goodsCount" /></td>
		<td align="center"><bean:write name="t" property="price" /></td>
		<td align="center"><a href="delete-order.do?property=<bean:write name="t" property="num" />">取消</a></td>
	</tr>
	  </logic:iterate>
</table>
</logic:present>


