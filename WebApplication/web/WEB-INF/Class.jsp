<%-- 
    Document   : Class
    Created on : Oct 14, 2014, 9:15:54 PM
    Author     : Eileen
--%>

<%@ page import="Bean.DetailedClassBean" %> 
<%@ page import="Bean.ReviewBean" %> 
<%@ page import="java.util.* " %>
<%@page contentType="text/html" pageEncoding="UTF-8" session='true'%>
<!DOCTYPE HTML>
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
	 <jsp:include page="searchNavi.jsp"></jsp:include>
	<!-- fix bar goes here -->
        
      
        
	<div class="clr"></div>
	<div class="single-class-content-wrapper">
	<%
            int count = 0;
            String color = "#F9EBB3";
            DetailedClassBean myClass;
            if (request.getAttribute("class") != null) {
                myClass = (DetailedClassBean) request.getAttribute("class");
        %>
            
            
            <p class="search_result"> Category 
                <a href="">
                    <span class="keyword">Programming</span>
                </a> 
                > 
                <a href="" style="color:#666;text-decoration:underline;">
                    <%=myClass.getClassName()%>
                </a>
            </p>
		<div class="clr" style="height:50px;"></div>
                
         
		<div class="class-detail">
                    <div class="wish-list"><i class="fa fa-heart"></i> &nbsp;Save to Wish List</div>
			<div class="class-box">
				<h1> <%=myClass.getClassName()%></h1>


				<h2>About this course</h2>
				<div class="class-description">
                                    <p>
                                         <%=myClass.getDescription()%>
                                    </p></div>
				<hr>

				<h2>Course Details</h2>
				<table>
					<tr>
						<td><h2>Category</h2></td>
						<td><p><%=myClass.getClassCategory()%></p></td>
						<td><h2>Class Type</h2></td>
						<td><p><%=myClass.getClassType()%></p></td>
					</tr>
					<tr>
						<td><h2>Cost</h2></td>
						<td><p><%=myClass.getCost()%></p></td>
						<td><h2>Class Duration</h2></td>
						<td><p><%=myClass.getDuration()%></p></td>
					</tr>
					<tr>
						<td><h2>Availability</h2></td>
						<td><p><%=myClass.getAvailability()%></p></td>
						
					</tr>
				</table>
				<hr>

				
				<h2>PREREQS & PREPARATION</h2>
				<div class="class-description">
				<p><%=myClass.getClassPrereqs()%></p>

				</div>
				<hr>

                                <%                     
                                   ArrayList<ReviewBean> rList = myClass.getReviewList();
                                   int numOfReview = rList.size();
                                %>       
				<div class="review-box">
					<h2> <%=numOfReview%> Reviews</h2>

					<table class="review-individual">
					<%                                   
                                         for(int i=0; i<rList.size();i++){
                                          ReviewBean myreview = rList.get(i);
                                     %>   	
                                            <tr >
							<td style="width:20%;">
								<div style="width:100%;height:95%;">
								<img src="images/profile-pic.png" style="width:60%;display:block;margin-left:auto;margin-right:auto;"></div>
								<div class="review-author"><%=myreview.getUserName()%></div>
								</td>
							<td style="width:80%;">
								<div class="review-date"> 12 October 2014</div>
								<div class="review-content"><%=myreview.getText()%></div>
							</td>
						</tr>

						
                                                <%                                   
                                         }
                                     %>   
					</table>	
				</div>	
			</div>
			</div>












			<div class="provider-box">
				
				<div style="height:10px"></div>
				<div class="request-for-info" id="onclick">Request for Info</div>
				<div style="height:40px"></div>
                               
				<div>
					<img src="images/edu1.jpg" style="width:200px; height:auto">
				</div>
				<div style="height:5px"></div>
                                <div>
                                    <h2>ThankTankLearning</h2>
                                    <h3>+1 (408) 480-2829</h3>
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
                    <img src="images/button_cancel.png" class="img" id="cancel" style="width:32px"/>
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
                 <%
                
            }
        %>	
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<div class="clr"></div>
</body>
</html>