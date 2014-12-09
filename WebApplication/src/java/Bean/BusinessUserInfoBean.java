/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.ejb.Stateless;
import java.util.*;

/**
 *
 * @author Eric Ong
 */
@Stateless
public class BusinessUserInfoBean {

    private boolean set;
    private String userID;
    private String username;
    private String businessName;
    private String email;
    private String busType;
    private String busAddr;
    private String zipcode;
    private String startDate;
    private ArrayList<ClassBean> ClassList = new ArrayList<ClassBean>();

    public BusinessUserInfoBean(){
        set = false;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public boolean isSet() {
        System.out.println("buser " + set);
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
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
    
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public void addToClassList(ClassBean c){
        ClassList.add(c);
    }
    public ArrayList<ClassBean> getClassList(){
        return ClassList;
    }
    public void reset(){
        ClassList = new ArrayList<ClassBean>();

    }    
}
