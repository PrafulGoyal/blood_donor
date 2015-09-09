package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Body_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Home</title>\n");
      out.write("    <body>\n");
      out.write("        <br></br>\n");
      out.write("         <table width=\"850\" border=\"1\" cellpadding=\"0\"  cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"\" height=\"400\" vallign=\"top\">\n");
      out.write("                    \n");
      out.write("                    <table width=\"850\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <table width=\"850\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <table width=\"850\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"10\" height=\"46\">&nbsp;</td>\n");
      out.write("    <td width=\"70\">&nbsp;</td>\n");
      out.write("    <td width=\"145\">&nbsp;</td>\n");
      out.write("    <td width=\"351\">&nbsp;</td>\n");
      out.write("    <td width=\"320\">&nbsp;</td>\n");
      out.write("    <td width=\"104\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"272\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\"><img src=\"images/donate-blood.jpg\" width=\"502\" height=\"272\" /></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"50\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"124\">&nbsp;</td>\n");
      out.write("    <td colspan=\"5\" valign=\"top\"><div  align=\"left\">In the developed world, most blood donors are unpaid volunteers (voluntary non-remunerated repeat donations, VNRD) who donate blood for a community supply. In poorer countries, established supplies are limited and donors usually give blood when family or friends need a transfusion (directed donation). Many donors donate as an act of charity, but in countries that allow paid donation some donors are paid, and in some cases there are incentives other than money such as paid time off from work. Donors can also have blood drawn for their own future use (autologous donation). Donating is relatively safe, but some donors have bruising where the needle is inserted.</div></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"271\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td><img src=\"images/blood-drive2.jpg\" width=\"333\" height=\"271\" /></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"19\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><!--DWLayoutEmptyCell-->&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"2\"></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
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
}
