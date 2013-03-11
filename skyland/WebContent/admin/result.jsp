<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="beans.News,beans.admin.Admin,config.Name,jsp.Controller" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int categoryNum=Integer.parseInt(request.getParameter("category_num"));
	String title=request.getParameter("title");
	String detail=request.getParameter("editorContent");
	title=new String(title.getBytes("iso-8859-1"),"utf-8");
	detail=new String(detail.getBytes("iso-8859-1"),"utf-8");
	Admin admin=(Admin)session.getAttribute(Name.Admin);
	
	
	News news =new News();
	news.setAdminNum(admin.getNum());
	news.setTitle(title);
	news.setCategoryNum(categoryNum);
	news.setDetail(detail);
	Controller.save(news);
	out.println("成功添加 "+title+"<br/>");
	out.println("<a href=\"news_add.jsp\">继续添加</a>");
%>
</body>
</html>