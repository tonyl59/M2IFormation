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
    <title>Person table</title>
</head>
<body>
<h1> affichage table de personnes</h1>
<!-- TODO créer une table ici-->
<% for (Person p: persons){%>
  <p><%= p.getLastname() %> <%= p.getFirstname() %> <%= p.getLastname() %></p>
<% } %>

</body>
</html>
