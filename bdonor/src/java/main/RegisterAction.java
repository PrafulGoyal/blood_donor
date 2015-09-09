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
public class RegisterAction extends org.apache.struts.action.Action {

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
        RegisterBean lb=(RegisterBean)form;
         HttpSession session=request.getSession(false);
        String name=lb.getName();
        String bldgrp=lb.getBldgrp();
        String gender=lb.getGender();
        String dob=lb.getDob();
        String phone=lb.getPhone();
        String state=lb.getState();
        String city=lb.getCity();
        String locality=lb.getLocality();
        String email=lb.getEmail();
        String uname=lb.getUname();
        String pass=lb.getPassword();
        String avail=lb.getAvail();
        try {
              Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdonor","root","");
PreparedStatement pst= con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?,?,?)");
pst.setString(1, uname);
pst.setString(2, pass);
pst.setString(3, email);
pst.setString(4, name);
pst.setString(5, bldgrp);
pst.setString(6, gender);
pst.setString(7, dob);
pst.setString(8, phone);
pst.setString(9, state);
pst.setString(10, city);
pst.setString(11, locality);
pst.setString(12, avail);

int status =pst.executeUpdate();
if(status>0){
    
    
  request.setAttribute("msg","You are Registered,Login Now");
  return mapping.findForward("ok");
}
else{
    request.setAttribute("msg","You are Not Succesfully Registered");
  return mapping.findForward("fail");
}
        }catch(Exception e)
        {
            out.println(e.getMessage());
        } 
        
        return mapping.findForward(SUCCESS);
    }
}
