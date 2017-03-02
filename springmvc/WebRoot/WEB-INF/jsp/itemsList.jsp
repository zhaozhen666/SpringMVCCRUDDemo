<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户列表</title>
</head>
<body> 
<a href="${pageContext.request.contextPath }/user/add">添加</a>用户列表：
<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>用户名</td>
	<td>密码</td>
	<td>昵称</td>
	<td>电子邮箱</td>
	<td>操作</td>
</tr>
<c:forEach items="${list}" var="item">
<tr>
	<td>
	<input type="checkbox" name="iduser" value="${item.iduser}">
	</td>
	<td>${item.username }</td>
	<td>${item.password }</td>
	<td>${item.nickname }</td>
	<td>${item.email }</td>
	<td><a href="${pageContext.request.contextPath }/user/edit?iduser=${item.iduser}">修改</a>
	<a href="${pageContext.request.contextPath }/user/deleteByID?iduser=${item.iduser}">删除</a>
	</td>

</tr>
</c:forEach>

</table>
</body>

</html>