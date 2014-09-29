<%-- 
    Document   : index
    Created on : Sep 15, 2014, 3:54:10 PM
    Author     : Eric Ong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>GoodLuck Learning</title>
		<link href="css/style.css" rel="stylesheet" type="text/css" />
	</head>

	<style type="text/css">
		body
		{
			width: 100%;
			background: url('images2.jpg') no-repeat center center fixed; 
			  -webkit-background-size: cover;
			  -moz-background-size: cover;
			  -o-background-size: cover;
			  background-size: cover;
			  right:0;
			  overflow: hidden;
			left: 0;
					}
		.mainbar
		{
			height:70px;
			width:100%;
			position: absolute;
			right:0;
			left: 0;
			background: rgba(46,46,46,0.9);
    		box-shadow: 0 0 5px rgba(46,46,46,0.9);
			margin-top:50px;
		}
		.mainbar_cointainer
		{
			width: 800px;
			margin-left:auto;
			margin-right:auto;

			padding-top:13px;
			display: block;
		}
		.class
		{
			width:auto;
			display: inline-block;
		}
		.class_textbox
		{
			width:300px;
			font-size: 20pt;

			border-radius: 5px;
			outline: none;
		}
		.categories
		{
			width:auto;
			display: inline-block;
		}
		.categories_select
		{
			font-size: 20pt;
			border-radius: 5px;
			outline: none;
		}
		.zipcode
		{
			width:auto;
			display: inline-block;
		}
		.zipcode_textbox
		{
			width:120px;
			font-size: 20pt;

			border-radius: 5px;
			outline: none;
		}
		.search
		{
			width:auto;
			display: inline-block;
		}
		.search_button
		{
			font-size: 20pt;
			border-radius: 5px;
			outline: none;
		}
		.nav{
			width: 990px;
  			margin: 0px auto;
		}
		.nav h1{
			margin-top: 15px;
    text-align: left;
    
    text-transform: none;
    font-size: 30px;
    font-family: 'Open Sens', sans-serif;
    color:#fff;
    text-shadow: 0px 2px 2px rgba(121,121, 121, 0.4); 
		}
		.login{
			float:right;
			margin-top: 25px;
			font-size: 16px;
		    font-family: 'Open Sens', sans-serif;
		    color:#fff;
		}
		.login a{
			text-transform: uppercase;
			text-decoration: none;
			color:#fff;
		}
		.login a:hover{
			text-transform: uppercase;
			text-decoration: none;
			font-weight: bold;
		}
		a{
			text-decoration: none;
		}
		h1{
			text-transform: uppercase;
			text-decoration: none;
			color:#fff;
			font-size: 34px;
			text-align: center;
			font-weight: bold;
		    font-family: 'Raleway', sans-serif;
		}
		h3{
			text-decoration: none;
			color:#f7f7f7;
			font-weight: none;
			font-size: 20px;
			text-align: center;
		    font-family: 'Raleway', sans-serif;
		}
	</style>

	<body>
		<div class="nav">
			<div style="float:left;width: 200px;">
			<a href=""><h1>GoodLuckLearning</h1><a></div>
			<div class="login">
						<a href="index.html">Login   </a>|  <a href="">Sign Up </a>
			</div>	
		</div>
		<div class="clr" style="height:150px;"></div>
		<div>
				<h1>Better way to find Educational Programs</h1>
				<h3>from Personal Tutors, Local Educational Centers to online educations</h3>
			</div>
		<div class="mainbar">
			<!--<div class="mainbar_cointainer">
				<span>

					<div class="class">
						<input type="text" class="class_textbox" placeholder="Class Name"/></text>
					</div>
					<div class="categories">
						<select class="categories_select">
							<option value="english">English</option>
							<option value="mathematics">Mathmatics</option>
							<option value="computer_science">Computer Science</option>
							<option value="physics">Physics</option>
							<option value="chemistry">Chemistry</option>
							<option value="biology">Biology</option>
						</select>
					</div>

					<div class="zipcode">
						<input type="text" class="zipcode_textbox" placeholder="Zip Code"/></text>
					</div>



					<div class="search">
						<input type="button" class="search_button" value="Search">
					</div>
				</span>
			</div>-->
			
			<div>
			<div  style="float:none;width:650px;margin-left:auto;margin-right:auto;margin-top:18px;">	
						<form class="searchform">
							<select class="search_category" value="Category">
								<option>Category</option>
								<option>English</option>
								<option>Mathematics</option>
								<option>Science</option>
								<option>Computer</option>
								<option>Language</option>
								<option>Music</option>

							</select>

							<input class="searchfield" style="width: 200px;"type="text" placeholder="Keywords: Javascript, Afterschool..." onfocus="if (this.value == 'Keywords: Javascript, Afterschool...') {this.value = '';}" onblur="if (this.value == '') {this.value = '';}">
							<input class="searchfield" style="width: 100px;" type="text" placeholder="Near: zipcode" onfocus="if (this.value == 'Search...') {this.value = '';}" onblur="if (this.value == 'zipcode') {this.value = '';}">
							<input class="searchbutton" type="button" value="Go" onClick="parent.location='result.html'">
						</form>
					</div>
		</div></div>
	</body>
</html>
