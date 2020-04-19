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

<h2>  <c:out value="${ dojo.name }" /> </h2>

 <c:forEach items="${ ninjas }" var="ninja">
	<div>
	<span> <c:out value="${ ninja.firstName } " /> </span>
	<span> <c:out value="${ ninja.lastName } " /> </span>
	<span> <c:out value="${ ninja.age } " /> </span>
	</div>
			
</c:forEach>
</body>
</html>