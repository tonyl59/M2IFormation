<%@ page import="org.example.model.Person" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 10/06/2025
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="persons" type="java.util.ArrayList<org.example.model.Person>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="style/style.jsp"%>
    <title>Person table</title>
</head>
<body>
<h1> affichage table de personnes</h1>
<table>
    <tr>
        <th>Last name</th>
        <th>First name</th>
        <th> Age </th>
    </tr>

    <% for (Person p: persons){%>
    <tr>
        <td><%= p.getLastname() %> </td>
        <td><%= p.getFirstname() %> </td>
        <td><%= p.getAge() %> </td>
    </tr>
    <% } %>
</table>

</body>
</html>
