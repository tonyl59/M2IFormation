<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>Form :</h1>
<form action="cat-servlet" method="post">

    <div>
        <label for="name">Name : </label>
        <input type="text" name="name" id="name">
    </div>

    <div>
        <label for="race">Race : </label>
        <input type="text" name="race" id="race">
    </div>

    <div>
        <label for="fav_meal">Favourite meal : </label>
        <input type="text" name="fav_meal" id="fav_meal">
    </div>
        <label for="bdate">Birthdate : </label>
        <input type="text" name="bdate" id="bdate">
    <button>Add</button>
</form>
