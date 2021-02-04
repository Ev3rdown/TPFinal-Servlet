<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>TP Java - Liste Factures</title>
    <%@include file="commons/header.jsp" %>
  </head>
  <body>
    <div class="container"><%@include file="commons/menu.jsp" %></div>

    <div class="container">
        <table>
          <thead>
            <th>Numero</th>
            <th>Date</th>
            <th>Client</th>
            <th>Prix</th>
          </thead>
          <tbody>
            <c:forEach var="f" items="${listFactures}">
              <!-- le cursor permet de rendre évident le onclick -->
              <!-- le onclick permet d'avoir un moyen propre de rediriger quelque soit l'endroit où on clique sur la row  -->
            <tr style="cursor: pointer;" onclick="document.location.href='./facture?action=detail&numero=${f.numero}'">
                <td><c:out value="${f.numero}"></c:out></td>
                <td><c:out value="${f.date}"></c:out></td>
                <td><c:out value="${f.client.nom}"></c:out></td>
                <td><c:out value="${f.prix}"></c:out></td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
