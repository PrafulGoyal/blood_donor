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
public class FindAction extends org.apache.struts.action.Action {

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
         FindBean lb=(FindBean)form;
          HttpSession session=request.getSession(false);
        String bldgrp=lb.getBldgrp();
        String city=lb.getCity();
        String locality=lb.getLocality();
        String state=lb.getState();
     request.setAttribute("bldgrp",lb.getBldgrp());
     request.setAttribute("state",lb.getState());
     request.setAttribute("city",lb.getCity());
     request.setAttribute("locality",lb.getLocality());
        
        
 
     
                    
               
    return mapping.findForward("fr");
    

    }
}
