

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
    
    <body>
    <table width="100%"  >
         <tr>
              <td width="100%" height="100" valign="top"><div align="center"> 
                      <img src="head.png" id="Image1" alt="" style="width:1350px;height:100px;" >
                      <p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Welcome : <t:link action="/profile"><% String n=(String)session.getAttribute("uname"); 
                       out.print("" +n.toUpperCase());
%></t:link>&emsp;|&emsp;<t:link action="/Logout">Logout</t:link>
</td>
    </tr>
    </table>
</body>
</html>
