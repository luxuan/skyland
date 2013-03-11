<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<link href=admin.css type=text/css rel=stylesheet>



<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

</head>
<center>

<table  border="0" cellpadding="0" cellspacing="1" class="table_">
  <tr height="20px">
    <td><a href="#"><font >留言者</font></a></td>
    <td><a href="#"><font >被留言方</font></a></td>
    <td><a href="#"><font >留言日期</font></a></td>
    <td><a href="#"><font >内容</font></a></td>
    <td><a href="#"><font >操作</font></a></td>
  </tr>
  <tr height="20px">
    <td bgcolor="#FFFFFF">jzw</td>
    <td bgcolor="#FFFFFF">jzw</td>
    <td bgcolor="#FFFFFF">2010/8/21</td>
    <td bgcolor="#FFFFFF">
      <textarea name="textarea" id="textarea" cols="45" rows="3"></textarea>
      </td>
    <td bgcolor="#FFFFFF"><a href="#">删除 </a></td>
  </tr>
  <tr height="20px">
    <td bgcolor="#FFFFFF">jzw</td>
    <td bgcolor="#FFFFFF">jzw</td>
    <td bgcolor="#FFFFFF">2010/8/21</td>
    <td bgcolor="#FFFFFF"><textarea name="textarea2" id="textarea2" cols="45" rows="3"></textarea></td>
    <td bgcolor="#FFFFFF"><a href="#">删除 </a></td>
  </tr>
  <tr>
    <td colspan="5">
    <%@ include file="ye.jsp"%>
    </td>
    </tr>
</table>

</center>
</html>

