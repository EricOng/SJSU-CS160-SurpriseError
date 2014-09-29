<%-- 
    Document   : LinkCss
    Created on : Sep 21, 2014, 1:27:15 PM
    Author     : Eric Ong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>GoodLuck Learning</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
	<script type="text/javascript">
<!--
    function toggle_visibility(id) {
       var e = document.getElementById(id);
       if(e.style.display == 'block')
          e.style.display = 'none';
       else(e.style.display == 'none')
          e.style.display = 'block';
    }
//-->
</script>
</head>
<body>
	<div>
		<div class="fixbar">
			<div class="container">
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
	<div class="clr"></div>
	<div class="content-wrapper">
		<p class="search_result">1-4 of 4 results for category <a href=""><span class="keyword">Mathematics</span></a> near <a href=""><span class="keyword">Sunnyvale</span></a></p>
		<div class="clr" style="height:10px;"></div>
		<div class="filter">
			<p><a href="" onclick="toggle_visibility('advanced-filter');"><i class="fa fa-caret-down"></i> Advanced Filter</a></p>
			<div class="filter-div" id="advanced-filter">
			</div>	
		</div>	
		<div class="clr" style="height:30px;"></div>
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
						</div></a>
					</li>
					<li><a class="list_block">
						<div>
							<div class="course-type-distance">
								<p>Distance-Learning</p>
							</div>
							<div class="course-title">
							<h1>Algebra G5</h1>
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
						</div></a>
					</li>
					<li><a class="list_block">
						<div>
							<div class="course-type-physical">
								<p>In-Person</p>
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
						</div></a>
					</li>

					<li><a class="list_block">
						<div>
							<div class="course-type-physical">
								<p>In-Person</p>
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
						</div></a>
					</li>
			</ul>
		</div>	
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</div>
</body>
</html>