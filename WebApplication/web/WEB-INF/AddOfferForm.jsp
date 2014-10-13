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
        
    </body>
</html>
<html lang="en">
    <title>Add Course</title>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
    <link type="text/css" rel="stylesheet" href="css/leanStyle.css" />
    <link type="text/css" rel="stylesheet" href="css/addOfferForm.css" />
    
    
    
    <body>
        <div class="container">
            <a id="modal_trigger" href="#modal" class="btn">Add Course</a>

            <div id="modal" class="popupContainer" style="display:none">
                <header class="popupHeader">
                    <span>Course</span>
                    <span class="modal_close"><i class="fa fa-times"></i></span>
                </header>

                <section class="popupBody">
                    <!-- Add Offer Form -->
                        <form id="mainForm" method="process" action="AddOfferFormServlet">
                            <!-- the name attribute adds to the QueryString in the URL -->
                            <fieldset form="mainForm">
                                <p>
                                    <label class="field">Style</label><br>
                                    <input type="text" name="Style" id="style"/>
                                    <br>
                                    <label class="field">Title</label><br>
                                    <input type="text" name="Title" id="title"/>
                                    <br>
                                    <label class="field">Category</label><br>
                                    <input type="text" name="Category" id="cate"/>
                                    <br>
                                    <label class="field">Cost</label><br>
                                    <input type="text" name="Cost" id="cost"/>
                                    <br>
                                </p>
                            <!-- Dummy Structure for Time : Availability -->
                                <p>
                                    <label class="field">Time</label><br>
                                    <input type="text" name="Time" id="time"/>
                                    <br>
                                    <label class="field">Length</label><br>
                                    <input type="text" name="Length" id="length"/>
                                    <br>
                                </p>
                                <p>
                                    <label class="field">Link</label><br>
                                    <input type="text" name="Url" id="url"/>
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
                </section>
            </div>
        </div>

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
    </body>
</html>