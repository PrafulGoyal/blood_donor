<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<title>Find Blood Donor</title>
<meta name="generator" content="WYSIWYG Web Builder 9 - http://www.wysiwygwebbuilder.com">
<style type="text/css">
body
{
   background-color: #FFFFFF;
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
   color: #FF0000;
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
   background-color: #FAFAFA;
   border: 0px #000000 solid;
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
#Combobox1
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Combobox1_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color: #FF0000;
   font-family: 'Palatino Linotype';
   font-size: 16px;
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
#Combobox2
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Combobox2_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color: #FF0000;
   font-family: 'Palatino Linotype';
   font-size: 16px;
}
#wb_Text3 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
   text-align: left;
}
#wb_Text3 div
{
   text-align: left;
}
#Combobox3
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Combobox3_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color: #FF0000;
   font-family: 'Palatino Linotype';
   font-size: 16px;
}
#wb_Text4 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
   text-align: left;
}
#wb_Text4 div
{
   text-align: left;
}
#Editbox1
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Editbox1_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: 'Palatino Linotype';
   font-size: 16px;
   text-align: left;
   vertical-align: middle;
}
#Button1
{
   border: 1px #FF0000 solid;
   background-color: transparent;
   background-image: url(images/index_Button1_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color: #FF0000;
   font-family: 'Palatino Linotype';
   font-size: 16px;
}
</style>
<script type="text/javascript">
function ValidateForm1(theForm)
{
   var regexp;
   if (theForm.Combobox1.selectedIndex < 0)
   {
      alert("Blood Group Is Required");
      theForm.Combobox1.focus();
      return false;
   }
   if (theForm.Combobox1.selectedIndex == 0)
   {
      alert("Blood Group Is Required");
      theForm.Combobox1.focus();
      return false;
   }
   if (theForm.Combobox2.selectedIndex < 0)
   {
      alert("State is Required");
      theForm.Combobox2.focus();
      return false;
   }
   if (theForm.Combobox2.selectedIndex == 0)
   {
      alert("State is Required");
      theForm.Combobox2.focus();
      return false;
   }
   if (theForm.Combobox3.selectedIndex < 0)
   {
      alert("City is Required");
      theForm.Combobox3.focus();
      return false;
   }
   if (theForm.Combobox3.selectedIndex == 0)
   {
      alert("City is Required");
      theForm.Combobox3.focus();
      return false;
   }
   regexp = /^[A-Za-zÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]*$/;
   if (!regexp.test(theForm.Editbox1.value))
   {
      alert("Locality is Required");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value == "")
   {
      alert("Locality is Required");
      theForm.Editbox1.focus();
      return false;
   }
   return true;
}
</script>
</head>
<body>
     <img src="head.png" width="100%" />
         <%@include file="/Umenu.jsp"  %><br><br></br>
<div id="wb_Form1" style="position:absolute;left:500px;top:250px;width:346px;height:243px;z-index:9;">

    <center>
        <t:form  method="post"  action="/bjfind"  onsubmit="return ValidateForm1(this)">
<div id="wb_Text1" style="position:absolute;left:21px;top:23px;width:88px;height:16px;z-index:0;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Blood Group :</span></div>
<select name="bldgrp" size="1" id="Combobox1" style="position:absolute;left:130px;top:23px;width:200px;height:27px;z-index:1;">
<option selected>Select one Blood Group</option>
<option value="A+">A+</option>
<option value="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="AB+">AB+</option>
<option value="AB-">AB-</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</select>
<div id="wb_Text2" style="position:absolute;left:23px;top:62px;width:77px;height:16px;z-index:2;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">State :</span></div>
<select name="state" size="1" id="Combobox2" style="position:absolute;left:131px;top:62px;width:200px;height:26px;z-index:3;">
<option selected>Select one State</option>
<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="New Delhi">New Delhi</option>
<option value="Orissa">Orissa</option>
<option value="Puducherry">Puducherry</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="West Bengal">West Bengal</option>

</select>
<div id="wb_Text3" style="position:absolute;left:25px;top:102px;width:77px;height:16px;z-index:4;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">City :</span></div>
<select name="city" size="1" id="Combobox3" style="position:absolute;left:132px;top:104px;width:200px;height:26px;z-index:5;">
<option selected>Select any City</option>
<option value="Agartala">Agartala</option>
<option value="Aizawl">Aizawl</option>
<option value="Bengaluru">Bengaluru</option>
<option value="Bhopal">Bhopal</option>
<option value="Bhubaneshwar">Bhubaneshwar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chennai">Chennai</option>
<option value="Daman">Daman</option>
<option value="Dehradun">Dehradun</option>
<option value="Delhi">Delhi</option>
<option value="Dispur">Dispur</option>
<option value="Gandhinagar">Gandhinagar</option>
<option value="Gangtok">Gangtok</option>
<option value="Hyderabad">Hyderabad</option>
<option value="Imphal">Imphal</option>
<option value="Itanagar">Itanagar</option>
<option value="Jaipur">Jaipur</option>
<option value="Kavaratti">Kavaratti</option>
<option value="Kohima">Kohima</option>
<option value="Kolkata">Kolkata</option>
<option value="Lucknow">Lucknow</option>
<option value="Mumbai">Mumbai</option>   
<option value="Nagpur">Nagpur</option>
<option value="New Delhi">New Delhi</option>
<option value="Patna">Patna</option>
<option value="Port Blair">Port Blair</option>
<option value="Puducherry">Puducherry</option>
<option value="Raipur">Raipur</option>
<option value="Ranchi">Ranchi</option>
<option value="Shillong">Shillong</option>
<option value="Shimla">Shimla</option>
<option value="Silvasa">Silvasa</option>
<option value="Srinagar">Srinagar</option>
<option value="Thiruvananthapuram">Thiruvananthapuram</option>
<option value="Vijayawada">Vijayawada</option>
</select>
<div id="wb_Text4" style="position:absolute;left:26px;top:143px;width:77px;height:16px;z-index:6;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Locality :</span></div>
<input type="text" id="Editbox1" style="position:absolute;left:132px;top:145px;width:198px;height:23px;line-height:23px;z-index:7;" name="locality">
<input type="submit" id="Button1" name="find" value="Find Blood" style="position:absolute;left:175px;top:180px;width:103px;height:27px;z-index:8;">
        </t:form></center>
     
</div>
<br></br><br></br><br></br><br></br><br></br><br></br><br></br><br><br></br><br></br><br></br><br><br></br><br></br><br></br><br><img src="Footer.png" width="100%" height="100" />
</body>
</html>