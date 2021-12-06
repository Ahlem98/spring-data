<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des produits</h1>
<table border="1">
<c:forEach items="${liste }" var="Produit">
<tr> <td> ${Produit.num }</td><td> ${Produit.description }</td><td> ${Produit.prix_achat }</td><td> ${Produit.prix_vente }</td><td> ${Produit.date }</td><td> ${Produit.qte }</td><tr>
</c:forEach>
</table>

</body>
</html>