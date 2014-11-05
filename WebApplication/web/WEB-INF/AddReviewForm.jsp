<%-- 
    Document   : AddReviewForm
    Created on : Nov 3, 2014, 12:27:08 PM
    Author     : Eric Ong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Easter Egg =D</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
        <link type="text/css" rel="stylesheet" href="css/reviews.css" />
    </head>
    <body>
        <h1>ADD REVIEW</h1>
        <form id='mainform'>
            <fieldset id='c_stars' form='mainform'>
                <h2 class=''>Rating</h2>
                <input id='RatingInput' type='text' name='rating' value='1' style='display: none;'/>
                <ul class=''>
                    <i id='1' class="fa fa-star" ></i>
                    <i id='2' class="fa fa-star-o" ></i>
                    <i id='3' class="fa fa-star-o" ></i>
                    <i id='4' class="fa fa-star-o" ></i>
                    <i id='5' class="fa fa-star-o" ></i>
                </ul>
            </fieldset>
            <br>
            
            <fieldset id='c_effort' form='mainform'>
                <div class='half_1st'>
                    <h2>Effort</h2>
                    <select id='effort' name='effort'>
                        <option value='3'></option>
                        <option value='1'>Effortless    </option>
                        <option value='2'>Some Effort   </option>
                        <option value='3'>Moderate      </option>
                        <option value='4'>Tough         </option>
                        <option value='5'>Ridiculous    </option>
                    </select> 
                </div>
                <div class='half_2nd'>
                    <!-- Help info -->
                    <div class='half_1st'>
                        <text>Effortless</text><br>
                        <text>Some Effort</text><br>
                        <text>Moderate</text><br>
                        <text>Tough</text><br>
                        <text>Ridiculous</text><br>
                    </div>
                    <div class='half_2nd'>
                        <text>[< 1 hr per day]</text><br>
                        <text>[< 2 hr per day]</text><br>
                        <text>[2-3 hr per day]</text><br>
                        <text>[3-4 hr per day]</text><br>
                        <text>[> 4 hr per day]</text><br>   
                    </div>
                </div>
                <!-- 
                    ***********************
                    Help Bubble Can Go Here
                           Do Want?
                    ***********************
                -->
            </fieldset>
            <br>
            <fieldset id='c_comment' form='mainform'>
                <h2>Comments</h2>
                <textarea id='commentBox' class='fill' name="Description" id="descr" cols="27"></textarea>
            </fieldset>
            <br>
            <fieldset id='c_tags' form='mainform'>
                <h2>Tag this class</h2>
                <p>Pick as many that apply</p>
                <input type='checkbox' name='attrFun'>
                <label>Fun</label>
                <input type='checkbox' name='attr'>
                <label>PH</label>
                <input type='checkbox' name='attr'>
                <label>PH</label>
                <input type='checkbox' name='attr'>
                <label>PH</label>
                <input type='checkbox' name='attr'>
                <label>PH</label>
            </fieldset>
            <br>
            <!-- This button appends the QueryString -->   
            <div class="submit_button_position">
                <button class="submit_button" type="submit">Add</button> 
            </div>
        </form>
        <script type="text/javascript">
        
        /**
         * Script for coloring Rating Stars - Begin
         */
            //1 Star
            $("#1").hover(
                function(){
                    clean();
                    hoverEffectOn($("#1"));
                    $("#RatingInput").attr("value", "1");
                }
            );
            //2 Star
            $("#2").hover(
                function(){
                    clean();
                    hoverEffectOn($("#1"));
                    hoverEffectOn($("#2"));
                    $("#RatingInput").attr("value", "2");
                }
            );
            // 3 Star
            $("#3").hover(
                function(){
                    clean();
                    hoverEffectOn($("#1"));
                    hoverEffectOn($("#2"));
                    hoverEffectOn($("#3"));
                    $("#RatingInput").attr("value", "3");
                }
            );
            //4 Star
            $("#4").hover(
                function(){
                    clean();
                    hoverEffectOn($("#1"));
                    hoverEffectOn($("#2"));
                    hoverEffectOn($("#3"));
                    hoverEffectOn($("#4"));
                    $("#RatingInput").attr("value", "4");
                }
            );
            //5 Star
            $("#5").hover(
                function(){
                    clean();
                    hoverEffectOn($("#1"));
                    hoverEffectOn($("#2"));
                    hoverEffectOn($("#3"));
                    hoverEffectOn($("#4"));
                    hoverEffectOn($("#5"));
                    $("#RatingInput").attr("value", "5");
                }
            );
    
            //Color in a Star
            function hoverEffectOn(obj){
                obj.removeClass("fa fa-star-o");
                obj.addClass("fa fa-star");
            };
            //Color out a Star
            function hoverEffectOff(obj){
                obj.removeClass("fa fa-star");
                obj.addClass("fa fa-star-o");
            };
            //Clean all
            function clean(){
                hoverEffectOff($("#1"));
                hoverEffectOff($("#2"));
                hoverEffectOff($("#3"));
                hoverEffectOff($("#4"));
                hoverEffectOff($("#5"));
            }
        /**
         * Script for coloring Rating Stars - End
         */
        </script>
    </body>
</html>
