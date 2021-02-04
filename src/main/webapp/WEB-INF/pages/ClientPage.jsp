<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>TP Java - Liste Clients</title>
    <%@include file="commons/header.jsp" %>
  </head>
  <body>
    <div class="container"><%@include file="commons/menu.jsp" %></div>

    <div class="container" style="display: flex;flex-direction: column;">
        <table>
          <thead>
            <th>Nom</th>
            <th>Adresse</th>
          </thead>
          <tbody>
            <c:forEach var="c" items="${listClients}">
            <tr>
              <td><c:out value="${c.nom}"></c:out></td>
              <td><c:out value="${c.adresse}"></c:out></td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
        <a style="width: 50%;margin: auto;" href="ListeClient?action=create" class="waves-effect waves-light btn">Create client</a>
    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
