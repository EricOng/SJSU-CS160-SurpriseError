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
        <title>Add Course</title>
        <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
        <link type="text/css" rel="stylesheet" href="css/leanStyle.css" />
        <link type="text/css" rel="stylesheet" href="css/addOfferForm.css" />
    </head>
    
    
    <body>
        <!--
        <div class="container">
            <a id="modal_trigger" href="#modal" class="btn">Add Course</a>

            <div id="modal" class="popupContainerSubmit" style="display:none">
                <header class="popupHeader">
                    <span>Course</span>
                    <span class="modal_close"><i class="fa fa-times"></i></span>
                </header>

                <section class="popupBody">
        -->
                    <!-- Add Offer Form -->
                    <form class="submit_form" id="mainForm" method="process" action="AddOfferFormServlet">
                            <!-- the name attribute adds to the QueryString in the URL -->
                            <fieldset form="mainForm">
                                <p>
                                    <label>Style</label><br>
                                    <input type="text" name="Style" id="style"/>
                                    <br>
                                    <label>Title</label><br>
                                    <input type="text" name="Title" id="title"/>
                                    <br>
                                    <label>Category</label><br>
                                    <select name="Category" id="cate">
                                        <option value=""></option>
                                        <option value="Math">Math</option>
                                        <option value="Language">Language</option>
                                    </select>
                                    <br>
                                    <label>Cost</label><br>
                                    <input type="text" name="Cost" id="cost" value="$0.00"/>
                                    <br>
                                </p>
                                
                            <!-- Dummy Structure for Time : Availability -->
                                <p>
                                    <label>Time</label><br>
                                    <input type="text" name="Time" id="time"/>
                                    <br>
                                    <label>Length</label>
                                    <label class="field">Units</label><br>
                                    <input class="inLength" type="text" name="Length" id="length"/>
                                    <select class="inLength" name="LengthUnits" id="lengthUnits">
                                        <option value=""/>
                                        <option value="Days">Days</option>
                                        <option value="Weeks">Weeks</option>
                                        <option value="Months">Months</option>
                                    </select>
                                    <br>
                                </p>
                                <p>
                                    <label>Link</label><br>
                                    <input type="text" name="Url" id="url" value="None"/>
                                    <br>
                                    <br>
                                </p>
                            </fieldset>
                            
                            <fieldset form="mainForm">
                                <p>
                                    <label>Description</label><br>
                                    <textarea class="descriptionBox" name="Description" id="descr" cols="27"></textarea>
                                    <br>
                                </p>
                            </fieldset>
                            <!-- This button appends the QueryString -->   
                            <div class="submit_button_position">
                                <button class="submit_button" type="submit">Add</button> 
                            </div>
                        </form>
                <!-- </section> -->

        <!--
        <script type="text/javascript">
            $("#modal_trigger").leanModal({top: 200, overlay: 0.6, closeButton: ".modal_close"});

            $(function() {
                // Calling Login Form
                $("#login_form").click(function() {
                    $(".social_login").hide();
                    $(".user_login").show();
                    return false;
                });

                // Calling Register Form
                $("#register_form").click(function() {
                    $(".social_login").hide();
                    $(".user_register").show();
                    $(".header_title").text('Register');
                    return false;
                });

                // Going back to Social Forms
                $(".back_btn").click(function() {
                    $(".user_login").hide();
                    $(".user_register").hide();
                    $(".social_login").show();
                    $(".header_title").text('Login');
                    return false;
                });
            })
        </script>
        -->
    </body>
</html>