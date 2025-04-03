<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body bgcolor="lavender">
    <center>
        <h1>ZEE-ZEE Web Portal</h1>
        <form:form modelAttribute="login" action="submitlogin" method="post">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><form:input path="userName" id="userName" name="userName"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" id="password" name="password"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="submit" value="Login"/>
                        <input type="reset" value="Reset"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </center>
</body>
</html>
