<%-- 
    Document   : casualprofile
    Created on : Dec 6, 2014, 5:46:00 PM
    Author     : Eric Ong
--%>

<%@page import="Bean.BusinessUserInfoBean"%>
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
        BusinessUserInfoBean buser = (BusinessUserInfoBean) session.getAttribute("buser");
        if( buser == null ){
            System.out.println("cbean null");
            buser = new BusinessUserInfoBean();
            session.setAttribute("buser", buser);
        }
        System.out.println("A buser obtained");
    %>
    <c:if test = "${buser.set == false}"> 
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
     <c:if test = "${buser.set == true}"> 
        <form action="BusinessEditServlet" method="post" class="bootstrap-frm">
                <h1>Profile
                    <span></span>
                </h1>
                <label>
                    <span>Name :</span>
                        <input id="name" type="text" name="name" placeholder="${buser.businessName} " />
                </label>
                <label>
                    <span>Email :</span>
                    <input id="email" type="email" name="email" placeholder="${buser.getEmail()}" />
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
