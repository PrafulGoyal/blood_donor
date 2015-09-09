/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Ankit Kushwaha
 */
public class FeedAction extends org.apache.struts.action.Action {

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
         HttpSession session=request.getSession(false);
        FeedBean lb=(FeedBean)form;
        String name=lb.getName();
        String email=lb.getEmail();
        String phone=lb.getPhone();
        String location=lb.getLocation();
        String feedback=lb.getFeedback();
        String suggest=lb.getSuggest();
        
         try {
              Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdonor","root","");
PreparedStatement pst= con.prepareStatement("insert into feedback values(?,?,?,?,?,?)");
pst.setString(1, name);
pst.setString(2, email);
pst.setString(3, phone);
pst.setString(4, location);
pst.setString(5, feedback);
pst.setString(6, suggest);


int status =pst.executeUpdate();
if(status>0){
    request.setAttribute("msg","Succesfully Submitted Your Details");
 return mapping.findForward("ok");
 
}
else{
     request.setAttribute("msg","Submission Un-Succesfull");
 return mapping.findForward("fail");
}
        }catch(Exception e)
        {
            out.println(e.getMessage());
        } 
        
        return mapping.findForward(SUCCESS);
    }
}
