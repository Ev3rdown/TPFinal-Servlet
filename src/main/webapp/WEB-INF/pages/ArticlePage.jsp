<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>TP Java - Liste Articles</title>
    <%@include file="commons/header.jsp" %>
  </head>
  <body>
    <div class="container"><%@include file="commons/menu.jsp" %></div>

    <div class="container">
        <table>
            <thead>
              <th>Nom</th>
              <th>Prix</th>
            </thead>
            <c:forEach var="a" items="${listArticles}">
            <tr>
                <td><c:out value="${a.nom}"></c:out></td>
                <td><c:out value="${a.prix}"></c:out></td>
            </tr>
            </c:forEach>
        </table>
        <a href="article?action=create" class="waves-effect waves-light btn">button</a>
    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
