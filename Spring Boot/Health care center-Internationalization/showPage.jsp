<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <style>
        #message {
            color: red;
        }
    </style>
</head>
<body style="background-color: lavender">

<!-- Language Switcher -->
<a href="/showPage?language=en"><spring:message code="link.english" text="English" /></a> |
<a href="/showPage?language=fr"><spring:message code="link.french" text="French" /></a>

<h1><center><spring:message code="header.title" text="Health Care Center" /></center></h1>
<form:form method="POST" action="/consultation" modelAttribute="appointment">
    <table style="margin: 0px auto; margin-left: auto; margin-right: auto">
        <tr>
            <td><spring:message code="label.patientName" text="Patient Name" /></td>
            <td><form:input path="patientName" id="patientName" /></td>
        </tr>
        <tr>
            <td><spring:message code="label.phoneNumber" text="Phone Number" /></td>
            <td><form:input path="phoneNumber" id="phoneNumber" /></td>
        </tr>
        <tr>
            <td><spring:message code="label.age" text="Age" /></td>
            <td><form:input path="age" id="age" /></td>
        </tr>
        <tr>
            <td><spring:message code="label.consultationFor" text="Consultation For" /></td>
            <td>
                <form:select path="consultationFor" id="consultationFor">
                    <form:options items="${consultationList}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <form:button type="submit" id="submit" name="submit">
                    <spring:message code="button.bookAppointment" text="Book Appointment" />
                </form:button>
            </td>
        </tr>
        <tr>
            <td colspan="2"><div id="message">${message}</div></td>
        </tr>
    </table>
</form:form>

</body>
</html>