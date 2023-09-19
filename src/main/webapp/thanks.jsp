<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Murach's Java Servlets and JSP</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
<h1>survey results</h1>

<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>

<label>Contact:</label>
<span>${user.contact}</span><br>
<%--<label>Choose: </label>--%>
<%--<span>${user.boo}</span><br>--%>
<label>Choose: </label>
<span>${user.boo}</span><br>

<label>profession:</label>
<span>${user.profession}</span><br>
<p>click on the Back</p>

<form action="" method="get">
<input type="hidden" name="action" value="join">
<input type="submit" value="Return">
</form>

</body>
</html>

