<%-- 
    Document   : Donatedlist
    Created on : Oct 22, 2014, 11:04:35 AM
    Author     : Ankit Kushwaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Last Donation Details</title>
    </head>
    <body>
    <center>
        <h1>Last Donated Blood Details</h1></br><t:errors />${requestScope.msg}
        <br></br><br></br>
        <t:form action="/dblood" method="post">
            Donated Date:<input type="date" name="ldate"/></br></br>
            Patient Name:<input type="text" name="pname"/></br></br>
            Location:<input type="text" name="location"/></br></br>
            Hospital Name:<input type="text" name="hospital"/></br></br>
            <input type="submit" value="Submit" name="submit"/>
        </t:form>
        
    </center>
    </body>
</html>
