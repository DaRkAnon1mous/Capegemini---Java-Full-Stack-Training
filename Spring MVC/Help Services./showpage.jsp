<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Online Help Services </center></h1>
<form:form method="post" action="helpdesk" modelAttribute="helper">
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
	<tr>
	<td>Choose Service:</td>
	<td><form:select path="serviceType" name="serviceType">
                <form:options items="${serviceList}"/>
            </form:select></td>
	</tr>
	<tr>
        <td>Total Hours Service Required</td>
        <td><form:input path="noOfHours" name="noOfHours"/></td>
    </tr>
    <tr>
        <td>
            <input type="submit" value="Total Cost" name="submit"/>
        </td>
        <td>
        <input type="reset" value="Cancel"/>
        </td>
    </tr>              
              
			


			
</table>
</form:form>


</body>
</html>
