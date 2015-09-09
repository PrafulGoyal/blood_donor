package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/Umenu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_link_action.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>JSP Page</title>\r\n");
      out.write("<meta name=\"generator\" content=\"WYSIWYG Web Builder 9 - http://www.wysiwygwebbuilder.com\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   background-image: url(none);\r\n");
      out.write("   color: #000000;\r\n");
      out.write("   font-family: Arial;\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   margin: 0;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a\r\n");
      out.write("{\r\n");
      out.write("   color: #0000FF;\r\n");
      out.write("   text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("a:visited\r\n");
      out.write("{\r\n");
      out.write("   color: #800080;\r\n");
      out.write("}\r\n");
      out.write("a:active\r\n");
      out.write("{\r\n");
      out.write("   color: #0000FF;\r\n");
      out.write("}\r\n");
      out.write("a:hover\r\n");
      out.write("{\r\n");
      out.write("   color: #0000FF;\r\n");
      out.write("   text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#wb_Form1\r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("}\r\n");
      out.write("#Editbox1\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Combobox1\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("#Combobox2\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("#Editbox2\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Editbox3\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Combobox3\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("#Combobox4\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("#Editbox4\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Editbox5\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Editbox6\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Combobox6\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("#Button1\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #F0F0F0;\r\n");
      out.write("   color: #000000;\r\n");
      out.write("   font-family: Arial;\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("#Image2\r\n");
      out.write("{\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text2 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text2 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text3 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text3 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text4 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text4 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text5 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text5 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text6 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text6 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text7 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text7 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text8 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text8 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text9 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text9 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text10 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text10 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text11 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text11 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text12 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text12 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text13 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text13 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text1 \r\n");
      out.write("{\r\n");
      out.write("   background-color: transparent;\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#wb_Text1 div\r\n");
      out.write("{\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("#Editbox7\r\n");
      out.write("{\r\n");
      out.write("   border: 1px #A9A9A9 solid;\r\n");
      out.write("   -moz-border-radius: 3px;\r\n");
      out.write("   -webkit-border-radius: 3px;\r\n");
      out.write("   border-radius: 3px;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   color : #FF0000;\r\n");
      out.write("   font-family: 'Courier New';\r\n");
      out.write("   font-size: 13px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#Image4\r\n");
      out.write("{\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("}\r\n");
      out.write("#Image1\r\n");
      out.write("{\r\n");
      out.write("   border: 0px #000000 solid;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ValidateRegisterBean(theForm)\r\n");
      out.write("{\r\n");
      out.write("   var regexp;\r\n");
      out.write("   if (theForm.Editbox1.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Name is required\");\r\n");
      out.write("      theForm.Editbox1.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox1.value.length < 1)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Name is required\");\r\n");
      out.write("      theForm.Editbox1.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox1.value.length > 50)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Name is required\");\r\n");
      out.write("      theForm.Editbox1.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox2.selectedIndex < 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Gender is required\");\r\n");
      out.write("      theForm.Combobox2.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox2.selectedIndex == 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Gender is required\");\r\n");
      out.write("      theForm.Combobox2.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   regexp = /(0[1-9]|[12][0-9]|3[01])[- \\/.](0[1-9]|1[012])[- \\/.](19|20)[0-9]{2}/;\r\n");
      out.write("   if (!regexp.test(theForm.Editbox2.value))\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Date is required\");\r\n");
      out.write("      theForm.Editbox2.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox2.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Date is required\");\r\n");
      out.write("      theForm.Editbox2.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   regexp = /^[-+]?\\d*\\.?\\d*$/;\r\n");
      out.write("   if (!regexp.test(theForm.Editbox3.value))\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Phone number is required\");\r\n");
      out.write("      theForm.Editbox3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox3.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Phone number is required\");\r\n");
      out.write("      theForm.Editbox3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox3.value.length < 4)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Phone number is required\");\r\n");
      out.write("      theForm.Editbox3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox3.value.length > 15)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Phone number is required\");\r\n");
      out.write("      theForm.Editbox3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox3.selectedIndex < 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"State is required\");\r\n");
      out.write("      theForm.Combobox3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox3.selectedIndex == 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"State is required\");\r\n");
      out.write("      theForm.Combobox3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox4.selectedIndex < 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"City is required\");\r\n");
      out.write("      theForm.Combobox4.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox4.selectedIndex == 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"City is required\");\r\n");
      out.write("      theForm.Combobox4.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   regexp = /^([0-9a-z]([-.\\w]*[0-9a-z])*@(([0-9a-z])+([-\\w]*[0-9a-z])*\\.)+[a-z]{2,6})$/i;\r\n");
      out.write("   if (!regexp.test(theForm.Editbox4.value))\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Email is required\");\r\n");
      out.write("      theForm.Editbox4.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox4.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Email is required\");\r\n");
      out.write("      theForm.Editbox4.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox5.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Username is required\");\r\n");
      out.write("      theForm.Editbox5.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox6.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Password is required\");\r\n");
      out.write("      theForm.Editbox6.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox6.selectedIndex < 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Select any one\");\r\n");
      out.write("      theForm.Combobox6.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox6.selectedIndex == 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Select any one\");\r\n");
      out.write("      theForm.Combobox6.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Checkbox1.checked != true)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"You must accept out terms and conditions\");\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   regexp = /^[A-Za-zÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]*$/;\r\n");
      out.write("   if (!regexp.test(theForm.Editbox7.value))\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Locality is required\");\r\n");
      out.write("      theForm.Editbox7.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Editbox7.value == \"\")\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Locality is required\");\r\n");
      out.write("      theForm.Editbox7.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox1.selectedIndex < 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Blood is required\");\r\n");
      out.write("      theForm.Combobox1.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   if (theForm.Combobox1.selectedIndex == 0)\r\n");
      out.write("   {\r\n");
      out.write("      alert(\"Blood is required\");\r\n");
      out.write("      theForm.Combobox1.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <img src=\"head.png\" width=\"100%\" />\r\n");
      out.write("         ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html class=\"\" xmlns=\"http://www.w3.org/1999/xhtml\"><head>\r\n");
      out.write("                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"></meta>\r\n");
      out.write("                \r\n");
      out.write("                <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("    body {\r\n");
      out.write("        margin:0;\r\n");
      out.write("        padding:0;\r\n");
      out.write("        \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("        font: bold 14px Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write("        color: #000;\r\n");
      out.write("        margin: 0px;\r\n");
      out.write("        padding: 0px 0px 0px 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    #tabs9 {\r\n");
      out.write("      float:left;\r\n");
      out.write("      width:100%;\r\n");
      out.write("      font-size:18px;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      \r\n");
      out.write("          border-bottom:1px solid #F45551;\r\n");
      out.write("      line-height:normal;\r\n");
      out.write("      }\r\n");
      out.write("    #tabs9 ul {\r\n");
      out.write("          margin:0;\r\n");
      out.write("          padding:10px 10px 0 50px;\r\n");
      out.write("          list-style:none;\r\n");
      out.write("      }\r\n");
      out.write("    #tabs9 li {\r\n");
      out.write("      display:inline;\r\n");
      out.write("      margin:0;\r\n");
      out.write("      padding:0;\r\n");
      out.write("      }\r\n");
      out.write("    #tabs9 a {\r\n");
      out.write("      float:left;\r\n");
      out.write("      background:url(\"tableft9.gif\") no-repeat left top;\r\n");
      out.write("      margin:0;\r\n");
      out.write("      padding:0 0 0 4px;\r\n");
      out.write("      text-decoration:none;\r\n");
      out.write("      }\r\n");
      out.write("    #tabs9 a span {\r\n");
      out.write("      float:left;\r\n");
      out.write("      display:block;\r\n");
      out.write("      background:url(\"tabright9.gif\") no-repeat right top;\r\n");
      out.write("      padding:5px 15px 4px 6px;\r\n");
      out.write("      color:#FFF;\r\n");
      out.write("      }\r\n");
      out.write("    /* Commented Backslash Hack hides rule from IE5-Mac \\*/\r\n");
      out.write("    #tabs9 a span {float:none;}\r\n");
      out.write("    /* End IE5-Mac hack */\r\n");
      out.write("    #tabs9 a:hover span {\r\n");
      out.write("      color:#FFF;\r\n");
      out.write("      }\r\n");
      out.write("    #tabs9 a:hover {\r\n");
      out.write("      background-position:0% -42px;\r\n");
      out.write("      color: black;\r\n");
      out.write("      }\r\n");
      out.write("    #tabs9 a:hover span {\r\n");
      out.write("      background-position:100% -42px;\r\n");
      out.write("      color: black;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #tabs9 #current a {\r\n");
      out.write("              background-position:0% -42px;\r\n");
      out.write("             color: black;\r\n");
      out.write("      }\r\n");
      out.write("      #tabs9 #current a span {\r\n");
      out.write("              background-position:100% -42px;\r\n");
      out.write("              color: black;\r\n");
      out.write("      }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            \r\n");
      out.write("                <div id=\"tabs9\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                                <!-- CSS Tabs -->\r\n");
      out.write("                                <center>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_0(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_1(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_2(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_3(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_4(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_5(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_6(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_7(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                           <li>");
      if (_jspx_meth_t_link_8(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                            <li>");
      if (_jspx_meth_t_link_9(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                    </center>\r\n");
      out.write("                                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("</body></html>");
      out.write("<br><br></br>\r\n");
      out.write("<div id=\"wb_Form1\" style=\"position:absolute;left:258px;top:194px;width:448px;height:558px;z-index:27;\">\r\n");
      out.write("<form name=\"RegisterBean\" method=\"post\" action=\"/bdonor/jregister.aspx\" enctype=\"application/x-www-form-urlencoded\" id=\"Form1\" onsubmit=\"return ValidateRegisterBean(this)\">\r\n");
      out.write("<input type=\"text\" id=\"Editbox1\" style=\"position:absolute;left:180px;top:20px;width:208px;height:20px;line-height:20px;z-index:0;\" name=\"name\" value=\"\">\r\n");
      out.write("<select name=\"gender\" size=\"1\" id=\"Combobox2\" style=\"position:absolute;left:180px;top:84px;width:210px;height:22px;z-index:1;\">\r\n");
      out.write("<option selected value=\"Select\">Select Your Gender</option>\r\n");
      out.write("<option value=\"Male\">Male</option>\r\n");
      out.write("<option value=\"Female\">Female</option>\r\n");
      out.write("<option value=\"other\">Other Specified</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"date\" id=\"Editbox2\" style=\"position:absolute;left:180px;top:115px;width:206px;height:20px;line-height:20px;z-index:2;\" name=\"dob\" value=\"\" maxlength=\"50\">\r\n");
      out.write("<input type=\"text\" id=\"Editbox3\" style=\"position:absolute;left:177px;top:145px;width:206px;height:20px;line-height:20px;z-index:3;\" name=\"phone\" value=\"\">\r\n");
      out.write("<select name=\"state\" size=\"1\" id=\"Combobox3\" style=\"position:absolute;left:179px;top:179px;width:208px;height:22px;z-index:4;\">\r\n");
      out.write("<option selected value=\"select\">Select any State</option>\r\n");
      out.write("<option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\r\n");
      out.write("<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("<option value=\"Assam\">Assam</option>\r\n");
      out.write("<option value=\"Bihar\">Bihar</option>\r\n");
      out.write("<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("<option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("<option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option>\r\n");
      out.write("<option value=\"Daman and Diu\">Daman and Diu</option>\r\n");
      out.write("<option value=\"Goa\">Goa</option>\r\n");
      out.write("<option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("<option value=\"Haryana\">Haryana</option>\r\n");
      out.write("<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("<option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\r\n");
      out.write("<option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("<option value=\"Karnataka\">Karnataka</option>\r\n");
      out.write("<option value=\"Kerala\">Kerala</option>\r\n");
      out.write("<option value=\"Lakshadweep\">Lakshadweep</option>\r\n");
      out.write("<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("<option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("<option value=\"Manipur\">Manipur</option>\r\n");
      out.write("<option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("<option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("<option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("<option value=\"New Delhi\">New Delhi</option>\r\n");
      out.write("<option value=\"Orissa\">Orissa</option>\r\n");
      out.write("<option value=\"Puducherry\">Puducherry</option>\r\n");
      out.write("<option value=\"Punjab\">Punjab</option>\r\n");
      out.write("<option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("<option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("<option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("<option value=\"Telangana\">Telangana</option>\r\n");
      out.write("<option value=\"Tripura\">Tripura</option>\r\n");
      out.write("<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("<option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("<option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<select name=\"city\" size=\"1\" id=\"Combobox4\" style=\"position:absolute;left:179px;top:211px;width:207px;height:22px;z-index:5;\">\r\n");
      out.write("<option selected value=\"Select\">Select Any City</option>\r\n");
      out.write("<option value=\"Agartala\">Agartala</option>\r\n");
      out.write("<option value=\"Aizawl\">Aizawl</option>\r\n");
      out.write("<option value=\"Bengaluru\">Bengaluru</option>\r\n");
      out.write("<option value=\"Bhopal\">Bhopal</option>\r\n");
      out.write("<option value=\"Bhubaneshwar\">Bhubaneshwar</option>\r\n");
      out.write("<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("<option value=\"Chennai\">Chennai</option>\r\n");
      out.write("<option value=\"Daman\">Daman</option>\r\n");
      out.write("<option value=\"Dehradun\">Dehradun</option>\r\n");
      out.write("<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("<option value=\"Dispur\">Dispur</option>\r\n");
      out.write("<option value=\"Gandhinagar\">Gandhinagar</option>\r\n");
      out.write("<option value=\"Gangtok\">Gangtok</option>\r\n");
      out.write("<option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("<option value=\"Imphal\">Imphal</option>\r\n");
      out.write("<option value=\"Itanagar\">Itanagar</option>\r\n");
      out.write("<option value=\"Jaipur\">Jaipur</option>\r\n");
      out.write("<option value=\"Kavaratti\">Kavaratti</option>\r\n");
      out.write("<option value=\"Kohima\">Kohima</option>\r\n");
      out.write("<option value=\"Kolkata\">Kolkata</option>\r\n");
      out.write("<option value=\"Lucknow\">Lucknow</option>\r\n");
      out.write("<option value=\"Mumbai\">Mumbai</option>   \r\n");
      out.write("<option value=\"Nagpur\">Nagpur</option>\r\n");
      out.write("<option value=\"New Delhi\">New Delhi</option>\r\n");
      out.write("<option value=\"Patna\">Patna</option>\r\n");
      out.write("<option value=\"Port Blair\">Port Blair</option>\r\n");
      out.write("<option value=\"Puducherry\">Puducherry</option>\r\n");
      out.write("<option value=\"Raipur\">Raipur</option>\r\n");
      out.write("<option value=\"Ranchi\">Ranchi</option>\r\n");
      out.write("<option value=\"Shillong\">Shillong</option>\r\n");
      out.write("<option value=\"Shimla\">Shimla</option>\r\n");
      out.write("<option value=\"Silvasa\">Silvasa</option>\r\n");
      out.write("<option value=\"Srinagar\">Srinagar</option>\r\n");
      out.write("<option value=\"Thiruvananthapuram\">Thiruvananthapuram</option>\r\n");
      out.write("<option value=\"Vijayawada\">Vijayawada</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" id=\"Editbox4\" style=\"position:absolute;left:178px;top:277px;width:209px;height:20px;line-height:20px;z-index:6;\" name=\"email\" value=\"\">\r\n");
      out.write("<input type=\"text\" id=\"Editbox5\" style=\"position:absolute;left:177px;top:309px;width:209px;height:20px;line-height:20px;z-index:7;\" name=\"uname\" value=\"\">\r\n");
      out.write("<input type=\"password\" id=\"Editbox6\" style=\"position:absolute;left:178px;top:340px;width:207px;height:20px;line-height:20px;z-index:8;\" name=\"password\" value=\"\">\r\n");
      out.write("<select name=\"avail\" size=\"1\" id=\"Combobox6\" style=\"position:absolute;left:180px;top:374px;width:183px;height:22px;z-index:9;\">\r\n");
      out.write("<option selected value=\"Select\">Select Availability</option>\r\n");
      out.write("<option value=\"Available\">Available</option>\r\n");
      out.write("<option value=\"Un-Available\">Un-Available</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"checkbox\" id=\"Checkbox1\" name=\"Checkbox1\" value=\"on\" style=\"position:absolute;left:15px;top:423px;z-index:10;\">\r\n");
      out.write("<div id=\"wb_Text2\" style=\"position:absolute;left:20px;top:25px;width:116px;height:16px;z-index:11;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Full Name:</span></div>\r\n");
      out.write("<div id=\"wb_Text3\" style=\"position:absolute;left:19px;top:59px;width:92px;height:16px;z-index:12;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Blood Group:</span></div>\r\n");
      out.write("<div id=\"wb_Text4\" style=\"position:absolute;left:19px;top:88px;width:92px;height:16px;z-index:13;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Gender:</span></div>\r\n");
      out.write("<div id=\"wb_Text5\" style=\"position:absolute;left:18px;top:116px;width:129px;height:16px;z-index:14;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Date of Birth:</span></div>\r\n");
      out.write("<div id=\"wb_Text6\" style=\"position:absolute;left:18px;top:148px;width:124px;height:16px;z-index:15;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Phone No:</span></div>\r\n");
      out.write("<div id=\"wb_Text7\" style=\"position:absolute;left:20px;top:179px;width:105px;height:16px;z-index:16;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">State:</span></div>\r\n");
      out.write("<div id=\"wb_Text8\" style=\"position:absolute;left:23px;top:210px;width:93px;height:16px;z-index:17;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">City:</span></div>\r\n");
      out.write("<div id=\"wb_Text9\" style=\"position:absolute;left:22px;top:247px;width:78px;height:16px;z-index:18;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Locality:</span></div>\r\n");
      out.write("<div id=\"wb_Text10\" style=\"position:absolute;left:24px;top:284px;width:120px;height:16px;z-index:19;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Email:</span></div>\r\n");
      out.write("<div id=\"wb_Text11\" style=\"position:absolute;left:25px;top:318px;width:102px;height:16px;z-index:20;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">UserName:</span></div>\r\n");
      out.write("<div id=\"wb_Text12\" style=\"position:absolute;left:25px;top:346px;width:119px;height:16px;z-index:21;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Password:</span></div>\r\n");
      out.write("<div id=\"wb_Text13\" style=\"position:absolute;left:23px;top:376px;width:143px;height:16px;z-index:22;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">Availability:</span></div>\r\n");
      out.write("<div id=\"wb_Text1\" style=\"position:absolute;left:41px;top:416px;width:387px;height:48px;z-index:23;text-align:left;\">\r\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:13px;\">I authorize Bdonor.com to Display my Name, Phone no.,Email and can be contacted by anyone and anytime at emergency. <br></span></div>\r\n");
      out.write("<input type=\"text\" id=\"Editbox7\" style=\"position:absolute;left:175px;top:243px;width:208px;height:20px;line-height:20px;z-index:24;\" name=\"locality\" value=\"\" maxlength=\"50\">\r\n");
      out.write("<select name=\"bldgrp\" size=\"1\" id=\"Combobox1\" style=\"position:absolute;left:178px;top:50px;width:211px;height:22px;z-index:25;\">\r\n");
      out.write("<option selected value=\"Select\">Select Your Blood Group</option>\r\n");
      out.write("<option value=\"A-\">A-</option>\r\n");
      out.write("<option value=\"A+\">A+</option>\r\n");
      out.write("<option value=\"B-\">B-</option>\r\n");
      out.write("<option value=\"B+\">B+</option>\r\n");
      out.write("<option value=\"AB-\">AB-</option>\r\n");
      out.write("<option value=\"AB+\">AB+</option>\r\n");
      out.write("<option value=\"O+\">O+</option>\r\n");
      out.write("<option value=\"O-\">O-</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"submit\" id=\"Button1\" name=\"\" value=\"Register\" style=\"position:absolute;left:292px;top:480px;width:136px;height:24px;z-index:26;\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"wb_Image2\" style=\"position:absolute;left:810px;top:204px;width:418px;height:507px;z-index:28;\">\r\n");
      out.write("<img src=\"images/Superman.gif\" id=\"Image2\" alt=\"\" style=\"width:418px;height:507px;\"></div>\r\n");
      out.write("<div id=\"wb_Image4\" style=\"position:absolute;left:0px;top:818px;width:1392px;height:122px;z-index:29;\">\r\n");
      out.write("<img src=\"images/Footer.png\" id=\"Image4\" alt=\"\" style=\"width:1392px;height:122px;\"></div>\r\n");
      out.write("<div id=\"wb_Image1\" style=\"position:absolute;left:0px;top:0px;width:1413px;height:106px;z-index:30;\">\r\n");
      out.write("<img src=\"images/head.png\" id=\"Image1\" alt=\"\" style=\"width:1413px;height:106px;\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_0.setPageContext(_jspx_page_context);
    _jspx_th_t_link_0.setParent(null);
    _jspx_th_t_link_0.setAction("/bhome");
    int _jspx_eval_t_link_0 = _jspx_th_t_link_0.doStartTag();
    if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_0.doInitBody();
      }
      do {
        out.write("<span>Home</span>");
        int evalDoAfterBody = _jspx_th_t_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_0);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_0);
    return false;
  }

  private boolean _jspx_meth_t_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_1.setPageContext(_jspx_page_context);
    _jspx_th_t_link_1.setParent(null);
    _jspx_th_t_link_1.setAction("/bfacts");
    int _jspx_eval_t_link_1 = _jspx_th_t_link_1.doStartTag();
    if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_1.doInitBody();
      }
      do {
        out.write("<span>Blood Facts</span>");
        int evalDoAfterBody = _jspx_th_t_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_1);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_1);
    return false;
  }

  private boolean _jspx_meth_t_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_2.setPageContext(_jspx_page_context);
    _jspx_th_t_link_2.setParent(null);
    _jspx_th_t_link_2.setAction("/bfinddonor");
    int _jspx_eval_t_link_2 = _jspx_th_t_link_2.doStartTag();
    if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_2.doInitBody();
      }
      do {
        out.write("<span>Find Donor</span>");
        int evalDoAfterBody = _jspx_th_t_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_2);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_2);
    return false;
  }

  private boolean _jspx_meth_t_link_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_3.setPageContext(_jspx_page_context);
    _jspx_th_t_link_3.setParent(null);
    _jspx_th_t_link_3.setAction("/bdonatedlist");
    int _jspx_eval_t_link_3 = _jspx_th_t_link_3.doStartTag();
    if (_jspx_eval_t_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_3.doInitBody();
      }
      do {
        out.write("<span>Donation List</span>");
        int evalDoAfterBody = _jspx_th_t_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_3);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_3);
    return false;
  }

  private boolean _jspx_meth_t_link_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_4.setPageContext(_jspx_page_context);
    _jspx_th_t_link_4.setParent(null);
    _jspx_th_t_link_4.setAction("/btesti");
    int _jspx_eval_t_link_4 = _jspx_th_t_link_4.doStartTag();
    if (_jspx_eval_t_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_4.doInitBody();
      }
      do {
        out.write("<span>Testimonials</span>");
        int evalDoAfterBody = _jspx_th_t_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_4);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_4);
    return false;
  }

  private boolean _jspx_meth_t_link_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_5.setPageContext(_jspx_page_context);
    _jspx_th_t_link_5.setParent(null);
    _jspx_th_t_link_5.setAction("/binvite");
    int _jspx_eval_t_link_5 = _jspx_th_t_link_5.doStartTag();
    if (_jspx_eval_t_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_5.doInitBody();
      }
      do {
        out.write("<span>Invite Friends</span>");
        int evalDoAfterBody = _jspx_th_t_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_5);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_5);
    return false;
  }

  private boolean _jspx_meth_t_link_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_6.setPageContext(_jspx_page_context);
    _jspx_th_t_link_6.setParent(null);
    _jspx_th_t_link_6.setAction("/bapps");
    int _jspx_eval_t_link_6 = _jspx_th_t_link_6.doStartTag();
    if (_jspx_eval_t_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_6.doInitBody();
      }
      do {
        out.write("<span>Download Apps</span>");
        int evalDoAfterBody = _jspx_th_t_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_6);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_6);
    return false;
  }

  private boolean _jspx_meth_t_link_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_7 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_7.setPageContext(_jspx_page_context);
    _jspx_th_t_link_7.setParent(null);
    _jspx_th_t_link_7.setAction("/bfaq");
    int _jspx_eval_t_link_7 = _jspx_th_t_link_7.doStartTag();
    if (_jspx_eval_t_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_7.doInitBody();
      }
      do {
        out.write("<span>FAQ's</span>");
        int evalDoAfterBody = _jspx_th_t_link_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_7);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_7);
    return false;
  }

  private boolean _jspx_meth_t_link_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_8 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_8.setPageContext(_jspx_page_context);
    _jspx_th_t_link_8.setParent(null);
    _jspx_th_t_link_8.setAction("/bcontact");
    int _jspx_eval_t_link_8 = _jspx_th_t_link_8.doStartTag();
    if (_jspx_eval_t_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_8.doInitBody();
      }
      do {
        out.write("<span>Contact</span>");
        int evalDoAfterBody = _jspx_th_t_link_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_8);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_8);
    return false;
  }

  private boolean _jspx_meth_t_link_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_t_link_9 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_t_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_t_link_9.setPageContext(_jspx_page_context);
    _jspx_th_t_link_9.setParent(null);
    _jspx_th_t_link_9.setAction("/blogin");
    int _jspx_eval_t_link_9 = _jspx_th_t_link_9.doStartTag();
    if (_jspx_eval_t_link_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_9.doInitBody();
      }
      do {
        out.write("<span>Login/Register</span>");
        int evalDoAfterBody = _jspx_th_t_link_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_t_link_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_9);
      return true;
    }
    _jspx_tagPool_t_link_action.reuse(_jspx_th_t_link_9);
    return false;
  }
}
