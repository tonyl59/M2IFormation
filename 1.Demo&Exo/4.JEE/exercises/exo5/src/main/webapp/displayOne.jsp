<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2025
  Time: 09:16
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="dog" type="org.example.exo5.entity.Dog" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display one dog</title>
</head>
<body>

<p><%= dog.getId() %> </p>
<p><%= dog.getName()%> </p>
<p><%= dog.getBreed() %> </p>
<p><%= dog.getBdate()%></p>

</body>
</html>
