<%@ page import="java.util.*" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
 
<html>
    <head>
<title>GoodLuck Learning</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
	<div class="clr"></div>
        <!-- Here is the search result  -->
       
        <div class="map-wrapper"> 
        </div>
        <div class="content-wrapper">
           
		 <%
                int count = 0;
                String color = "#F9EBB3";
                if (request.getAttribute("classes") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("classes");
                    int arraySize = al.size();
           %>
            <p class="search_result">1-9 of <%=arraySize%> results for category <a href=""><span class="keyword">Programming</span></a> near <a href=""><span class="keyword">Sunnyvale</span></a></p>
		<div class="clr"></div>
                <div >
                <ul class="result_in_grid">
           <%         System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
 
                        if ((count % 2) == 0) {
                            color = "#eeffee";
                        }
                        count++;
                        ArrayList cList = (ArrayList) itr.next();
            %>
                
		
				
					<li><a class="list_block" href="BrowseClassServlet">
						<div>
							<div class="course-title">
							<h1><%=cList.get(1)%></h1>
							</div>
							<br>

							<ul class="inline-list">
								<li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
									<!--<span class="rating star"></span>
									 <span class="rating star"></span>
									 <span class="rating star"></span><br>-->
									 <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
								</li>
								<li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;<%=cList.get(5)%></li>
								<li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>
								<li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
							</ul>
						</div></a>
					</li>
                                        <%
                    }
                }
                %>
          
					
					
			</ul>
		</div>	
	</div>
 
    </body>
</html>