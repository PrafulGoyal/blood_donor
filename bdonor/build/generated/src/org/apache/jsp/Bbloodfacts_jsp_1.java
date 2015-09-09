package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bbloodfacts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"head.png\" width=\"100%\" />\n");
      out.write("          ");
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
      out.write("<br><br>\n");
      out.write("   <h1 align=\"left\" >Blood Donation Facts</h1>\n");
      out.write("                                        <table id=\"Table1\" cellpadding=\"5\" cellspacing=\"0\" width=\"688\">\n");
      out.write("                                          <tbody><tr>\n");
      out.write("                                            <td valign=\"top\"><p class=\"heading_color\">Facts about blood needs</p>\n");
      out.write("                                              <ul>\n");
      out.write("                                                <li>Every year our nation requires about <strong>4 Crore \n");
      out.write("                                                units</strong> of blood, out of which only a meager <strong>40 Lakh units</strong> of blood are available.</li>\n");
      out.write("                                                <li>The <strong>gift of blood</strong> is the <strong>gift \n");
      out.write("                                                  of life</strong>. There is no substitute for human \n");
      out.write("                                                blood.<img src=\"blood_3.jpg\" align=\"right\" height=\"100\" width=\"290\"></li>\n");
      out.write("                                                <li>Every two seconds someone  needs blood.</li>\n");
      out.write("                                                <li>More than 38,000 blood donations are needed every day.</li>\n");
      out.write("                                                <li>A total&nbsp;of 30 million blood components are transfused each year.</li>\n");
      out.write("                                                <li>The average red blood cell transfusion is approximately 3 pints.</li>\n");
      out.write("                                                <li>The blood type most often requested by hospitals is Type O.</li>\n");
      out.write("                                                <li>Sickle cell patients can require  frequent blood transfusions throughout their lives.</li>\n");
      out.write("                                                <li>More than 1 million new people are diagnosed with cancer each year.  Many of them will need blood, sometimes daily, during their  chemotherapy treatment.</li>\n");
      out.write("                                                <li>A single car accident victim can require as many as 100 units of blood</li>\n");
      out.write("                                              </ul>\n");
      out.write("                                              <p class=\"heading_color\">Facts about the blood supply</p>\n");
      out.write("                                              <ul>\n");
      out.write("                                                <li>Blood cannot be manufactured – it can only come from generous donors.<img src=\"blood_4.jpg\" align=\"right\" height=\"100\" width=\"290\"></li>\n");
      out.write("                                                <li>Type O-negative blood (red cells) can be transfused to patients of  all blood types. It is always in great demand and often in short supply.</li>\n");
      out.write("                                                <li>Type AB-positive plasma can be transfused to patients of all other blood types. AB plasma is also usually in short supply.</li>\n");
      out.write("                                              </ul>\n");
      out.write("                                              <p class=\"heading_color\">Facts about the blood donation process</p>\n");
      out.write("                                              <ul>\n");
      out.write("                                                <li>Donating blood is a safe process. A sterile needle is used only once for each donor and then discarded.<img src=\"blood_1.jpg\" align=\"right\" height=\"100\" width=\"290\"></li>\n");
      out.write("                                                <li>Blood donation is a simple four-step process: registration, medical history&nbsp;and&nbsp;mini-physical, donation and refreshments.</li>\n");
      out.write("                                                <li>Every blood donor is given a mini-physical, checking the donor's  temperature, blood pressure, pulse and&nbsp;hemoglobin to ensure it is safe  for the donor to give blood.</li>\n");
      out.write("                                                <li>The actual blood donation typically takes less than 10-12 minutes.  The entire process, from the time you arrive to the time you leave,  takes about an hour and 15 min.</li>\n");
      out.write("                                                <li>The average adult has about 10 units of blood in his body. Roughly 1 unit is given during a donation.<img src=\"blood_2.jpg\" align=\"right\" height=\"100\" width=\"290\"></li>\n");
      out.write("                                                <li>A healthy donor may donate red blood cells every 56 days, or double red cells every 112 days.</li>\n");
      out.write("                                                <li>A healthy donor may donate platelets as few as&nbsp;7 days apart, but a maximum of 24 times a year.</li>\n");
      out.write("                                                <li>All donated blood is tested for HIV, hepatitis B and C, syphilis  and other infectious diseases before it can be transfused to patients.</li>\n");
      out.write("                                              </ul>\n");
      out.write("                                              <span class=\"heading_color\">Facts about blood and its components                                              </span>\n");
      out.write("                                              <ul>\n");
      out.write("                                                <li>Blood makes up about 7 percent of your body's weight.</li>\n");
      out.write("                                                <li>There are four types of transfusable products that can be derived  from blood: red cells, platelets, plasma and cryoprecipitate.  Typically,&nbsp;two or three of these are produced from a unit of donated  whole blood – hence each donation can help save up to three lives.<img src=\"blood_7.jpg\" align=\"right\" height=\"174\" width=\"220\"></li>\n");
      out.write("                                                <li>Donors can give either whole blood or specific blood components  only. The process of donating specific blood components – red cells,  plasma or platelets – is called apheresis.</li>\n");
      out.write("                                                <li>One transfusion dose of platelets can be obtained through one  apheresis donation of platelets or by combining the platelets derived  from&nbsp;five whole blood donations.</li>\n");
      out.write("                                                <li>Donated platelets must be used within&nbsp;five days of collection.</li>\n");
      out.write("                                                <li>Healthy bone marrow makes a constant supply of red cells, plasma  and platelets. The body will replenish the elements given during a  blood donation – some in a matter of hours and others in a matter of  weeks.</li>\n");
      out.write("                                              </ul>\n");
      out.write("                                              <p class=\"heading_color\">Facts about donors</p>\n");
      out.write("                                              <ul>\n");
      out.write("                                                <li>The&nbsp;number one&nbsp;reason donors say they give blood is because they \"want to help others.\"</li>\n");
      out.write("                                                <li>Two most common reasons cited by people who don't give blood are: \"Never thought about it\" and \"I don't like needles.\"</li>\n");
      out.write("                                                <li>One donation can help save the lives of up to&nbsp;three people.<img src=\"blood_5.jpg\" align=\"right\" height=\"100\" width=\"290\"></li>\n");
      out.write("                                                <li>If you began donating blood at age 18 and donated every 90 days  until you reached 60, you would have donated 30 gallons of blood,  potentially helping save more than 500 lives!</li>\n");
      out.write("                                                <li>Only 7 percent&nbsp;of people in India have O-negative blood  type.&nbsp;O-negative blood type donors are universal donors as their blood  can be given to people of all blood types.</li>\n");
      out.write("                                                <li>Type O-negative blood is needed in emergencies before the patient's blood type is known and with newborns who need blood.</li>\n");
      out.write("                                                <li>Thirty-five percent&nbsp;of people  have Type O (positive or  negative) blood. </li>\n");
      out.write("                                                <li>0.4 percent of people  have AB-blood type.  AB-type blood donors are universal donors of plasma, which is  often used in emergencies, for newborns and for patients requiring  massive transfusions.</li>\n");
      out.write("                                              </ul>\n");
      out.write("                                              <p>There are four main blood types: <strong>A, B, AB and O.</strong></p>\n");
      out.write("                                              <p>In 1901, Karl Landsteiner, an Austrian physician, discovers the first three human blood groups. On his birthday i.e June 14th \"World Blood Donors Day\" celebrates. On October 1st ‘National Blood Donation Day’ celebrates in India.</p>\n");
      out.write("                                              <p><strong>WHAT TYPE ARE YOU?</strong> </p>\n");
      out.write("                                              <table align=\"center\" bgcolor=\"#FF0000\" border=\"0\" cellpadding=\"5\" cellspacing=\"1\" width=\"80%\">\n");
      out.write("                                                  <tbody><tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td colspan=\"2\"><div align=\"center\"><strong>FREQUENCY \n");
      out.write("                                                      OF BLOOD TYPES</strong></div></td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>O+ 1 person in 3</td>\n");
      out.write("                                                    <td>O- 1 person in 15</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>A+ 1 person in 3</td>\n");
      out.write("                                                    <td>A- 1 person in 16</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>B+ 1 person in 12</td>\n");
      out.write("                                                    <td>B- 1 person in 67</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>AB+ 1 person in 29</td>\n");
      out.write("                                                    <td>AB- 1 person in 167</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                </tbody></table>\n");
      out.write("                                              <br>\n");
      out.write("                                              <table align=\"center\" bgcolor=\"#FF0000\" border=\"0\" cellpadding=\"5\" cellspacing=\"1\" width=\"80%\">\n");
      out.write("                                                  <tbody><tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td colspan=\"2\"><div align=\"center\"><strong>EXAMPLES \n");
      out.write("                                                      OF BLOOD USE </strong></div></td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>1. Automobile Accident</td>\n");
      out.write("                                                    <td>50 units of blood</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>2. Heart Surgery</td>\n");
      out.write("                                                    <td>6 units of blood / 6 units of platelets</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>3. Organ Transplant</td>\n");
      out.write("                                                    <td>40 units of blood / 30 units of platelets</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>4. 20 bags of cryoprecipitate</td>\n");
      out.write("                                                    <td>25 units of fresh frozen plasma</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>5. Bone Marrow Transplant</td>\n");
      out.write("                                                    <td>120 units of platelets/ 20 units of blood</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <td>6. Burn Victims</td>\n");
      out.write("                                                    <td>20 units of platelets</td>\n");
      out.write("                                                  </tr>\n");
      out.write("                                              </tbody></table></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                    </tbody></table>\n");
      out.write("   <br></br><br></br><img src=\"Footer.png\" width=\"100%\" height=\"100\" />\n");
      out.write("   \n");
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
