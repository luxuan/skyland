<%@ page language="java" contentType="text/html; charset=GB2312"  pageEncoding="GB2312"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>天地汇--汇天下精品</title>
<link href=blocks/main.css type=text/css rel=stylesheet>
<link href=blocks/add.css type=text/css rel=stylesheet>
<script language = "JavaScript" src = "blocks/Main.js"></script>
<style type="text/css">
<!--
-->
</style>
</head>

<body topmargin="0" leftmargin="0" bgcolor="#ffffff">
<div id="main" align="center">
  <%@ include file="blocks/head.jsp"%>
  <div id="middle">
    	
    <div id="middle_left"><img border="0" src="imgs/images/line-1.gif" width="10" height="35" />
    </div>
  	
    <div id="left">  
		<%@ include file="blocks/help_center.jsp"%>
    </div>
    
    <div id="middle_top">
		<%@ include file="blocks/search.jsp"%>
        <%@ include file="blocks/visit.jsp"%>
    </div>
    
    <div id="content">
      
      <div class="user_center">
        	<div class="user_head_l">
            <img border="0" src="imgs/images/help_arrow.gif" width="19" height="23" align="absmiddle"><font face="黑体"><span style="font-size: 11pt">购物流程</span></font></div>
            <div class="user_head_r">
            
            </div>
            <div class="help_info">
            							<ol class="help_box List_Number margin_b20">
								<li>
								等待订单确认：订单尚未获得确认，正常工作时间内，最迟3小时可以获得确认，如非正常工作时间，需要等到上班时间确认。 
								</li>
								<li>
								等待汇款：订单已获得确认，请按照确认后的总金额汇款，汇款完毕后请登记您的汇款信息，登记的汇款信息内容为：交易流水号、汇款时间、 
								汇入行、汇入卡号、汇款金额共５项。系统自动保留订单期限为3天，超过3天未汇清款项的订单，系统会自动将订单取消。 
								</li>
								<li>
								等待汇款确认：已提交汇款信息，财务人员正在查收汇款，会在查收到您的汇款后一个工作日内帮您确认款项。 
								</li>
								<li>等待分发：订单处于系统自动分发状态，每小时系统都会运行一次，运行后订单状态将改变。 
								</li>
								<li>等待打印出库单： 
								您的订单已经成功到达库房，正在等待库管打印出库单。这个过程一般比较短，无特殊情况，当日可以完成。 
								</li>
								<li>等待出库：网上订单被打印，目前订单在等待库房人员出库 ，无特殊情况，当日可以完成。 
								</li>
								<li>
								等待打包：订单已成功出库完毕，目前在等待打包，无特殊情况，当日可以完成！现在既可以查询到此次在京东所购买产品的产品序列号，产品出现任何问题，凭序列号进行保修。 
								</li>
								<li>等待发货：已完成包装工作，正在等待承运人发货。 </li>
								<li>自提途中：订单已经出库完毕，正在由库房送往京东自提点途中，在此期间请勿上门自提。 
								</li>
								<li>等待上门提货：订单准备完毕，可以前来提货了。北京、上海，广州上门提货接待时间为9：00 
								—19：00。周六日正常接待上门提货！法定假日休息。所有上门提货订单一旦出库完毕，可以保留3天，在本状态超过3天（奥运期间，北京上门提货订单保留时间延长至5天）未被提走的订单将被系统删除，货物另行销售。（如果需要查看上门提货具体地址，请<a href="http://www.360buy.com/help/ziti.aspx">点击这儿</a>。） 
								</li>
								<li>等待确认收货：您的货物已经发出，请您稍后注意查收。 </li>
								<li>已完成单：订单已成功完成交易，如收到产品有质量问题，请直接与售后部门联系。</li>
</ol>
</div>
        </div>
      
    </div>
    <div id="right">
          <%@ include file="blocks/news_bar.jsp"%>
          <%@ include file="blocks/service.jsp"%>
     	 </div>
</div>
  		<%@ include file="blocks/bottom.jsp"%>
</div>

</body>

</html>