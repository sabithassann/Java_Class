<%-- 
    Document   : index
    Created on : 23 Oct 2023, 10:35:05
    Author     : user
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% Date date=new Date();
    %>
    <body>
        <h1>Jsp Page</h1>
        <h1>Todays Date</h1>
        <p>Todays Date is <%=date%></p>
    </body>
</html>
