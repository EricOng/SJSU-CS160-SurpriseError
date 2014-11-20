/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.ejb.Stateless;

/**
 *
 * @author Eric Ong
 */
@Stateless
public class BusinessUserInfoBean {

    private String username;
    private String businessName;
    private String email;
    private String busType;
    private String busAddr;
           
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusAddr() {
        return busAddr;
    }

    public void setBusAddr(String busAddr) {
        this.busAddr = busAddr;
    }
}
