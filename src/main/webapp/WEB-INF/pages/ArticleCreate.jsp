<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>TP Java - Create Article</title>
    <%@include file="commons/header.jsp" %>
  </head>
  <body>
    <div class="container"><%@include file="commons/menu.jsp" %></div>

    <div class="container">
        
        <form action="article" method="post">
            <label for="nomArticle">Nom</label>
            <input type="text" name="nomArticle">

            <label for="prixArticle">Prix</label>
            <input type="number" step=".01" name="prixArticle">

            <input type="hidden" value="create" name="actionPost"/>
            <input type="submit" value="Valider"/>
          </form>

    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
