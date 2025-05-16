<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome</h3>
<h4>Name : ${model_user.getName()}</h4>
<h4>Email : ${model_user.getEmail()}</h4>
<h4>Phone no : ${model_user.getPhoneno()}</h4>
</body>
</html>