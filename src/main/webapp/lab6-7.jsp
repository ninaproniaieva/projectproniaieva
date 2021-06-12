<%-- 
    Document   : lab6-7
    Created on : 21.05.2021, 13:01:39
    Author     : skinf
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab7.Tree"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lab 6-7</title>
    </head>
    <body>
        <h1>lab 6 is not ready </h1>
        
        <h3> Лабораторна робота 7: Tree</h3>

<%
    List<Integer> arr = Arrays.asList(9, 2, 8, 4, 10, 11, 7, 5);
    Collections.sort(arr);
    Tree tree = new Tree(arr);
%>
<h2> Tree Array: (9, 2, 8, 4, 10, 11, 7, 5) </h2>
<p> Recursion Tree:-- <%= tree.getPostOrder() %></p>
<p> Iterative Tree:-- <%= tree.getPostOrderIterative() %></p>

<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>
    </body>
</html>
