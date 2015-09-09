package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Umenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      out.write("      font-size:80%;\r\n");
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
    _jspx_th_t_link_1.setAction("/bdonatedlist");
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
