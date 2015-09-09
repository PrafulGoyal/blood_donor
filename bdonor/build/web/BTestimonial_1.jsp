<%-- 
    Document   : Findresult
    Created on : Oct 21, 2014, 5:30:49 PM
    Author     : Ankit Kushwaha
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="h" uri="http://struts.apache.org/tags-html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
       

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testimonial's</title>
    </head>
    <body>
          <img src="head.png" width="100%" />
          <%@include file="/Umenu.jsp"  %><br><br>
    <center>Testimonial</br></br>
  <table align="center" style="width:870px;height:44px;" border="1" cellpadding="0" cellspacing="1" id="Table1">
      <tr >

<td  style="background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:160px;height:25px;"><div><span style="color:red;font-family:Arial;font-size:20px;">Full Name</span></div>&nbsp;</td>
<td style="background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:110px;height:25px;"><div><span style="color:red;font-family:Arial;font-size:20px;"> E-Mail</span></div>&nbsp;</td>
<td style="background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:110px;height:25px;"><div><span style="color:red;font-family:Arial;font-size:20px;"> Phone</span></div>&nbsp;</td>
<td style="background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:110px;height:25px;"><div><span style="color:red;font-family:Arial;font-size:20px;"> Location</span></div>&nbsp;</td>
<td style="background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:200px;height:25px;"><div><span style="color:red;font-family:Arial;font-size:20px;"> Feedback</span></div>&nbsp;</td>

</tr>


        <% try {
       
             Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bdonor","root","");
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select name,email,phone,location,feedback from feedback ");

while(rs.next())
{
 

out.println("<tr><td ><div><span>"+rs.getString(1)+"</span></div></td>");
out.println("<td>"+rs.getString(2)+"</td>");
out.println("<td>"+rs.getString(3)+"</td>");
out.println("<td>"+rs.getString(4)+"</td>");
out.println("<td>"+rs.getString(5)+"</td></tr>");
  //return mapping.findForward("fr");
    

}
            
   
        }
        catch(Exception e)
{
out.println(e.getMessage());
}
   
%>
  </table>
  <br></br><br></br><br></br><br></br><br></br><br><img src="Footer.png" width="100%" height="100" />
         </center>    
      
        
        
     </body>
</html>
