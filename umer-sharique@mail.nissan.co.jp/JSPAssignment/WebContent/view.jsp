<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
<style>
table,th,td{
border :1px solid black;
border-collapse: collapse;
}
th,td{
padding 15px;
text-align: left;
}
table#t01{
width:60%;

}


</style>
</head>
<body>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<table id=t01>
<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Mail</th>

<%
Class.forName("com.mysql.jdbc.Driver");

Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan","root","admin");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from register");
while(rs.next()){
%>
<tr><td>
<%= rs.getInt(1) %>
</td><td>
<%= rs.getString(2) %>
</td><td>
<%= rs.getString(3) %>
</td><td>
<%=rs.getString(4) %>
</td>
</tr>
<% } %>
</table>
<br>
<a href="index.jsp">
<button class="button"><Span>Home</Span></button>
</a>


</body>
</html>