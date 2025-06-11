<%@ page import="org.example.exo4.Model.Cat" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="cats" type="java.util.ArrayList<org.example.exo4.Model.Cat>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@include file="style/style.jsp"%>
    <title>Cat</title>
</head>
<body>
<%@include file="WEB-INF/addCat.jsp"%>

<% if (cats.isEmpty()){%>
<h2 class ="emptymessage"> No cats in list, please submit one to display table </h2>
<img class="cryingcat" src="sadcat.webp" alt="cat sadge" width="300", height="300">
 <% }else{%>
<h1 class="table"> Cat table </h1>
<table>
  <tr>
    <th>Name</th>
    <th>Breed</th>
    <th>Favorite meal </th>
    <th>Birthdate</th>
  </tr>
  <% for (Cat c: cats){%>
  <tr>
    <td><%= c.getName()%> </td>
    <td><%= c.getBreed() %> </td>
    <td><%= c.getFavmeal() %> </td>
    <td><%= c.getBdate()%></td>
  </tr>
  <% } %>
</table>

<img src="cat-space.gif" alt="cat lol">
<%}%>


</body>
</html>
