/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import java.io.PrintWriter;
import java.util.Enumeration;
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
public class TestAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "success";

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
          HttpSession session=request.getSession(false);
        TestBean lb=(TestBean)form;
       
        try {
             Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bdonor","root","password");
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select name,email,phone,location,feedback from feedback");

while(rs.next())
{
    

    return mapping.findForward("test");
}

            
   
        }
        catch(Exception e)
{
out.println(e.getMessage());
}
        
        return mapping.findForward(SUCCESS);
    }
}
