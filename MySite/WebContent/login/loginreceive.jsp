<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.hxd.beans.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:useBean id="user" class="com.hxd.beans.User"></jsp:useBean>
<jsp:useBean id="text" class="com.hxd.beans.Text"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
</head>
<body>
		<%
			request.setCharacterEncoding("UTF-8");
		if (text.yanzheng(user)) {
			session.setAttribute("userName", user.getUserName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("loginfalse.jsp").forward(request, response);
		}
	%>
</body>
</html>