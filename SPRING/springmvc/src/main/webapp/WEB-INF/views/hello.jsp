<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
 <%
	Integer id=(Integer) request.getAttribute("id");
	String name=(String) request.getAttribute("name");
	Integer salary=(Integer) request.getAttribute("salary");
	out.println("Id"+id);
	out.println("Name"+name);
	out.println("Salary"+salary);
%> 
<br>
Id:
<b>${"id"}</b>
Name:
<h1>${name}</h1>
Salary:
<h1>${salary}</h1>
<%-- <b><c:out value="${id}"/></b><!--  --> --%>


</body>
</html>