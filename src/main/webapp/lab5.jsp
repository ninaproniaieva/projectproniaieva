<%-- 
    Document   : lab5
    Created on : 13.05.2021, 17:56:58
    Author     : skinf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
      
      
                <h1>My laboratory work №5</h1>

    
                    <h5>1.Удосконалити алгоритм linearSearch та застосувати його для аналізу тексту з минулої лабораторної роботи 4</h5>
                    <h5>2.Згенерувати список  17180 об'єктів з полями типу String та short</h5>
                    <h5>3.Створити та реалізувати алгорими сортування ( sortApproach2 ) та пошуку  ( sortApproach1 ) для згенерованого у п.2 списку</h5>
                    <h5>4.Створити та реалізувати алгоритм для багатопоточного лінійного пошуку на списку типу List(Integer)</h5>
              
                
                <h2>Шукане слово</h2>
                <h3><%=request.getAttribute("searchWord")%></h3>
               
                
                
                <h2>Відсортувати список об'єктів</h2>
                
                <h3>Невідсортований список об'єктів</h3>
                <h3><%=request.getAttribute("list")%></h3>
                
                
                <h3>Відсортовані поля типу String</h3>
                <h3><%=request.getAttribute("sortStr")%></h3>
                
                
                <h3>Відсортовані поля типу Short</h3>
                <h3><%=request.getAttribute("sortShr")%></h3>

                
                <h3>Відсортований список об'єктів</h3>
                <h3><%=request.getAttribute("sortedList")%></h3>
                
                
                <h2>Багатопотоковий пошук</h2>
                <h3><%=request.getAttribute("mts")%></h3>
                
                <div>

                    <form action="lab5form.jsp">

                    <input type="submit" value="New values">

                    </form>

                </div>


                <div>

                    <form action="index.jsp">

                    <input type="submit" value="Home">

                    </form>

                </div>
    </body>

</html>