<%-- 
    Document   : Logged
    Created on : Oct 19, 2014, 12:05:39 AM
    Author     : Ankit Kushwaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><% String m=(String)session.getAttribute("uname"); 
                       out.print(m.toUpperCase()); %> Profile</title>
    </head>
    <body> <br></br><t:errors />${requestScope.msg}<br></br>
        <h1>You are Logged in as:</h1><% String n=(String)session.getAttribute("uname"); 
                       out.print("<h1>" +n.toUpperCase()+"</h1>");
%>
<br></br>
<!--<form method="post" action="Picupload" enctype="multipart/form-data">
    <table border="0">
        <tr>
                    <td>Portrait Photo: </td>
                    <td><input type="file" name="photo" size="100"/></td>
        </tr>
        <tr>
                    <td colspan="2">
                        <input type="submit" value="Upload">
                    </td>
        </tr>
    </table>
    
</form>!-->



        <br></br>Fill Details About Your Last Donated Blood<br></br>
        <t:link action="/donated">Last Donated Blood</t:link>
        <br></br>write your feedback<br></br>
        <t:link action="/feedback">feedback</t:link>
    </body>
</html>
