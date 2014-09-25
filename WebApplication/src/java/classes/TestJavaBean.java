/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Eric Ong
 */
public class TestJavaBean implements java.io.Serializable {

    TestJavaBean() {
        numericID = idAcc++;
        beanName = "DefaultEmpty";
    }

    int getID() {
        return numericID;
    }

    String getName() {
        return beanName;
    }

    void setName(String newName) {
        beanName = newName;
    }

    private static int idAcc = 1;
    private int numericID;
    private String beanName;
}
