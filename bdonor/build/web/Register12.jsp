<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<style type="text/css">
body
{
   background-color: #FFFFFF;
   background-image: url(none);
   color: #000000;
   font-family: Arial;
   font-size: 13px;
   margin: 0;
   padding: 0;
}
</style>
<style type="text/css">
a
{
   color: #0000FF;
   text-decoration: underline;
}
a:visited
{
   color: #800080;
}
a:active
{
   color: #0000FF;
}
a:hover
{
   color: #0000FF;
   text-decoration: underline;
}
</style>
<style type="text/css">
#wb_Form1
{
   background-color: transparent;
   border: 0px #000000 solid;
}
#Editbox1
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color :#A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Combobox1
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color: #A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
}
#Combobox2
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color: #A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
}
#Editbox2
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color :#A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Combobox3
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color: #A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
}
#Combobox4
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color: #A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
}
#Combobox5
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color: #A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
}
#Editbox4
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color :#A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Editbox5
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color :#A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Editbox6
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color :#A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Combobox6
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color: #A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
}
#Button1
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #F0F0F0;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#wb_Text1 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
   text-align: left;
}
#wb_Text1 div
{
   text-align: left;
}
#Image2
{
   border: 0px #000000 solid;
}
#wb_Text2 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
   text-align: left;
}
#wb_Text2 div
{
   text-align: left;
}
#Editbox3
{
   border: 1px #A9A9A9 solid;
   -moz-border-radius: 3px;
   -webkit-border-radius: 3px;
   border-radius: 3px;
   background-color: #FFFFFF;
   color :#A9A9A9;
   font-family: 'Courier New';
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
</style>
</head>

<body>
    
<t:form  method="post" action="/jregister" >
    
     <table width="100%" border="1" cellpadding="0" bgcolor="blue" cellspacing="0">
        
         <tr>
                 
 
<div id="wb_Form1"  style="position:absolute;left:160px;top:110px;width:444px;height:520px;z-index:15;">
    
<input type="text" id="Editbox1" style="position:absolute;left:180px;top:20px;width:208px;height:20px;line-height:20px;z-index:0;" name="name" value="">
<select name="bldgrp" size="1" id="Combobox1" style="position:absolute;left:180px;top:54px;width:211px;height:22px;" >
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
<select name="gender" size="1" id="Combobox2" style="position:absolute;left:180px;top:84px;width:210px;height:22px;z-index:1;">
<option selected value="Select">Select Your Gender</option>
<option value="Male">Male</option>
<option value="Female">Female</option>
<option value="other">Other Specified</option>
</select>
<input type="text" id="Editbox2" style="position:absolute;left:180px;top:115px;width:206px;height:20px;line-height:20px;z-index:2;" name="dob" value="">
<select name="state" size="1" id="Combobox3" style="position:absolute;left:179px;top:179px;width:208px;height:22px;z-index:3;">
<option selected value="select">Select any State</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="Haryana">Haryana</option>
<option value="Jammu & Kashmir">Jammu & Kashmir</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
</select>
<select name="city" size="1" id="Combobox4" style="position:absolute;left:180px;top:211px;width:207px;height:22px;z-index:4;">
<option selected value="Select">Select Any City</option>
<option value="Dehradun">Dehradun</option>
<option value="New Delhi">New Delhi</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Srinagar">Srinagar</option>
<option value="Lucknow">Lucknow</option>
</select>
<select name="locality" size="1" id="Combobox5" style="position:absolute;left:180px;top:245px;width:208px;height:22px;z-index:5;">
<option selected value="Select">Select Any Locality</option>
<option value="Raipur">Raipur</option>
<option value="Rajpur">Rajpur</option>
<option value="Vikasnagar">Vikasnagar</option>
<option value="Mussurie">Mussurie</option>
</select>
<input type="text" id="Editbox4" style="position:absolute;left:180px;top:277px;width:209px;height:20px;line-height:20px;z-index:6;" name="email" value="">
<input type="text" id="Editbox5" style="position:absolute;left:180px;top:309px;width:209px;height:20px;line-height:20px;z-index:7;" name="uname" value="">
<input type="password" id="Editbox6" style="position:absolute;left:180px;top:340px;width:207px;height:20px;line-height:20px;z-index:8;" name="password" value="">
<select name="avail" size="1" id="Combobox6" style="position:absolute;left:180px;top:374px;width:183px;height:22px;z-index:9;">
<option selected value="Select">Select Availability</option>
<option value="Available">Available</option>
<option value="Un-Available">Un-Available</option>
</select>
<input type="checkbox" id="Checkbox1" name="Checkbox1" value="on" style="position:absolute;left:3px;top:423px;z-index:10;">
<input type="submit" id="Button1" name="" value="Register" style="position:absolute;left:116px;top:462px;width:136px;height:24px;z-index:11;">
<div id="wb_Text2" style="position:absolute;left:36px;top:413px;width:375px;height:32px;z-index:12;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">I authorize Bdonor.com to Display my Name, phone no.,Email<br>and can be contacted by anyone and anytime at emergency.</span></div>
<div id="wb_Text1" style="position:absolute;left:22px;top:25px;width:91px;height:432px;z-index:13;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Full Nameame:<br><br>Blood Group:<br><br>Gender:<br><br>DOB:<br><br>Phone:<br><br>State:<br><br>City:<br><br>Locality:<br><br>Email:<br><br>Username:<br><br>Password:<br><br>Availabilty:<br><br><br> </span></div>
<input type="text" id="Editbox3" style="position:absolute;left:180px;top:145px;width:206px;height:20px;line-height:20px;z-index:14;" name="dob" value="">
</t:form>
</div>
 

<div id="wb_Image2" style="position:absolute;left:658px;top:92px;width:487px;height:589px;z-index:17;">
<img src="images/Superman.gif" id="Image2" alt="" style="width:487px;height:589px;"></div>
            </tr>
        </table><br><br><br><br><br><br><br><br><br><br><br><br>
    
   
</body>
</html>