<%-- 
    Document   : dashboard
    Created on : Oct 27, 2014, 8:23:45 PM
    Author     : Eileen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session='true'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>GoodLuck Learning</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-1.css" rel="stylesheet" type="text/css" />
<link href="css/dashboard.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
<script type="text/javascript">
	var tabLinks = new Array();
    var contentDivs = new Array();

 function init() {

      // Grab the tab links and content divs from the page
      var tabListItems = document.getElementById('tab').childNodes;
      
      for ( var i = 0; i < tabListItems.length; i++ ) {
        if ( tabListItems[i].nodeName == "LI" ) {
       
          var tabLink = getFirstChildWithTagName( tabListItems[i], 'A' );
           
          var id = getHash( tabLink.getAttribute('href') );
          
          tabLinks[id] = tabLink;
          contentDivs[id] = document.getElementById( id );
          
        }
      }

      // Assign onclick events to the tab links, and
      // highlight the first tab
      var i = 0;

      for ( var id in tabLinks ) {
        tabLinks[id].onclick = showTab;
        tabLinks[id].onfocus = function() { this.blur() };
        if ( i == 0 ) tabLinks[id].className = 'active';
        i++
      }

      // Hide all content divs except the first
      var i = 0;

      for ( var id in contentDivs ) {
        if ( i != 0 ) contentDivs[id].className = 'tab-box hide';
        i++;
      }
    }
function showTab() {
      var selectedId = getHash( this.getAttribute('href') );

      // Highlight the selected tab, and dim all others.
      // Also show the selected content div, and hide all others.
      for ( var id in contentDivs ) {
        if ( id == selectedId ) {
          tabLinks[id].className = 'active';
          contentDivs[id].className = 'tab-box';
        } else {
          tabLinks[id].className = '';
          contentDivs[id].className = 'tab-box hide';
        }
      }

      // Stop the browser following the link
      return false;
    }
function getFirstChildWithTagName( element, tagName ) {
      for ( var i = 0; i < element.childNodes.length; i++ ) {
        if ( element.childNodes[i].nodeName == tagName ){
        	
        	return element.childNodes[i];
         }
      }
    }
      function getHash( url ) {
      var hashPos = url.lastIndexOf ( '#' );
      return url.substring( hashPos + 1 );
    }
	</script>
</head>
<body onload="init()">
	<!-- fix bar goes here -->
        <jsp:include page="searchNavi.jsp"></jsp:include>
	<!-- fix bar goes here -->
	<div class="clr" style="height:60px;"></div>
	<div class="dashboard-wrapper">
		
		<ul class="dashboard-list" id="tab">
			<li><a href="#tabs-1">Profile</a></li>
		<!--	<li><a href="#tabs-2">Your Listings</a></li>-->
			<li><a href="#tabs-3">Your Listings</a></li>
                        <li><a href="#tabs-4">Add Course</a></li>
			
		</ul>
		
		<div class="clr" style="height:0px;"></div>

		<!--class listing box -->
		<div class="tab-box hide" id="tabs-2"> 
                    <div class="single-box">
			<div >
                            <ul class="result_in_grid">
                                <li><a class="list_block">
                                    <div>
                                        <div class="course-type-distance">
                                                <p>Distance-Learning</p>
                                        </div>
                                        <div class="course-title">
                                            <h1>Algebra G3-G4</h1>
                                        </div>
                                        <div class="provider-logo">
                                            <img src="images/edu1.jpg">
                                        </div>

                                        <ul class="inline-list">
                                            <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                                    <!--<span class="rating star"></span>
                                                     <span class="rating star"></span>
                                                     <span class="rating star"></span><br>-->
                                                <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i>
                                            </li>
                                            <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;740</li>
                                            <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>
                                            <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                        </ul>
                                    </div>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
		</div>
		<!-- class listing box -->
                
                
		<!-- edit profile box -->
		<div class="tab-box" id="tabs-1" > 
                    <div class="left">
                        <div class="profile-pic"><img src=""></div>
                        <div><h3>Some Name</h3></div>
                        <div><h2>Kenndy School</h2></div>
                        <div class="request-for-info" id="onclick">Edit Your Profile</div>
                    </div>
                    <div class="right">
                        <jsp:include page="casualprofile.jsp"></jsp:include>
                    </div>
		</div>
		<!-- profile box -->
                
                
		<!--inbox box -->
		<div class="tab-box" id="tabs-3"> 
                    <div>
                        <ul class="result_in_grid">
                            <li>
                                <a class="list_block">
                                <div>
                                    <div class="course-title">
                                    <h1>Algebra</h1>
                                    </div>
                                    <br>

                                    <ul class="inline-list">
                                        <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                            <!--<span class="rating star"></span>
                                             <span class="rating star"></span>
                                             <span class="rating star"></span><br>-->
                                             <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
                                        </li>
                                        <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;$740</li>
                                        <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>
                                        <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                                    </ul>
                                </div>
                                </a>
                            </li>
                        </ul>
                    </div>	
                </div>
		<!-- inbox box -->

                
                <!--Add Course -->
		<div class="tab-box " id="tabs-4"> 
                    <div style="border: solid thin black;">
                       <jsp:include page="AddOfferForm.jsp"></jsp:include> 
                    </div>
                </div>
		<!-- Add Course -->
	</div>
	</div>
	<div class="clr" style="height:20px;"></div>
</body>
</html>
