<%-- 
    Document   : Login.jsp
    Created on : Sep 8, 2014, 11:06:54 AM
    Author     : Eric Ong
                    David Ho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<title>Login or Register</title>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="css/leanStyle.css" />

<body>
    <div class="login"> 
        <a id="modal_trigger" href="#modal">
            Login  |  Sign Up  
        </a>
    </div>
    <div id="modal" class="popupContainer" style="display:none;">
        <header class="popupHeader">
            <span class="header_title">Login</span>
            <span class="modal_close"><i class="fa fa-times"></i></span>
        </header> 

        <section class="popupBody"> 
            <!-- Social Login -->
            <div class="social_login">
                <div class="">
                </div>

                <div class="centeredText">
                    <span>Or use your Email address</span>
                </div>

                <div class="action_btns">
                    <div class="one_half"><a href="#" id="login_form" class="btn">Login</a></div>
                    <div class="one_half last"><a href="#" id="register_form" class="btn">Sign up</a></div>
                    <div class="one_half last"><a href="#" id="business_register_form" class="btn">Business Sign up</a></div>
                </div>
            </div>

            <!-- Username & Password Login form -->
            <div class="user_login" >
                <form action="login">
                    <label>Email / Username</label>
                    <input type="text" name="User"/>
                    <br />

                    <label>Password</label>
                    <input type="password" name="Pass"/>
                    <br />

                    <div class="checkbox">
                        <input id="remember" type="checkbox" />
                        <label for="remember">Remember me on this computer</label>
                    </div>

                    <div class="action_btns">
                        <div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
                        <div class="one_half last">
                            <button id="button_red" type="submit" class="button_red">Login</button>
                        </div> 
                    </div>
                </form>

                <a href="#" class="forgot_password">Forgot password?</a>
            </div>

            <!-- Register Form -->
            <div class="user_register">
                <form>
                    <label>Full Name</label>
                    <input type="text" />
                    <br />

                    <label>Email Address</label>
                    <input type="email" />
                    <br />

                    <label>Password</label>
                    <input type="password" />
                    <br />

                    <div class="checkbox">
                        <input id="send_updates" type="checkbox" />
                        <label for="send_updates">Send me occasional email updates</label>
                    </div>

                    <div class="action_btns">
                        <div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
                        <div class="one_half last"><a href="#" class="btn btn_red">Register</a></div>
                    </div>
                </form>
            </div>

            <div class="business_user_register" style="display:none;">
                <form>
                    <label>Full Name</label>
                    <input type="text" />
                    <br />

                    <label>Business Name</label>
                    <input type="business_name" />
                    <br />

                    <label>Email Address</label>
                    <input type="email" />
                    <br />

                    <label>Password</label>
                    <input type="password" />
                    <br />

                    <div class="checkbox">
                        <input id="send_updates" type="checkbox" />
                        <label for="send_updates">Send me occasional email updates</label>
                    </div>

                    <div class="action_btns">
                        <div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
                        <div class="one_half last"><a href="#" class="btn btn_red">Register</a></div>
                    </div>
                </form>
            </div>

        </section>
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
                    $(".business_user_register").hide();
                    $(".header_title").text('Register');
                    return false;
                });
                
                // Calling Business Register Form
                $("#business_register_form").click(function() {
                    $(".social_login").hide();
                    $(".user_register").hide();
                    $(".business_user_register").show();
                    $(".header_title").text('Business Register');
                    return false;
                });

                // Going back to Social Forms
                $(".back_btn").click(function() {
                    $(".user_login").hide();
                    $(".user_register").hide();
                    $(".business_user_register").hide();
                    $(".social_login").show();
                    $(".header_title").text('Login');
                    return false;
                });

            })
        </script>
    </body>
</html>