package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_errors_nobody.release();
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
      out.write("    <center>\n");
      out.write("        <h1>Feedback page</h1>\n");
      out.write("        <br></br>");
      if (_jspx_meth_t_errors_0(_jspx_page_context))
        return;
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br></br>\n");
      out.write("        ");
      if (_jspx_meth_t_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </center>\n");
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

  private boolean _jspx_meth_t_errors_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_t_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_t_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_t_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_t_errors_0.setParent(null);
    int _jspx_eval_t_errors_0 = _jspx_th_t_errors_0.doStartTag();
    if (_jspx_th_t_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_errors_nobody.reuse(_jspx_th_t_errors_0);
      return true;
    }
    _jspx_tagPool_t_errors_nobody.reuse(_jspx_th_t_errors_0);
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
    _jspx_th_t_form_0.setAction("/sendfeed");
    _jspx_th_t_form_0.setMethod("post");
    int _jspx_eval_t_form_0 = _jspx_th_t_form_0.doStartTag();
    if (_jspx_eval_t_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            Full Name:<input type=\"text\" name=\"name\"/></br></br>\n");
        out.write("            Email:<input type=\"email\" name=\"email\"/></br></br>\n");
        out.write("            Phone No.:<input type=\"text\" name=\"phone\"/></br></br>\n");
        out.write("            Location:<input type=\"text\" name=\"location\"/></br></br>\n");
        out.write("            FeedBack:<textarea name=\"feedback\" id=\"TextArea1\" rows=\"5\" cols=\"50\"></textarea></br></br></br></br></br></br>\n");
        out.write("            Suggestion:<textarea name=\"suggest\" id=\"TextArea1\"  rows=\"5\" cols=\"50\"></textarea></br></br>\n");
        out.write("            <input type=\"submit\" value=\"submit\" name=\"submit\"/>\n");
        out.write("        ");
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
