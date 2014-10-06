<%@ page import="java.util.*" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
 
<html>
    <head>
    </head>
    <body>
        <h1>Hi there</h1>
        
           <table width="700px" align="center"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=4 align="center"
                    style="background-color:teal">
                    <b>Classes Results</b></td>
            </tr>
            <tr style="background-color:lightgrey;">
                <td><b>ID</b></td>
                <td><b>Name</b></td>
                <td><b>Category</b></td>
                <td><b>Provider</b></td>
                <td><b>Description</b></td>
                <td><b>Cost</b></td>
            </tr>
            <%
                int count = 0;
                String color = "#F9EBB3";
                if (request.getAttribute("classes") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("classes");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
 
                        if ((count % 2) == 0) {
                            color = "#eeffee";
                        }
                        count++;
                        ArrayList cList = (ArrayList) itr.next();
            %>
            <tr style="background-color:<%=color%>;">
                <td><%=cList.get(0)%></td>
                <td><%=cList.get(1)%></td>
                <td><%=cList.get(2)%></td>
                <td><%=cList.get(3)%></td>
                <td><%=cList.get(4)%></td>
                <td><%=cList.get(5)%></td>
                
            </tr>
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </tr>
            <%            }
            %>
        </table>
    </body>
</html>