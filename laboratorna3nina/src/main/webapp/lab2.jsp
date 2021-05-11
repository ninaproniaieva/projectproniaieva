<%-- 
    Document   : lab2
    Created on : 12.04.2021, 19:30:49
    Author     : skinf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lab 2</title>
    </head>
    <body>
        <h1>It's my laboratory work №2!</h1>
        <h3> Results: </h3>
        <p> <%=request.getAttribute("result")%> </p>

<form action="lab2form.jsp">
    <input type= "submit" value="Return to input X">
</form>
  
<a href="index.jsp">Home</a>
        
        
        
        
    </body>
</html>
