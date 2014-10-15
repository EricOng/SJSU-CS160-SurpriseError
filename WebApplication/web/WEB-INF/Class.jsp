<%-- 
    Document   : Class
    Created on : Oct 14, 2014, 9:15:54 PM
    Author     : Eileen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>GoodLuck Learning</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-1.css" rel="stylesheet" type="text/css" />
<link href="css/jquery_popup_contactform.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/jquery_popup_contactform.js"></script>
</head>
<body>
	<!-- fix bar goes here -->
	<div>
		<div class="fixbar">
			<div class="single-class-container">
				<div class="logo">
					<a href="index.html"><h1>GoodLuckLearning</h1></a>
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
	<!-- fix bar goes here -->
	<div class="clr"></div>
	<div class="single-class-content-wrapper">
		<p class="search_result"> > Category <a href=""><span class="keyword">Programming</span></a> near <a href=""><span class="keyword">Sunnyvale</span>  </a> > <a href="" style="color:#666;text-decoration:underline;">WEB DEVELOPMENT: HTML AND CSS</a></p>
		<div class="clr" style="height:20px;"></div>
		<div class="class-detail">
			<div class="class-box">
				<h1>WEB DEVELOPMENT <br>HTML AND CSS</h1>


				<h2>About this course</h2>
				<div class="class-description">
					<p>Dive head first into HTML & CSS. This workshop takes a project-based approach to HTML & CSS. By distinguishing good code from bad, participants will focus on learning a subset of the good parts in order to make something (quick and) awesome.
Tackle the barebones of how to quickly develop a web site, and get it live on the Web by the end of the workshop.</p></div>
				<hr>

				<h2>Course Details</h2>
				<table>
					<tr>
						<td><h2>Class Type</h2></td>
						<td><h2></h2></td>
						<td><h2>Class Type</h2></td>
						<td><h2></h2></td>
					</tr>
					<tr>
						<td><h2>Cost</h2></td>
						<td><h2></h2></td>
						<td><h2>Class Duration</h2></td>
						<td><h2></h2></td>
					</tr>
					<tr>
						<td><h2>Availability</h2></td>
						<td><h2></h2></td>
						
					</tr>
				</table>
				
				<div></div>
				<hr>

				<h2>Takeaways</h2>
				<div></div>
				<hr>
				
				<h2>PREREQS & PREPARATION</h2>
				<div class="class-description">
				<p>	Basic HTML experience may be helpful, but is not necessary. Bring a laptop to class (Mac preferred but not required). Please download and install Sublime Text (Hint: the download button is on the home page). Please email us prior to class if you have any additional concerns or questions.</p>

				</div>
				<hr>

				<div class="review-box">
					<h2> 15 Reviews</h2>

					<table class="review-individual">
						<tr >
							<td style="width:20%;">
								<div style="width:100%;height:95%;">
								<img src="images/profile-pic.png" style="width:60%;display:block;margin-left:auto;margin-right:auto;"></div>
								<div class="review-author">Eileen</div>
								</td>
							<td style="width:80%;">
								<div class="review-date"> 12 October 2014</div>
								<div class="review-content">James was really nice and welcoming . The was bed was really comfortable and the location was within walking distance of plenty of things . I would stay there again</div>
							</td>
						</tr>

						<tr>
							<td style="width:20%;">
								<div style="width:100%;height:95%;">
								<img src="images/profile-pic.png" style="width:60%;display:block;margin-left:auto;margin-right:auto;"></div>
								<div class="review-author">Eileen</div>
							<td style="width:80%;">
								<div class="review-date">09 October 2014</div>
								<div class="review-content">James was really nice and welcoming . The was bed was really comfortable and the location was within walking distance of plenty of things . I would stay there again</div>
							</td>
						</tr>								
					</table>	
				</div>	
			</div>
			</div>












			<div class="provider-box">
				<div style="height:100px"></div>
					<div class="wish-list"><i class="fa fa-heart"></i> &nbsp;Save to Wish List</div>
				<div style="height:10px"></div>
				<div class="request-for-info" id="onclick">Request for Info</div>
				<div style="height:40px"></div>
				<div >
					<img src="images/edu1.jpg" width="200" height="auto">
				</div>
				<div class="clr" style="height:40px;"></div>
				<div class="map">
				<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script><div style="overflow:hidden;height:300px;width:200px;"><div id="gmap_canvas" style="height:300px;width:200px;"></div><style>#gmap_canvas img{max-width:none!important;background:none!important}</style><a class="google-map-code" href="http://www.trivoo.net" id="get-map-data">lea</a></div><script type="text/javascript"> function init_map(){var myOptions = {zoom:14,center:new google.maps.LatLng(37.3366915,-121.88020180000001),mapTypeId: google.maps.MapTypeId.ROADMAP};map = new google.maps.Map(document.getElementById("gmap_canvas"), myOptions);marker = new google.maps.Marker({map: map,position: new google.maps.LatLng(37.3366915, -121.88020180000001)});infowindow = new google.maps.InfoWindow({content:"<b>San Jose State University</b><br/>1 Washington Sq,<br/> San Jose" });google.maps.event.addListener(marker, "click", function(){infowindow.open(map,marker);});infowindow.open(map,marker);}google.maps.event.addDomListener(window, 'load', init_map);</script>
			</div>
			<div style="height:40px"></div>
			
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			</div>
                        <!-- Contact Form -->
                    <div id="contactdiv">
                    <form class="form" action="#" id="contact">
                    <img src="images/button_cancel.png" class="img" id="cancel" width="32px"/>
                    <h3>Request Info Form</h3>
                    <label>Name: <span>*</span></label>
                    <input type="text" id="name" placeholder="Name"/>
                    <label>Email: <span>*</span></label>
                    <input type="text" id="email" placeholder="Email"/>
                    <label>Contact No: <span>*</span></label>
                    <input type="text" id="contactno" placeholder="10 digit Mobile no."/>
                    <label>Message:</label>
                    <textarea id="message" placeholder="Message......."></textarea>
                    <input type="button" id="send" value="Send"/>
                    <input type="button" id="cancel" value="Cancel"/>
                    <br/>
                    </form>
                    </div>
                        
                    <!-- Contact Form -->
		</div>	
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<div class="clr"></div>
</body>
</html>