package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Donorlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>Voluntary Donation till Date</br></br>\n");
      out.write("       <table align=\"center\" style=\"width:870px;height:44px;\" border=\"1\" cellpadding=\"0\" cellspacing=\"1\" id=\"Table1\">\n");
      out.write("      <tr >\n");
      out.write("\n");
      out.write("<td  style=\"background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:160px;height:36px;\"><div><span style=\"color:red;font-family:Arial;font-size:20px;\">Donor Name</span></div>&nbsp;</td>\n");
      out.write("<td style=\"background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:110px;height:36px;\"><div><span style=\"color:red;font-family:Arial;font-size:20px;\"> Donation Date</span></div>&nbsp;</td>\n");
      out.write("<td style=\"background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:110px;height:36px;\"><div><span style=\"color:red;font-family:Arial;font-size:20px;\"> Patient Name</span></div>&nbsp;</td>\n");
      out.write("<td style=\"background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:110px;height:36px;\"><div><span style=\"color:red;font-family:Arial;font-size:20px;\"> Location</span></div>&nbsp;</td>\n");
      out.write("<td style=\"background-color:transparent;border:1px #C0C0C0 solid;text-align:center;vertical-align:top;width:200px;height:36px;\"><div><span style=\"color:red;font-family:Arial;font-size:20px;\"> Hospital</span></div>&nbsp;</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("        \n");
      out.write("        ");
 try {
       
             Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bdonor","root","password");
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select * from dblood ");

while(rs.next())
{
 

out.println("<tr><td ><div><span>"+rs.getString(1)+"</span></div></td>");
out.println("<td>"+rs.getString(2)+"</td>");
out.println("<td>"+rs.getString(3)+"</td>");
out.println("<td>"+rs.getString(4)+"</td>");
out.println("<td>"+rs.getString(5)+"</td></tr>");
  //return mapping.findForward("fr");
    

}
            
   
        }
        catch(Exception e)
{
out.println(e.getMessage());
}
   

      out.write("\n");
      out.write("      </table>\n");
      out.write("       ");
      if (_jspx_meth_t_link_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("         </center>    \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     </body>\n");
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
    _jspx_th_t_link_0.setAction("/bfinddonor");
    int _jspx_eval_t_link_0 = _jspx_th_t_link_0.doStartTag();
    if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_t_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_link_0.doInitBody();
      }
      do {
        out.write("Search Again");
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
}
