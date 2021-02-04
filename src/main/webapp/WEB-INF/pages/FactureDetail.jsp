<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>TP Java - Detail Facture</title>
    <%@include file="commons/header.jsp" %>
  </head>
  <body>
    <div class="container"><%@include file="commons/menu.jsp" %></div>

    <div class="container">
        <!-- Head -->
        <div class="row">
            <!-- Left Col -->
            <div class="col s6">
                <p>Numero: <c:out value="${facture.numero}"></c:out></p>
                <p>Date: <c:out value="${facture.date}"></c:out></p>
                
            </div>
            <div class="col s3"></div>
            <!-- Right Col -->
            <div class="col s3">
                <p>Nom: <c:out value="${facture.client.nom}"></c:out></p>
                <p>Adresse: <c:out value="${facture.client.adresse}"></c:out></p>
            </div>
        </div>

        <!-- Lines -->
        <table>
            <thead>
              <th>Article</th>
              <th>Quantité</th>
              <th>Prix</th>
            </thead>
            <tbody>
              <c:forEach var="lf" items="${facture.lignesFacture}">
              <tr>
                  <td><c:out value="${lf.article.nom}"></c:out></td>
                  <td><c:out value="${lf.qte}"></c:out></td>
                  <td><c:out value="${lf.prix}"></c:out></td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
          <div class="row">
              <div class="col s8"></div>
              <div class="col s2"><b>Total: <c:out value="${facture.prix}"></c:out></b></div>
          </div>
    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
