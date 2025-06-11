<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>Please submit your cat information :</h1>
<form action="cat-servlet" method="post">

    <div>
        <label for="name">Name :          </label>
        <input type="text" name="name" id="name">
    </div>

    <div>
        <label for="breed">Breed :         </label>
        <input type="text" name="breed" id="breed">
    </div>

    <div>
        <label for="fav_meal">Favourite meal : </label>
        <input type="text" name="fav_meal" id="fav_meal">
    </div>

    <div>
        <label for="bdate">Birthdate :     </label>
        <input type="date" name="bdate" id="bdate">
    </div>
    <button>Add</button>
</form>
