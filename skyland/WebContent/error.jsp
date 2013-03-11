<%@ page language="java" contentType="text/html; charset=GB2312"
    isErrorPage="true" pageEncoding="GB2312"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<bean:message key="error.page" /><br/>
<%
	if(exception!=null){
		out.println(exception.getMessage()); 
	}
%>
</body>
</html>