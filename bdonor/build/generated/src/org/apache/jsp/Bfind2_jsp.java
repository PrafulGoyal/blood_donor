package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bfind2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/Umenu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_link_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_link_action.release();
    _jspx_tagPool_t_form_method_action.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"head.png\" width=\"100%\" />\n");
      out.write("         ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html class=\"\" xmlns=\"http://www.w3.org/1999/xhtml\"><head>\r\n");
      out.write("                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"></meta>\r\n");
      out.write("                <title>Free CSS Navigation Menu Designs 2 at exploding-boy.com</title>\r\n");
      out.write("                <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("    body {\r\n");
      out.write("        margin:0;\r\n");
      out.write("        padding:0;\r\n");
      out.write("        font: bold 20px/1.5em Verdana;\r\n");
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
      out.write("      font-size:93%;\r\n");
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
      out.write("      }\r\n");
      out.write("    #tabs9 a:hover span {\r\n");
      out.write("      background-position:100% -42px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #tabs9 #current a {\r\n");
      out.write("              background-position:0% -42px;\r\n");
      out.write("      }\r\n");
      out.write("      #tabs9 #current a span {\r\n");
      out.write("              background-position:100% -42px;\r\n");
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
      out.write("                            <li>");
      if (_jspx_meth_t_link_8(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                    </center>\r\n");
      out.write("                                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("</body></html>");
      out.write("<br><br></br>\n");
      out.write("         \n");
      out.write("    <center>\n");
      out.write("        <h1><font color=\"red\"> Find Blood & Donor</h1>\n");
      out.write("        ");
      if (_jspx_meth_t_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <br></br><br></br><br></br><br></br><br></br><br><img src=\"Footer.png\" width=\"100%\" height=\"100\" />\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
    _jspx_th_t_link_1.setAction("/bfinddonor");
    int _jspx_eval_t_link_1 = _jspx_th_t_link_1.doStartTag();
    if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_1.doInitBody();
      }
      do {
        out.write("<span>Find Donor</span>");
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
    _jspx_th_t_link_2.setAction("/bdonatedlist");
    int _jspx_eval_t_link_2 = _jspx_th_t_link_2.doStartTag();
    if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_2.doInitBody();
      }
      do {
        out.write("<span>Donation List</span>");
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
    _jspx_th_t_link_3.setAction("/btesti");
    int _jspx_eval_t_link_3 = _jspx_th_t_link_3.doStartTag();
    if (_jspx_eval_t_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_3.doInitBody();
      }
      do {
        out.write("<span>Testimonials</span>");
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
    _jspx_th_t_link_4.setAction("/binvite");
    int _jspx_eval_t_link_4 = _jspx_th_t_link_4.doStartTag();
    if (_jspx_eval_t_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_4.doInitBody();
      }
      do {
        out.write("<span>Invite Friends</span>");
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
    _jspx_th_t_link_5.setAction("/bapps");
    int _jspx_eval_t_link_5 = _jspx_th_t_link_5.doStartTag();
    if (_jspx_eval_t_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_5.doInitBody();
      }
      do {
        out.write("<span>Download Apps</span>");
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
    _jspx_th_t_link_6.setAction("/bfaq");
    int _jspx_eval_t_link_6 = _jspx_th_t_link_6.doStartTag();
    if (_jspx_eval_t_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_6.doInitBody();
      }
      do {
        out.write("<span>FAQ's</span>");
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
    _jspx_th_t_link_7.setAction("/bcontact");
    int _jspx_eval_t_link_7 = _jspx_th_t_link_7.doStartTag();
    if (_jspx_eval_t_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_7.doInitBody();
      }
      do {
        out.write("<span>Contact</span>");
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
    _jspx_th_t_link_8.setAction("/blogin");
    int _jspx_eval_t_link_8 = _jspx_th_t_link_8.doStartTag();
    if (_jspx_eval_t_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_8.doInitBody();
      }
      do {
        out.write("<span>Login/Register</span>");
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

  private boolean _jspx_meth_t_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:form
    org.apache.struts.taglib.html.FormTag _jspx_th_t_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_t_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_t_form_0.setPageContext(_jspx_page_context);
    _jspx_th_t_form_0.setParent(null);
    _jspx_th_t_form_0.setAction("/bjfind");
    _jspx_th_t_form_0.setMethod("post");
    int _jspx_eval_t_form_0 = _jspx_th_t_form_0.doStartTag();
    if (_jspx_eval_t_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        Blood Group : <select name=\"bldgrp\" size=\"1\" id=\"Combobox1\"><br><br>\n");
        out.write("<option selected value=\"Select\">Select Your Blood Group</option>\n");
        out.write("<option value=\"A-\">A-</option>\n");
        out.write("<option value=\"A+\">A+</option>\n");
        out.write("<option value=\"B-\">B-</option>\n");
        out.write("<option value=\"B+\">B+</option>\n");
        out.write("<option value=\"AB-\">AB-</option>\n");
        out.write("<option value=\"AB+\">AB+</option>\n");
        out.write("<option value=\"O+\">O+</option>\n");
        out.write("<option value=\"O-\">O-</option>\n");
        out.write("</select>\n");
        out.write("        </br></br> State : <select name=\"state\" size=\"1\" id=\"Combobox3\" ><br><br></br>\n");
        out.write("<option selected value=\"select\">Select any State</option>\n");
        out.write("<option value=\"Uttarakhand\">Uttarakhand</option>\n");
        out.write("<option value=\"Haryana\">Haryana</option>\n");
        out.write("<option value=\"Jammu & Kashmir\">Jammu & Kashmir</option>\n");
        out.write("<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
        out.write("</select>\n");
        out.write("        <br></br> City : <select name=\"city\" size=\"1\" id=\"Combobox4\"><br><br>\n");
        out.write("<option selected value=\"Select\">Select Any City</option>\n");
        out.write("<option value=\"Dehradun\">Dehradun</option>\n");
        out.write("<option value=\"New Delhi\">New Delhi</option>\n");
        out.write("<option value=\"Chandigarh\">Chandigarh</option>\n");
        out.write("<option value=\"Srinagar\">Srinagar</option>\n");
        out.write("<option value=\"Lucknow\">Lucknow</option>\n");
        out.write("</select>\n");
        out.write("        </br><br> Locality : <select name=\"locality\" size=\"1\" id=\"Combobox5\"><br><br>\n");
        out.write("<option selected value=\"Select\">Select Any Locality</option>\n");
        out.write("<option value=\"Raipur\">Raipur</option>\n");
        out.write("<option value=\"Rajpur\">Rajpur</option>\n");
        out.write("<option value=\"Vikasnagar\">Vikasnagar</option>\n");
        out.write("<option value=\"Mussurie\">Mussurie</option>\n");
        out.write("</select>\n");
        out.write("        <br><br><input type=\"submit\" value=\"Find Blood\" name=\"find\"/>\n");
        out.write("           ");
        int evalDoAfterBody = _jspx_th_t_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_form_method_action.reuse(_jspx_th_t_form_0);
      return true;
    }
    _jspx_tagPool_t_form_method_action.reuse(_jspx_th_t_form_0);
    return false;
  }
}
