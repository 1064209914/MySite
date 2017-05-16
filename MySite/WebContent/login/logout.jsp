<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
			<%
			session.invalidate();
			response.setHeader("refresh", "1;URL=../index.jsp");
			%>
			<p>你已经成功退出1秒以后自动回到登录页</p>
			如果没又跳转请<a href="../index.jsp" >点击这里</a>
</body>
</html>