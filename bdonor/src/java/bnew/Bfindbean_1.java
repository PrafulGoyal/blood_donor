/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bnew;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Ankit Kushwaha
 */
public class Bfindbean extends org.apache.struts.action.ActionForm {
    
    private String bldgrp;
    private String state;
    private String city;
    private String locality;

    /**
     * @return the bldgrp
     */
    public String getBldgrp() {
        return bldgrp;
    }

    /**
     * @param bldgrp the bldgrp to set
     */
    public void setBldgrp(String bldgrp) {
        this.bldgrp = bldgrp;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * @param locality the locality to set
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }
    
}
