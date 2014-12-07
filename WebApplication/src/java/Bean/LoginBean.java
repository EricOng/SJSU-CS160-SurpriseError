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
public class LoginBean implements java.io.Serializable {

    private boolean valid;
    private String name;
    private int id;

    public LoginBean() {
        valid = false;
        name = "Login";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public boolean isValid() {
        System.out.println("Check login valid");
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
