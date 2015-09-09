package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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

      out.write("\n");
      out.write("<title>Welcome to the Bdonor</title>\n");
      out.write("<body>\n");
      out.write("    <table width=\"100%\"  >\n");
      out.write("         <tr>\n");
      out.write("              <td width=\"825\" height=\"100\" vallign=\"top\"><div align=\"center\"> \n");
      out.write("<img src=\"images/head.png\" id=\"Image1\" alt=\"\" style=\"width:1350px;height:100px;\" >\n");
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("       \n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("                <title>Free CSS Navigation Menu Designs 2 at exploding-boy.com</title>\n");
      out.write("                <style type=\"text/css\">\n");
      out.write("                    \n");
      out.write("<!--\n");
      out.write("                                        body {\n");
      out.write("        margin:0;\n");
      out.write("        padding:0;\n");
      out.write("        font: bold 16px/1.5em Verdana;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("        font: bold 14px Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("        color: #000;\n");
      out.write("        margin: 0px;\n");
      out.write("        padding: 0px 0px 10px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*- Menu Tabs 11--------------------------- */\n");
      out.write("\n");
      out.write("    #tabs11 {\n");
      out.write("      float:left;\n");
      out.write("      width:100%;\n");
      out.write("          background:#F9F7F3;\n");
      out.write("      font-size:93%;\n");
      out.write("      line-height:normal;\n");
      out.write("          border-bottom:3px solid #C2BDAE;\n");
      out.write("      }\n");
      out.write("    #tabs11 ul {\n");
      out.write("          margin:0;\n");
      out.write("          padding:0px 0px 0px 395px;\n");
      out.write("          list-style:none;\n");
      out.write("      }\n");
      out.write("    #tabs11 li {\n");
      out.write("      display:inline;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0;\n");
      out.write("      }\n");
      out.write("    #tabs11 a {\n");
      out.write("      float:left;\n");
      out.write("      background:url(\"tableft11.gif\") no-repeat left top;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0 0 0 4px;\n");
      out.write("      text-decoration:none;\n");
      out.write("      }\n");
      out.write("    #tabs11 a span {\n");
      out.write("      float:left;\n");
      out.write("      display:block;\n");
      out.write("      background:url(\"tabright11.gif\") no-repeat right top;\n");
      out.write("      padding:5px 15px 9px 0px;\n");
      out.write("      color:#9F9584;\n");
      out.write("      }\n");
      out.write("    /* Commented Backslash Hack hides rule from IE5-Mac \\*/\n");
      out.write("    #tabs11 a span {float:none;}\n");
      out.write("    /* End IE5-Mac hack */\n");
      out.write("    #tabs11 a:hover span {\n");
      out.write("      color:#FFF;\n");
      out.write("      }\n");
      out.write("    #tabs11 a:hover {\n");
      out.write("      background-position:0% -42px;\n");
      out.write("      }\n");
      out.write("    #tabs11 a:hover span {\n");
      out.write("      background-position:100% -42px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #tabs11 #current a {\n");
      out.write("              background-position:0% -42px;\n");
      out.write("      }\n");
      out.write("      #tabs11 #current a span {\n");
      out.write("              background-position:100% -42px;\n");
      out.write("      }\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("               \n");
      out.write("                 <div id=\"tabs11\">\n");
      out.write("                <ul>\n");
      out.write("                                <!-- CSS Tabs -->\n");
      out.write("<li id=\"current\"><a href=\"Home.html\"><span>Home</span></a></li>\n");
      out.write("<li><a href=\"Products.html\"><span>Blood Facts</span></a></li>\n");
      out.write("<li><a href=\"Services.html\"><span>Find Donor</span></a></li>\n");
      out.write("<li><a href=\"Support.html\"><span>Download App</span></a></li>\n");
      out.write("<li><a href=\"Order.html\"><span>Blood Request</span></a></li>\n");
      out.write("<li><a href=\"News.html\"><span>News</span></a></li>\n");
      out.write("<li><a href=\"About.html\"><span>About Us</span></a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                </div>\n");
      out.write("        </body>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("<p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src=\"images/register.jpg\" width=\"492\" height=\"460\" border=\"0\" />&emsp;&emsp;\n");
      out.write("  <img src=\"images/find.jpg\" width=\"494\" height=\"457\" /></p>\n");
      out.write("<p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;");
      if (_jspx_meth_t_link_0(_jspx_page_context))
        return;
      out.write("&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;");
      if (_jspx_meth_t_link_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<p>");
      if (_jspx_meth_t_link_2(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("</body>");
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
    _jspx_th_t_link_0.setAction("/jsignup");
    int _jspx_eval_t_link_0 = _jspx_th_t_link_0.doStartTag();
    if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_0.doInitBody();
      }
      do {
        out.write("Register");
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
    _jspx_th_t_link_1.setAction("/jfindblood");
    int _jspx_eval_t_link_1 = _jspx_th_t_link_1.doStartTag();
    if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_1.doInitBody();
      }
      do {
        out.write("Find Blood");
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
    _jspx_th_t_link_2.setAction("/jpost");
    int _jspx_eval_t_link_2 = _jspx_th_t_link_2.doStartTag();
    if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_2.doInitBody();
      }
      do {
        out.write("Post Your Query");
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
}
