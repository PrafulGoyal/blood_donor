/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Ankit Kushwaha
 */
public class DonatedBean extends org.apache.struts.action.ActionForm {
    
    private String ldate;
    private String pname;
    private String location;
    private String hospital;

    /**
     * @return the ldate
     */
    public String getLdate() {
        return ldate;
    }

    /**
     * @param ldate the ldate to set
     */
    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    /**
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname the pname to set
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }


}
