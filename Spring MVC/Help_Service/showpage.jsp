<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Choose Service</title>
    <style>
        body {
            background-color: #E6E6FA;
            text-align: center;
            font-family: Arial, sans-serif;
        }
        form {
            display: inline-block;
            text-align: left;
        }
    </style>
</head>
<body>
    <h2>Welcome to Online Help Services</h2>
    <form action="calculateTotalCost" method="post">
        <label for="serviceType">Choose Service:</label>
        <select id="serviceType" name="serviceType">
            <c:forEach items="${serviceList}" var="service">
                <option value="${service.key}">${service.value}</option>
            </c:forEach>
        </select>
        <br/><br/>
        <label for="noOfHours">Total Hours Service Required:</label>
        <input type="number" id="noOfHours" name="noOfHours" required/>
        <br/><br/>
        <input type="submit" id="submit" name="submit" value="TotalCost"/>
        <input type="reset" value="Cancel"/>
    </form>
</body>
</html>