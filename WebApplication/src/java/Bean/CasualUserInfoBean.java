/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Roberto Villasenor
 */
public class CasualUserInfoBean {

    private String UserID;
    private String UserName;
    private String Name;
    private String Password;
    private String Email;
    private String Address;
    private String Birthdate;
    private String PhoneNo;
    private String Summary;
    private String Reviews;
    private String Wishlist;

    public CasualUserInfoBean() {
    }
    
    public String getUserID() {
        return UserID;
    }
    
    public void setUserID(String newID) {
        UserID = newID;
    }
    
    public String getUserName() {
        return UserName;
    }
    
    public void setUserName(String newUsername) {
        UserName = newUsername;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String newName) {
        Name= newName;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String newPassword) {
        Password = newPassword;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String newEmail) {
        Email = newEmail;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String newAddress) {
        Address = newAddress;
    }
    
    public String getBirthdate() {
        return Birthdate;
    }
    
    public void setBirthdate(String newBirthdate) {
        Birthdate = newBirthdate;
    }
    
    public String getPhoneNo() {
        return PhoneNo;
    }
    
    public void setPhoneNo(String newPhoneNo) {
        PhoneNo = newPhoneNo;
    }
    
    public String getSummary() {
        return Summary;
    }
    
    public void setSummary(String newSummary) {
        Summary = newSummary;
    }
    
    public String getReviews() {
        return Reviews;
    }
    
    public void setReviews(String newReviews) {
        Reviews = newReviews;
    }
    
    public String getWishlist() {
        return Wishlist;
    }
    
    public void setWishlist(String newWishlist) {
        Wishlist = newWishlist;
    }
}
