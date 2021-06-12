<%-- 
    Document   : lab1
    Created on : 11.04.2021, 13:44:20
    Author     : skinf
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>It's my Laboratory work №1!</h1>
        
      <%!MyFirstJavaClass nFJC = new MyFirstJavaClass(5);%>
        
        <%
          int x= nFJC.getMyInt();
          
          x+=3;
          x%=3;
          
         %>
        
         <p>8mod3 = <%=x%></p>
       
        <a href="index.jsp">Home</a>
    </body>
</html>
