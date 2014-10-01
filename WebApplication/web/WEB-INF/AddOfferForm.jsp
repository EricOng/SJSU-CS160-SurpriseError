<%-- 
    Document   : AddOfferForm
    Created on : Oct 1, 2014, 1:04:26 PM
    Author     : Eric Ong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Offer</title>
    </head>
    <body>
        <div>
            <form>
                <!-- the name attribute adds to the QueryString in the URL -->
                Style <input type="text" name="Style" id="style"/><br>
                Title <input type="text" name="Title" id="title"/><br>
                Type  <input type="text" name="Type" id="type"/><br>
                Cost  <input type="text" name="Cost" id="cost"/><br>
                <!-- Dummy Structure for Time : Availability -->
                Time  <input type="text" name="Time" id="time"/><br>
                Length<input type="text" name="Length" id="length"/><br>
                <!-- This button appends the QueryString -->
                <input type="submit"/> 
            </form>
        </div>
    </body>
</html>
