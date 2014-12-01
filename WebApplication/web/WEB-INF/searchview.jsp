<%@ page import="java.util.* " %>
<%@ page import="Bean.ClassBean" %> 
<%@page contentType="text/html" pageEncoding="UTF-8" session='true'%>
<!DOCTYPE HTML>
 
<html>
    <head>
        <title>GoodLuck Learning</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
        <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDbkX1elv7Gb7fmlG2C5u9ir012Sv3kkZA">
    </script>
    <script>
function initialize()
{
var mapProp = {
  center:new google.maps.LatLng(51.508742,-0.120850),
  zoom:5,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };
var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>
    </head>
    <body>
        <jsp:include page="searchNavi.jsp"></jsp:include>
        <div class="clr" style="height:20px;"></div>
        <!-- Here is the search result  -->
       
        <div class="map-wrapper"> 
            <div id="googleMap" style="width:100%;height:100%;"></div>
            
         </div>
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
            <div class="clr" style="height:10px;"></div>
            <div >
                <ul class="result_in_grid">
        <%     
            System.out.println("************* "+ arraySize);
            Iterator itr = al.iterator();
            while (itr.hasNext()) {
                if ((count % 2) == 0) {
                    color = "#eeffee";
                }
                count++;
                //ArrayList cList = (ArrayList) itr.next();
                ClassBean myclass = (ClassBean) itr.next();
         %>
            <li>
                <a class="list_block" href="BrowseClassServlet?method=doPost&param1=<%=myclass.getClassId()%>">
                    <div>
                        <div class="course-title">
                        <h1><%=myclass.getClassName()%></h1>
                        </div>
                        <br>

                        <ul class="inline-list">
                            <li><i class="fa fa-thumbs-o-up"></i>&nbsp;&nbsp;
                                <!--<span class="rating star"></span>
                                 <span class="rating star"></span>
                                 <span class="rating star"></span><br>-->
                                 <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
                            </li>
                            <li><i class="fa fa-usd"></i> &nbsp;&nbsp;&nbsp;<%=myclass.getCost()%></li>
                            <li><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>
                            <li><i class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>
                        </ul>
                    </div>
                </a>
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