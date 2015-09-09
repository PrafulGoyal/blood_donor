<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
        <head>
                <title>Free Menu Designs - e-lusion.com</title>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
                <meta name="author" content="Ian Main" />
                <meta name="Copyright" content="Creative Commons - http://creativecommons.org/licenses/by/2.0/" />
                <style type="text/css">
<!--
body {
        font-family: Verdana, Arial, Helvetica, sans-serif;
        margin: 0;
        font-size: 80%;
        font-weight: bold;
        background: #F3FAFF;
        }

ul {
        list-style: none;
        margin: 0;
        padding: 0;
        }

/* =-=-=-=-=-=-=-[Menu Eight]-=-=-=-=-=-=-=- */

#menu8 {
        width: 200px;
        margin-top: 10px;
        }

#menu8 li a {
        text-decoration: none;
        height: 32px;
          voice-family: "\"}\"";
          voice-family: inherit;
          height: 24px;
        }

#menu8 li a:link, #menu8 li a:visited {
        color: #777;
        display: block;
        background: url(menu8.gif);
        padding: 8px 0 0 20px;
        }

#menu8 li a:hover, #menu8 li #current {
        color: #257EB7;
        background: url(menu8.gif) 0 -32px;
        padding: 8px 0 0 25px;
        }

#menu8 li a:active {
        color: black;
        background: url(menu8.gif) 0 -64px;
        padding: 8px 0 0 25px;
        }
-->
</style>
        </head>

        <body>
                <div id="menu8">
                        <ul>
                                <!-- CSS Tabs -->
                                 <li><t:link action="jmain">Home</t:link></li>
                                 <li><t:link action="login">Login</t:link></li>
                                <li><t:link action="/jfindblood">Find Donor</t:link></li>
                                <li><t:link action="/donorlist">Donated List</t:link></li>
                                <li><t:link action="/invite">Invite Friends</t:link></li>
                                <li><t:link action="jsignup">Register</t:link></li>
                                <li><t:link action="/apps">Download Apps</t:link></li>
                                <li><t:link action="/testi">Testimonial</t:link></li>
                                <li><t:link action="/founder">Founders</t:link></li>
                                <li><t:link action="/faqs">FAQ's</t:link></li>
                        </ul>
                </div>
        </body>
</html>