<%@ page import="org.example.exo5.entity.Dog" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2025
  Time: 09:16
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="dogs" type="java.util.ArrayList<org.example.exo5.entity.Dog>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="style/style.jsp"%>
    <title>Dog</title>
</head>
<body>

<% if (dogs.isEmpty()){%>
<h2 class ="emptymessage"> No dogs in list, please submit one to display table </h2>
<img class="saddog" src="sad_dog.webp" alt="dog sadge" width="300" , height="300">
<% }else{%>
<h1 class="table"> Dog table </h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Breed </th>
        <th>Birthdate</th>
        <th>Actions</th>
    </tr>
    <% for (Dog d: dogs){%>
    <tr>
        <td><%= d.getId() %> </td>
        <td><%= d.getName()%> </td>
        <td><%= d.getBreed() %> </td>
        <td><%= d.getBdate()%></td>
        <td> <a href="display-one?id=<%=d.getId()%>">Display one dog</a> </td>
    </tr>
    <% } %>
</table>

<img src="doge.jpg" alt="doge lol">
<%}%>


</body>
</html>
