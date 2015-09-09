/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Ankit Kushwaha
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PrintWriter out=response.getWriter();
         LoginBean lb=(LoginBean)form;
        String uname=lb.getT1();
        String pass=lb.getT2();
        
        
         
          try {
            Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bdonor","root","");
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select uname,password from register");
while(rs.next())
    
{

if(uname.equals(rs.getString(1)) && pass.equals(rs.getString(2)))
{
HttpSession session=request.getSession();
session.setAttribute("uname",uname);
return mapping.findForward("s");
}




}

            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
        }
        catch(Exception e){
        out.println(e.getMessage());
        } 
          
        request.setAttribute("msg","Invalid UserId or Password");
        return mapping.findForward("f");
    }
}
