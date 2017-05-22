<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
body {
	font-family: Microsoft YaHei, Segoe UI, Tahoma, Arial, Verdana,
		sans-serif;
	font-size: 12px;
	color: #fff;
	background-size: cover;			/* 左右填充 */
	background-repeat: no-repeat;		/* 是否重复 */
	background-attachment: fixed;		
	z-index: auto;
}

* {
	margin: 0;
	padding: 0
}

h1 {
	font-size: 30px;
	font-weight: 700;
	text-shadow: 0 1px 4px rgba(0, 0, 0, .2)
}

.login-box {
	width: 410px;
	margin: 130px auto 0 auto;
	text-align: center;
	padding: 30px;
	border-radius: 10px;
	background-color: rgba(158, 158, 158, 0.26);
}

.login-box .name, .login-box .password {
	font-size: 16px;
	text-shadow: 0 1px 2px rgba(0, 0, 0, .1)
}

.login-box label {
	display: inline-block;
	width: 100px;
	text-align: right;
	vertical-align: middle
}

input[type=text], input[type=password] {
	width: 270px;
	height: 42px;
	margin-top: 25px;
	padding: 0px 15px;
	border: 1px inset;
	border-radius: 6px;
	color: #fff;
	letter-spacing: 2px;
	font-size: 16px;
	background: transparent;
}

button {
	cursor: pointer;
	width: 100%;
	height: 44px;
	padding: 0;
	background: #ef4300;
	border: 1px solid #ff730e;
	border-radius: 6px;
	font-weight: 700;
	color: #fff;
	font-size: 24px;
	letter-spacing: 15px;
	text-shadow: 0 1px 2px rgba(0, 0, 0, .1)
}

input:focus {
	outline: none;
	box-shadow: 0 2px 3px 0 rgba(0, 0, 0, .1) inset, 0 2px 7px 0
		rgba(0, 0, 0, .2)
}
</style>
</head>
<body>
<body background="./images/2.jpg">
	<div class="login-box">
		<h1>个人主页登录</h1>
		<form method="post" action=" <%=request.getContextPath() %>/servlet/LoginTest "  >
			<div class="name">
				<label>管理员账号：</label> <input type="text" name="userName" id=""
					tabindex="1" required="required" />
			</div>
			<div class="password">
				<label>密 码：</label> <input type="password" name="passWord" maxlength="16"
					id="" tabindex="2" required="required" />
			</div>
			<div class="login">
				<button type="submit" tabindex="5"
					style="width: 307px; margin-left: 100px;">登录</button>
				</div>
			<div class="login">
				<h2><a href="register.jsp" style="margin-left: 330px;">点击注册</a></h2>
				
			</div>
		</form>
	</div>
</body>
</html>