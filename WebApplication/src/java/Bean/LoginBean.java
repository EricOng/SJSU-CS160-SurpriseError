/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

//import javax.ejb.Stateful;

/**
 *
 * @author Eric Ong
 */
//@Stateful
public class LoginBean {

    private boolean valid;
    private String name;

    public LoginBean() {
        valid = false;
        name = "";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public boolean isValid() {
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
}
