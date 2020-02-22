<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<body>
<spring:url value="/addUser" var="addUserUrl" />


<form:form method="POST" action="${addUserUrl}" modelAttribute="user">
    <table>
        <tr>

            <td><form:label path="username">Username</form:label></td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td><form:label path="password" >password</form:label></td>
            <td><form:input path="password" type="password"/></td>
        </tr>
        <tr>
            <td><form:label path="firstName">First name</form:label></td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Last name</form:label></td>
            <td><form:input path="lastName"/></td>
        </tr>

        <tr>
            <td><form:label path="email">email</form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:input path="role.id" type="hidden"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>


<a href="/index">Strona glowna</a>

</body>