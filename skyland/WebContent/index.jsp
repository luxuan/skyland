<%@ page language="java" contentType="text/html; charset=GB2312"  pageEncoding="GB2312"%>
<html>

<head>

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
  <div id="middle_left"><img border="0" src="imgs/images/line-1.gif" width="10" height="35" /></div>
  <div id="left"> 
    
    <%@ include file="blocks/sort.jsp"%>
    <%@ include file="blocks/hot_sell_bar.jsp"%>
    <%@ include file="blocks/brand.jsp"%>
    
    
  </div>
    
    <div id="middle_top">
  <%@ include file="blocks/search.jsp"%>
    <%@ include file="blocks/visit.jsp"%>
    </div>
    <div id="content">
    <%@ include file="blocks/index_shop_list.jsp"%>
    <%@ include file="blocks/crazy_list.jsp"%>
    <%@ include file="blocks/fresh_list.jsp"%>
    <%@ include file="blocks/bargain_list.jsp"%>
    </div>
    
  <div id="right">
  <%@ include file="blocks/news_bar.jsp"%>
  
  <%@ include file="blocks/service.jsp"%>
  
  <%@ include file="blocks/visited_shop.jsp"%>
  <%@ include file="blocks/visited_goods.jsp"%>
  </div>
  </div>
<%@ include file="blocks/bottom.jsp"%>
  
</div>

</body>

</html>