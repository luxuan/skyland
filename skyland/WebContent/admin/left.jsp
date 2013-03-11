<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天地汇--汇天下精品</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color:#F00;
}
-->
</style>
<link href="admin.css" type="text/css" rel="stylesheet" />

<script type="text/javascript">
//参数id为要展开的内容id
//单击一下展开，再单击一下隐藏
//written by jzw
	function clicked(id)
{
	var num=eval(id+".style.display"); 
	if(num=="none")
	{
		eval(id+".style.display=''");
	}
	else
	{
		eval(id+".style.display='none'");
	}
}
</script>
</head>

<body bgcolor="#ffffff">

	<div id="left">
	<div id="lhead">管理菜单</div>
    
	<ul >    
    
    <li ><a href="#" onClick="clicked('person')">个人信息</a>
        <ul id="person" style="display:none;" > 
             <li><a href="person_info.jsp" target=right>信息查看与修改</a></li>
             <li><a href="person_edit_pass.jsp" target=right>密码修改</a></li>  
        </ul>
    </li>
    
	<li ><a href="#" onClick="clicked('shop')">商铺管理</a>
        <ul id="shop" style="display:none;" > 
             <li><a href="shop_add.jsp" target="right">添加商铺</a></li> 
             <li><a href="shop_view.do?method=viewList" target=right>查看与修改商铺</a></li>              
        </ul>
    </li>
    
    <li ><a href="#" onClick="clicked('goods')">商品与订单管理</a>
        <ul id="goods" style="display:none;" > 
        	 <li><a href="goods_category_add.jsp" target=right>添加商品大类</a></li> 
        	 <li><a href="goods_category_view.do?method=viewList" target=right>商品大类管理</a></li> 
             <li><a href="goods_add.jsp" target=right>新商品添加</a></li> 
             <li><a href="goods_view.do?method=viewList" target=right>查看与修改商品</a></li> 
             <li><a href="goods_transaction.jsp" target=right>管理商品订单</a></li>
             <li><a href="complain.jsp" target=right>查询投诉订单</a></li> 
        </ul>
    </li>
    
    <li ><a href="#" onClick="clicked('users')">管理网站用户</a>
        <ul id="users" style="display:none;" > 
             <li><a href="user_manage.do?method=init" target="right">用户修改</a></li> 
        </ul>
    </li>  
    
    <li ><a href="#" onClick="clicked('news')">资讯管理</a>
        <ul id="news" style="display:none;" > 
             <li><a href="news_add.jsp" target=right>资讯添加</a></li>
             <li><a href="news_view.do?method=viewList" target=right>资讯修改</a></li>  
        </ul>
    </li>
    
    
    
    <li ><a href="#" onClick="clicked('message')">留言管理</a>
        <ul id="message" style="display:none;" > 
             <li><a href="message_manage.jsp" target=right>留言管理</a></li>
        </ul>
    </li>
    
    <li ><a href="#" onClick="clicked('system_info')">系统信息管理</a>
        <ul id="system_info" style="display:none;" > 
             <li><a href="#">网站信息设置</a></li> 
             <li><a href="#">网站广告设置</a></li>
             <li><a href="#">友情链接管理</a></li>          
        </ul>
    </li>
  
	</ul>
    
	</div><div id="lbottom"></div>


</body>

</html>