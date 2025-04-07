<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <body bgcolor="lavender">
    <center>
      <h2>Advertisement Registration</h2>
      <form:form action="display" modelAttribute="advertisement" method="post">
        <table>
          <tr>
            <td>Advertisement ID:</td>
            <td><form:input path="advertisementId" /></td>
          </tr>
          <tr>
            <td>Advertisement Type:</td>
            <td><form:input path="advertisementType" /></td>
          </tr>
          <tr>
            <td>Cost:</td>
            <td><form:input path="cost" /></td>
          </tr>
          <tr>
            <td colspan="2">
              <input type="submit" name="submit" value="Submit" />
            </td>
          </tr>
        </table>
      </form:form>
    </center>
  </body>
</html>