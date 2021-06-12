<%-- 
    Document   : lab3
    Created on : 15.04.2021, 14:48:35
    Author     : skinf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lab 3</title>
    </head>
    <body>
        <h1>It's my laboratory work №3!</h1>
        <h2> Заповнити масив 100 натуральних випадкових чисел в діапазоні від 1 до k (k<20) включно. Визначити, скільки з них приймає найбільше значення.  </h2>
        <h3> Results: </h3>
        
        <p> <%=request.getAttribute("output2")%> </p>
        <p> <%=request.getAttribute("output")%> </p>

<form action="lab3form.jsp">
    <input type= "submit" value="Return to input X">
</form>
  
<a href="index.jsp">Home</a>
        
        
        
        
    </body>
</html>

