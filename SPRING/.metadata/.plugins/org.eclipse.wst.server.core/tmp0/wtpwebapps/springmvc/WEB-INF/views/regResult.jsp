<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.rohit.springmvc.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>resgistration response</title>
</head>
<body>
	User Regisered Successfully
	<%
    User user = (User)request.getAttribute("user");
	out.println(user.getId());
	out.println(user.getName());
	out.println(user.getEmail()); %>
</body>
</html>