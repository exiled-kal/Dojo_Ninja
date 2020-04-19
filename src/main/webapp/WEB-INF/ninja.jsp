<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Title Here</title>
</head>
<body>
	<h1>Create a new Ninja!</h1>
	
	<form:form action="/ninja/new" method="POST" modelAttribute="ninjaObject">
	
		<p>
			<form:errors path="ninjaObject.*"></form:errors>
		</p>
		<p>
			Dojo Location:<form:label path="dojo"></form:label>
			<form:select path="dojo">
				<c:forEach items="${allDojos}" var="d">
					<form:option value="${d.id}">
						<c:out value="${d.name}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>			
		<p>
			<form:errors path="ninjaObject.*"></form:errors>
		</p>
		<p>
			First Name:<form:label path="firstName"></form:label>
			<form:errors path="firstName"></form:errors>
			<form:input path="firstName"></form:input>
		<p>
		
		<p>
			Last Name:<form:label path="lastName"></form:label>
			<form:errors path="lastName"></form:errors>
			<form:input path="lastName"></form:input>
		<p>
		
		<p>
			Age:<form:label path="age"></form:label>
			<form:errors path="age"></form:errors>
			<form:input path="age"></form:input>
		<p>
			<button type="submit">Create</button>
	</form:form>
	
	
</body>
</html> 