<%-- 
    Document   : Login
    Created on : Oct 18, 2014, 11:56:25 PM
    Author     : Ankit Kushwaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <t:form action="/jlogin" method="post">
            Username:<input type="text" name="t1"/>
            Password:<input type="password" name="t2"/>
            <input type="submit" value="Login" name="login"/>
        </t:form>
    </body>
</html>
