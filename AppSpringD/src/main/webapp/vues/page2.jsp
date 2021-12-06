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
		<h1>Liste des Magasins</h1>
		<table border="1">
		<c:forEach items="${liste }" var="Magasin">
		<tr> <td> ${Magasin.id }</td>
     		<td> ${Magasin.nom }</td>
     		<td> ${Magasin.lieu }</td>
     		
		</tr>
		</c:forEach>
   	</tbody>
   ><a href="addProduct">Add Produit</a>

</table>
</body>
</html>