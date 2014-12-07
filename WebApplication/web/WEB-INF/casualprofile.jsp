<%-- 
    Document   : casualprofile
    Created on : Dec 6, 2014, 5:46:00 PM
    Author     : Eric Ong
--%>

<%@page import="Bean.CasualUserInfoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%
        System.out.println("Dash page loading");
        CasualUserInfoBean cuser = (CasualUserInfoBean) session.getAttribute("cuser");
        if( cuser == null ){
            System.out.println("cbean null");
            cuser = new CasualUserInfoBean();
            session.setAttribute("cuser", cuser);
        }
        System.out.println("A cuser obtained");
    %>
    <c:if test = "${cuser.set == false}"> 
        <form action="" method="post" class="bootstrap-frm">
                <h1>Profile
                    <span></span>
                </h1>
                <label>
                    <span>Name :</span>
                        <input id="name" type="text" name="name" placeholder="Your Full Name" />
                </label>
                <label>
                    <span>Email :</span>
                    <input id="email" type="email" name="email" placeholder="Valid Email Address" />
                </label>
                 <label>
                    <span>Contact</span>
                    <input id="email" type="email" name="email" placeholder="Valid Email Address" />
                </label>
                <label>
                    <span>Type</span>
                    <input id="type" type="text" name="type" placeholder="" />
                </label>

                 <label>
                    <span>Location</span><select name="selection">
                    <option value="Job Inquiry">Job Inquiry</option>
                    <option value="General Question">General Question</option>
                    </select>
                </label>    
                <label>
                    <span>Subject :</span><select name="selection">
                    <option value="Job Inquiry">Job Inquiry</option>
                    <option value="General Question">General Question</option>
                    </select>
                </label>    
                <label>
                    <span>Subject :</span><select name="selection">
                    <option value="Job Inquiry">Job Inquiry</option>
                    <option value="General Question">General Question</option>
                    </select>
                </label>    
                 <label>
                    <span>&nbsp;</span> 
                    <input type="button" class="button" value="Update" /> 
                </label>  
        </form>
    </c:if>
     <c:if test = "${cuser.set == true}"> 
        <form action="" method="post" class="bootstrap-frm">
                <h1>Profile
                    <span></span>
                </h1>
                <label>
                    <span>Name :</span>
                        <input id="name" type="text" name="name" placeholder="${cuser.FName} ${cuser.LName}" />
                </label>
                <label>
                    <span>Email :</span>
                    <input id="email" type="email" name="email" placeholder="${cuser.getEmail()}" />
                </label>
                 <label>
                    <span>Contact</span>
                    <input id="email" type="email" name="email" placeholder="Valid Email Address" />
                </label>
                <label>
                    <span>Type</span>
                    <input id="type" type="text" name="type" placeholder="" />
                </label>

                 <label>
                    <span>Location</span><select name="selection">
                    <option value="Job Inquiry">Job Inquiry</option>
                    <option value="General Question">General Question</option>
                    </select>
                </label>    
                <label>
                    <span>Subject :</span><select name="selection">
                    <option value="Job Inquiry">Job Inquiry</option>
                    <option value="General Question">General Question</option>
                    </select>
                </label>    
                <label>
                    <span>Subject :</span><select name="selection">
                    <option value="Job Inquiry">Job Inquiry</option>
                    <option value="General Question">General Question</option>
                    </select>
                </label>    
                 <label>
                    <span>&nbsp;</span> 
                    <input type="button" class="button" value="Update" /> 
                </label>  
        </form>
    </c:if>
</html>
