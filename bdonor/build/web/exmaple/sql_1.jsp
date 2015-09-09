<%-- 
    Document   : sql
    Created on : Oct 27, 2014, 1:31:04 PM
    Author     : Ankit Kushwaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="h" uri="http://struts.apache.org/tags-html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
        <sql:setDataSource driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/bdonor"
                           user="root" password="password" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <sql:query var="rs" sql="select name,bldgrp from register"/>
        <c:forEach var="row" items="${rs.rows}">
           ${row.name}${row.bldgrp}
           <%-- <h:option value="${row.name}">${row.name}</h:option>
          <h:option value="${row.bldgrp}">${row.bldgrp}</h:option>
       --%>  </c:forEach>
    </body>
</html>
