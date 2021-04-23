<%-- 
    Document   : lab1
    Created on : 16 апр. 2021 г., 11:35:49
    Author     : Администратор
--%>

<%@page import="knu.fit.ist.LabTA1.NewClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab TA #1</title>
    </head>
    <body>
        <h1>Laboratory work #1 </h1>
        
                <%! NewClass Val = new NewClass();%>

        <%
            int x = Val.getVal();
            x += 5;
            x /= 5;
        %>
        <p>30 divide by 10 equals to <%=x%></p>
        
        <a href="index.jsp">Home</a>
        
    </body>
</html>
