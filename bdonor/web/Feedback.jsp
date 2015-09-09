<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html" %>
<title>Feedback</title>
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
#Editbox1
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
  
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
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
#Editbox2
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Editbox2_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
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
#Editbox3
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Editbox3_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
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
#Editbox4
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_Editbox4_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#wb_Text5 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
   text-align: left;
}
#wb_Text5 div
{
   text-align: left;
}
#TextArea1
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_TextArea1_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   resize: none;
}
#wb_Text6 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
   text-align: left;
}
#wb_Text6 div
{
   text-align: left;
}
#TextArea2
{
   border: 1px #A9A9A9 solid;
   background-color: transparent;
   background-image: url(images/index_TextArea2_bkgrnd.png);
   background-repeat: repeat-x;
   background-position: left top;
   color :#FF0000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   resize: none;
}
#Button1
{
  
}
</style>
<script type="text/javascript">
function Validatecontact(theForm)
{
   var regexp;
   regexp = /^[A-Za-zÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖØÙÚÛÜİŞßàáâãäåæçèéêëìíîïğñòóôõöøùúûüışÿ]*$/;
   if (!regexp.test(theForm.Editbox1.value))
   {
      alert("Name is Required");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value == "")
   {
      alert("Name is Required");
      theForm.Editbox1.focus();
      return false;
   }
   regexp = /^([0-9a-z]([-.\w]*[0-9a-z])*@(([0-9a-z])+([-\w]*[0-9a-z])*\.)+[a-z]{2,6})$/i;
   if (!regexp.test(theForm.Editbox2.value))
   {
      alert("Email Address is Required");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value == "")
   {
      alert("Email Address is Required");
      theForm.Editbox2.focus();
      return false;
   }
   regexp = /^[-+]?\d*\.?\d*$/;
   if (!regexp.test(theForm.Editbox3.value))
   {
      alert("Please enter only digit characters in the \"phone\" field.");
      theForm.Editbox3.focus();
      return false;
   }
   if (theForm.Editbox3.value.length < 10)
   {
      alert("Please enter at least 10 characters in the \"phone\" field.");
      theForm.Editbox3.focus();
      return false;
   }
   if (theForm.Editbox3.value.length > 10)
   {
      alert("Please enter at most 10 characters in the \"phone\" field.");
      theForm.Editbox3.focus();
      return false;
   }
   regexp = /^[A-Za-zÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖØÙÚÛÜİŞßàáâãäåæçèéêëìíîïğñòóôõöøùúûüışÿ]*$/;
   if (!regexp.test(theForm.Editbox4.value))
   {
      alert("Location is Required");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.Editbox4.value == "")
   {
      alert("Location is Required");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.TextArea1.value == "")
   {
      alert("Feedback is Required");
      theForm.TextArea1.focus();
      return false;
   }
   return true;
}
</script>
</head>
<body>
    <center><h1>Your Feedback and Suggestions Here</h1>
    <br></br><t:errors />${requestScope.msg}<br><br></br>
    
<div id="wb_Form1" style="position:absolute;left:500px;top:250px;width:534px;height:406px;z-index:13;">
<t:form  action="/sendfeed" method="post"  onsubmit="return Validatecontact(this)">
<div id="wb_Text1" style="position:absolute;left:10px;top:15px;width:74px;height:16px;z-index:0;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Name:</span></div>
<input type="text" id="Editbox1" style="position:absolute;left:94px;top:15px;width:198px;height:23px;line-height:23px;z-index:1;" name="name" value="">
<div id="wb_Text2" style="position:absolute;left:10px;top:45px;width:74px;height:16px;z-index:2;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Email:</span></div>
<input type="text" id="Editbox2" style="position:absolute;left:94px;top:45px;width:198px;height:23px;line-height:23px;z-index:3;" name="email" value="">
<div id="wb_Text3" style="position:absolute;left:10px;top:75px;width:74px;height:16px;z-index:4;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Phone No.:</span></div>
<input type="text" id="Editbox3" style="position:absolute;left:95px;top:75px;width:198px;height:23px;line-height:23px;z-index:5;" name="phone" value="">
<div id="wb_Text4" style="position:absolute;left:10px;top:105px;width:74px;height:16px;z-index:6;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Location:</span></div>
<input type="text" id="Editbox4" style="position:absolute;left:94px;top:105px;width:198px;height:23px;line-height:23px;z-index:7;" name="location" value="">
<div id="wb_Text5" style="position:absolute;left:10px;top:135px;width:74px;height:16px;z-index:8;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Feedback:</span></div>
<textarea name="feedback" id="TextArea1" style="position:absolute;left:95px;top:135px;width:330px;height:98px;z-index:9;" rows="5" cols="49">Love to here your feedback....</textarea>
<div id="wb_Text6" style="position:absolute;left:10px;top:240px;width:74px;height:16px;z-index:10;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Suggestion:</span></div>
<textarea name="suggest" id="TextArea2" style="position:absolute;left:94px;top:240px;width:331px;height:97px;z-index:11;" rows="5" cols="49">Your Suggestion here.....</textarea>
<input type="submit" id="Button1" name="submit" value="Submit" style="background-color: #FF0000; position:absolute;left:94px;top:345px;width:96px;height:25px;z-index:12;">
</t:form>
</div></center>
</body>
</html>