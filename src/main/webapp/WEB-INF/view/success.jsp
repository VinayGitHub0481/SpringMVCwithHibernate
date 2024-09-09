<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Viewers</title>
</head>
<body>
<%-- <% String st=(String)request.getAttribute("mail");
   String st1=(String)request.getAttribute("name");
   String pass=(String)request.getAttribute("pass");
%>
<h1>User mail is <%=st %></h1> <h1>User name is <%=st1 %></h1> 
<h1>User pass is <%=pass%></h1> --%>
<div class="container">
<form>
<h1 class="text-center mt-5">${Header }</h1>
<P class="text-center">${Desc }</P>
 <h1>User Email:${email }</h1>
<h1>User Name is:${uName }</h1>
<h1>User Password is:${pass }</h1> 
</form>
</div>
</body>
</html>