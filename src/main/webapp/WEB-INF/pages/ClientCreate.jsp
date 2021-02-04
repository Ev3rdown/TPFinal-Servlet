<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>TP Java - Create Client</title>
    <%@include file="commons/header.jsp" %>
  </head>
  <body>
    <div class="container"><%@include file="commons/menu.jsp" %></div>

    <div class="container">
        
        <form action="ListeClient" method="post">
            <label for="nomClient">Nom</label>
            <input type="text" name="nomClient">

            <label for="adresseClient">Adresse</label>
            <input type="text" name="adresseClient">

            <input type="hidden" value="create" name="actionPost"/>
            <input type="submit" value="Valider"/>
          </form>

    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
