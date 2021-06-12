
<%-- 
    Document   : lab2form

    Created on : 12.04.2021, 17:32:12
    Author     : skinf
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>a=7</h1>
        <h1>b=-5</h1>
        <h1>c=-9</h1>
        <h1>d=8</h1>
        <h1>Insert your X!</h1>
        <div>
        <form action="./lab2" method="post">
            
            <input type="text" name="x" placeholder="enter x as ##.###"/>
            <input type="submit" value="OK"/>
        </form> 
        </div>
        
        
        
    </body>
</html>
