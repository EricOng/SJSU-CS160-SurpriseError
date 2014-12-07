/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.ejb.Stateless;

/**
 *
 * @author Roberto Villasenor
 */
@Stateless
public class CasualUserInfoBean implements java.io.Serializable {

    private boolean set;
    private String UserID;
    private String UserName;
    private String FName;
    private String LName;
    private String Email;
    private String Password;
    private String Birthday;
    private String Gender;

    public CasualUserInfoBean() {
        set = false;
    }

    public boolean isSet() {
        System.out.println("Check isSet " + set);
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
        System.out.println("----- " + this.set);
    }
    
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
        System.out.println("----- " + FName);
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
        System.out.println("----- " +LName);
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
        System.out.println("----- " + Email);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
        System.out.println("----- " + Birthday);
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
        System.out.println("----- " + Gender);
    }
}