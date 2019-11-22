<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="add" action="insertSchool" method="post">
	<table border="1">
		<tr>
			<td>School Name</td>
			<td><input type="text" name="name" value="${name}">
			<c:if test="${not empty val}">
					<input type="hidden" name="id" value="${id}">
			</c:if>
    		
    			
    			</td>
			
			
		</tr>
		<tr>
			<td>District</td>
			<td><input type="text" name="district" value="${dist}"></td>
		</tr>
		<tr>
			<td>Strength</td>
			<td><input type="text" name="strength" value="${str}"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add School"></td>
		</tr>
	</table>
</form>

	<table border="1">
	<tr>
		<th>School Name</th>
		<th>District</th>
		<th>Strength</th>
	</tr>
	
		<c:forEach items="${list}" var="sch">
		<tr>
			
			<td>${sch.name}</td>
			<td>${sch.district}</td>
			<td>${sch.strength}</td>
			<td><a href="edit?r=up&id=${sch.id}&name=${sch.name}&dis=${sch.district}&str=${sch.strength}">Edit</a></td>
			<td><a href="delete?id=${sch.id}">Delete</a></td>
			</tr>
		</c:forEach>

</table>


</body>
</html>