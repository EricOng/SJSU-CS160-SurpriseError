<%-- 
    Document   : LinkCss
    Created on : Sep 21, 2014, 1:27:15 PM
    Author     : Eric Ong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
    </head>
    <body>
        <div>
            <div class="fixbar">
            <div class="container">
                    <div class="logo">
                            <h1>GoodLuckLearning</h1>
                    </div>
                    <div id="search" class="container-1">
                            <div  class="search-container">	
                                    <form class="searchform">
                                            <select class="search_category" value="Category">
                                                    <option>Category</option>
                                                    <option>1</option>
                                                    <option>2</option>
                                                    <option>3</option>
                                            </select>

                                            <input class="searchfield" style="width: 200px;"type="text" placeholder="Keywords: Javascript, Afterschool..." onfocus="if (this.value == 'Keywords: Javascript, Afterschool...') {this.value = '';}" onblur="if (this.value == '') {this.value = '';}">
                                            <input class="searchfield" style="width: 100px;" type="text" placeholder="Near: zipcode" onfocus="if (this.value == 'Search...') {this.value = '';}" onblur="if (this.value == 'zipcode') {this.value = '';}">
                                            <input class="searchbutton" type="button" value="Go">
                                    </form>
                            </div>
                            <div class="login-container">
                                    <a href="">Login  </a>| <a href="">Sign Up </a>
                            </div>	
                    </div>
            </div>
            </div>
        </div>
            <div class="clr"></div>
            <div class="content-wrapper">
                    <p class="search_result">1-9 of 102 results for category <a href=""><span class="keyword">Programming</span></a> near <a href=""><span class="keyword">Sunnyvale</span></a></p>
                    <div class="clr"></div>
                    <div >
                            <ul class="result_in_grid">

                                            <li><a class="list_block">
                                                    <div>
                                                            <div class="course-title">
                                                            <h1>Intro to Java Programming</h1>
                                                            </div>
                                                            <br>

                                                            <ul class="inline-list">
                                                                    <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                                            <!--<span class="rating star"></span>
                                                                             <span class="rating star"></span>
                                                                             <span class="rating star"></span><br>-->
                                                                             <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
                                                                    </li>
                                                                    <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;740</li>
                                                                    <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>
                                                                    <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                                            </ul>
                                                    </div></a>
                                            </li>
                                            <li><a class="list_block">
                                                    <div>
                                                            <div class="course-title">
                                                            <h1>Intermediate Java Programming</h1>
                                                            </div>
                                                            <br>

                                                            <ul class="inline-list">
                                                                    <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                                            <!--<span class="rating star"></span>
                                                                             <span class="rating star"></span>
                                                                             <span class="rating star"></span><br>-->
                                                                             <i class="fa fa-star"></i><i class="fa fa-star"></i>
                                                                    </li>
                                                                    <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;740</li>
                                                                    <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>
                                                                    <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                                            </ul>
                                                    </div></a>
                                            </li>
                                            <li><a class="list_block">
                                                    <div>
                                                            <div class="course-title">
                                                            <h1>Mobile Development: Android</h1>
                                                            </div>
                                                            <br>

                                                            <ul class="inline-list">
                                                                    <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                                            <!--<span class="rating star"></span>
                                                                             <span class="rating star"></span>
                                                                             <span class="rating star"></span><br>-->
                                                                             <i class="fa fa-star"></i><i class="fa fa-star"></i>
                                                                    </li>
                                                                    <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;300</li>
                                                                    <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;5 Class Meetings</li>
                                                                    <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                                            </ul>
                                                    </div></a>
                                            </li>
                                            <li>
                                            <a class="list_block">
                                                    <div>
                                                            <div class="course-title">
                                                            <h1>Programming Languages</h1>
                                                            </div>
                                                            <br>

                                                            <ul class="inline-list">
                                                                    <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                                            <!--<span class="rating star"></span>
                                                                             <span class="rating star"></span>
                                                                             <span class="rating star"></span><br>-->
                                                                             <i class="fa fa-star"></i><i class="fa fa-star"></i>
                                                                    </li>
                                                                    <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;FREE</li>
                                                                    <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10-weeks</li>
                                                                    <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                                            </ul>
                                                    </div></a></li>
                                            <li>
                                            <a class="list_block">
                                                    <div>
                                                            <div class="course-title">
                                                            <h1>Web Development: HTML and CSS</h1>
                                                            </div>
                                                            <br>

                                                            <ul class="inline-list">
                                                                    <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                                            <!--<span class="rating star"></span>
                                                                             <span class="rating star"></span>
                                                                             <span class="rating star"></span><br>-->
                                                                             <i class="fa fa-star"></i><i class="fa fa-star"></i>
                                                                    </li>
                                                                    <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;79</li>
                                                                    <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10-weeks</li>
                                                                    <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                                            </ul>
                                                    </div></a>
                                            </li>
                                            <li>
                                                    <a class="list_block">
                                                    <div>
                                                            <div class="course-title">
                                                            <h1>Web Development: JAVASCRIPT</h1>
                                                            </div>
                                                            <br>

                                                            <ul class="inline-list">
                                                                    <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                                            <!--<span class="rating star"></span>
                                                                             <span class="rating star"></span>
                                                                             <span class="rating star"></span><br>-->
                                                                             <i class="fa fa-star"></i><i class="fa fa-star"></i>
                                                                    </li>
                                                                    <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;FREE</li>
                                                                    <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10-weeks</li>
                                                                    <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                                            </ul>
                                                    </div></a>
                                            </li>
                                            <li></li>
                                            <li></li>
                                            <li></li>

                            </ul>
                    </div>	
                    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            </div>
    </body>
</html>
