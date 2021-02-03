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
            <c:forEach var="f" items="${listFactures}">
            <tr>
                <td><c:out value="${f}"></c:out></td>
            </tr>
            </c:forEach>
        </table>
    </div>

    <%@include file="commons/footer.jsp" %>
  </body>
</html>
