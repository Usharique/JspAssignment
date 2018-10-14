<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<style>
.button {
    
    border-radius: 12px;
    padding: 15px 32px;
    text-align: center;
    display: inline-block;
    font-size: 16px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
}
.button:hover {
    background-color: #4CAF50; /* Green */
    color: white;
}
</style>
</head>
<body>

<a href="registration.jsp">
<button class="button"><Span>Register</Span></button>
</a>
<a href="view.jsp">
<button class="button"><Span>View</Span></button>
</a>

</body>
</html>