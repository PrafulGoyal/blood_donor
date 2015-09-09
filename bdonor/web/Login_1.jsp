<!DOCTYPE html>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
<!--[if lt IE 7 ]> <html lang="en" class="ie6 ielt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="ie7 ielt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="ie8"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta charset="utf-8">
<title>Login To the BDonor </title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <img src="head.png" width="100%" />
    <%@include file="Umenu.jsp"  %><br><br></br></br>
<div class="container">
	<section id="content">
            <br> <t:errors />${requestScope.msg}
            <t:form action="/jlogin" method="post">
			<h1>Login To Your Account </h1>
                        
			<div>
				<input type="text" placeholder="Username" required="" name="t1" />
			</div>
			<div>
				<input type="password" placeholder="Password" required="" name="t2" />
			</div>
			<div>
				<input type="submit" value="Log in" />
                                <t:link action="/jsignup">Register</t:link>
				
			</div>
                </t:form><!-- form -->
		<div class="button">
			
		</div><!-- button -->
	</section><!-- content -->
</div><!-- container --><br><img src="Footer.png" width="100%" height="100" />

</body>
</html>