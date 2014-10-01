/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Eric Ong
 */
public class AddOfferFormHandler implements IHandler {

    @Override
    public List<String> parse(HttpServletRequest request) {
        List<String> parseData = new ArrayList<String>();

        String raw = request.getQueryString();
        String container[] = raw.split("&");
        parseData = Arrays.asList(container);
        return parseData;
    }

    @Override
    public List<String> query(List<String> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
