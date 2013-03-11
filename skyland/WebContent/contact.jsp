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
		<%@ include file="blocks/local.jsp"%>
        <%@ include file="blocks/company_list.jsp"%>
	  
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