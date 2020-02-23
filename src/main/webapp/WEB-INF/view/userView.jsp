<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Username</th>
        <th>First name</th>
        <th>Last name</th>
        <th>email</th>
    </tr>
    </thead>
    <tr>
        <td>${user.username}</td>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
        <td>${user.email}</td>
    </tr>
</table>
<a href="/users">Go back to users list</a>
</body>
</html>