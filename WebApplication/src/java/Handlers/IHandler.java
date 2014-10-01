/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author Eric Ong
 */
public interface IHandler {

    abstract ArrayList<String> parse(HttpServletRequest request);

    abstract ArrayList<String> query(ArrayList<String> data);

}
