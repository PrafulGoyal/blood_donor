<%-- 
    Document   : Find
    Created on : Oct 21, 2014, 12:38:10 PM
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
    <center>
        <h1><font color="red"> Find Blood & Donor</h1>
        <t:form action="/jfind" method="post">
        Blood Group : <select name="bldgrp" size="1" id="Combobox1"><br><br>
<option selected value="Select">Select Your Blood Group</option>
<option value="A-">A-</option>
<option value="A+">A+</option>
<option value="B-">B-</option>
<option value="B+">B+</option>
<option value="AB-">AB-</option>
<option value="AB+">AB+</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</select>
        </br></br> State : <select name="state" size="1" id="Combobox3" ><br><br></br>
<option selected value="select">Select any State</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="Haryana">Haryana</option>
<option value="Jammu & Kashmir">Jammu & Kashmir</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
</select>
        <br></br> City : <select name="city" size="1" id="Combobox4"><br><br>
<option selected value="Select">Select Any City</option>
<option value="Dehradun">Dehradun</option>
<option value="New Delhi">New Delhi</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Srinagar">Srinagar</option>
<option value="Lucknow">Lucknow</option>
</select>
        </br><br> Locality : <select name="locality" size="1" id="Combobox5"><br><br>
<option selected value="Select">Select Any Locality</option>
<option value="Raipur">Raipur</option>
<option value="Rajpur">Rajpur</option>
<option value="Vikasnagar">Vikasnagar</option>
<option value="Mussurie">Mussurie</option>
</select>
        <br><br><input type="submit" value="Find Blood" name="find"/>
           </t:form>
    </center>
    </body>
</html>
