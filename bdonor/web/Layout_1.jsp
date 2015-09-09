<%-- 
    Document   : Layout
    Created on : Oct 18, 2014, 9:56:37 PM
    Author     : Ankit Kushwaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bdonor-The Savior in you</title>
    </head>
    <body>
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td height="30" width="100%" colspan="3" valign="top">
                    <t:insert attribute="HEADER"></t:insert>
                </td>
            </tr>
           
            <tr>
                <td height="100%" width="150" valign="top">
                    <t:insert attribute="MENU"></t:insert>
                </td>
                <td   height="600" width="850"  valign="top">
                <t:insert  attribute="BODY"></t:insert>
                </td>
            </tr>
             <tr>
                <td height="50" colspan="3" valign="top">
                    <t:insert attribute="FOOTER"></t:insert>
                </td>
            </tr>
        </table>
    </body>
</html>
