/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

/**
 *
 * @author Eric Ong
 */
public class StateManager {

    public static StateManager singleton;

    public StateManager() {
        if (singleton == null) {
            singleton = new StateManager();
        }
    }

}
