<%-- 
    Document   : searchNavi
    Created on : Oct 20, 2014, 2:08:13 PM
    Author     : Eileen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
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
                                            <a href="">Login </a>| <a href="">Sign Up </a>
					</div>	
				</div>
				
				 		
		</div>
		</div>
	</div>
    </body>
</html>
