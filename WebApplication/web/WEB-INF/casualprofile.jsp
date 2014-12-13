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
                    <span>First Name :</span>
                        <input id="name" type="text" name="name" placeholder="First Name" />
                </label>
                 <label>
                    <span>Last Name :</span>
                        <input id="name" type="text" name="name" placeholder="Last Name" />
                </label>
                <label>
                    <span>Email :</span>
                    <input id="email" type="email" name="email" placeholder="Valid Email Address" />
                </label>
                 <label>
                    <span>Birthday</span>
                    <input id="email" type="email" name="email" placeholder="Valid Email Address" />
                </label>
                <label>
                    <span>Gender</span>
                    <input id="type" type="text" name="type" placeholder="" />
                </label>

                  
                 <label>
                    <span>&nbsp;</span> 
                    <input type="button" class="button" value="Update Profile" /> 
                </label>  
        </form>
    </c:if>
     <c:if test = "${cuser.set == true}"> 
        <form action="CasualEditServlet" method="process" class="bootstrap-frm">
                <h1>Profile
                    <span></span>
                </h1>
                <label>
                    <span>First Name :</span>
                        <input id="name" type="text" name="fname" value="${cuser.FName}" />
                </label>
                <label>
                    <span>Last Name :</span>
                        <input id="name" type="text" name="lname" value="${cuser.LName}" />
                </label>
                <label>
                    <span>Email :</span>
                    <input id="email" type="email" name="email" value="${cuser.getEmail()}" />
                </label>
                
                <label>
                    <span>Birthday</span>
                    <input id="bday" type="date" name="bday" value="${cuser.getBirthday()}" />
                </label>

                 <label>
                    <span>Gender</span><select name="gender">
                    <option selected="selected" value="${cuser.getGender()}">${cuser.getGender()}</option>
                    <option value="F">Female</option>
                    <option value="M">Male</option>
                    </select>
                </label>    
               
                 <label>
                    <span>&nbsp;</span> 
                    <button type="submit" class="button">Update Profile</button>
                </label>  
        </form>
    </c:if>
</html>
