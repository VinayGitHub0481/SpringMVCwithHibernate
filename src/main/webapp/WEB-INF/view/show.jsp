<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList"
     import="java.time.LocalDateTime"%>
  
  <%@page isELIgnored="false" %>   
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to my page</h1>

<h1>Tollywood hero is: ${msg}  Id is: ${id } </h1>

	<h1>List of Objects are: ${list }</h1>

 <h1>Present Time is: ${lc }</h1>

 <c:forEach var="a" items="${list }">
 <h2 align="center" style="color: red;">${a }</h2>
 </c:forEach>
 
</body>
</html>