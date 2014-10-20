package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LinkCss_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>GoodLuck Learning</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("    function toggle_visibility(id) {\r\n");
      out.write("       var e = document.getElementById(id);\r\n");
      out.write("       if(e.style.display == 'block')\r\n");
      out.write("          e.style.display = 'none';\r\n");
      out.write("       else(e.style.display == 'none')\r\n");
      out.write("          e.style.display = 'block';\r\n");
      out.write("    }\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div class=\"fixbar\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><h1>GoodLuckLearning</h1></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"search\" class=\"container-1\">\r\n");
      out.write("\t\t\t\t\t<div  class=\"search-container\">\t\r\n");
      out.write("\t\t\t\t\t\t<form class=\"searchform\">\r\n");
      out.write("\t\t\t\t\t\t\t<select class=\"search_category\" value=\"Category\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Category</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>3</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"searchfield\" style=\"width: 200px;\"type=\"text\" placeholder=\"Keywords: Javascript, Afterschool...\" onfocus=\"if (this.value == 'Keywords: Javascript, Afterschool...') {this.value = '';}\" onblur=\"if (this.value == '') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"searchfield\" style=\"width: 100px;\" type=\"text\" placeholder=\"Near: zipcode\" onfocus=\"if (this.value == 'Search...') {this.value = '';}\" onblur=\"if (this.value == 'zipcode') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"searchbutton\" type=\"button\" value=\"Go\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">Login  </a>| <a href=\"\">Sign Up </a>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clr\"></div>\r\n");
      out.write("\t<div class=\"content-wrapper\">\r\n");
      out.write("\t\t<p class=\"search_result\">1-4 of 4 results for category <a href=\"\"><span class=\"keyword\">Mathematics</span></a> near <a href=\"\"><span class=\"keyword\">Sunnyvale</span></a></p>\r\n");
      out.write("\t\t<div class=\"clr\" style=\"height:10px;\"></div>\r\n");
      out.write("\t\t<div class=\"filter\">\r\n");
      out.write("\t\t\t<p><a href=\"\" onclick=\"toggle_visibility('advanced-filter');\"><i class=\"fa fa-caret-down\"></i> Advanced Filter</a></p>\r\n");
      out.write("\t\t\t<div class=\"filter-div\" id=\"advanced-filter\">\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t<div class=\"clr\" style=\"height:30px;\"></div>\r\n");
      out.write("\t\t<div >\r\n");
      out.write("\t\t\t<ul class=\"result_in_grid\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a class=\"list_block\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-type-distance\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Distance-Learning</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Algebra G3-G4</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"provider-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/edu1.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"inline-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-thumbs-o-up\"></i>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--<span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span><br>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star-o\"></i><i class=\"fa fa-star-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-usd\"></i> &nbsp;&nbsp;&nbsp;740</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-calendar\"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"list_block\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-type-distance\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Distance-Learning</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Algebra G5</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"provider-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/edu1.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"inline-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-thumbs-o-up\"></i>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--<span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span><br>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star-o\"></i><i class=\"fa fa-star-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-usd\"></i> &nbsp;&nbsp;&nbsp;740</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-calendar\"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"list_block\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-type-physical\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>In-Person</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Algebra G3-G4</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"provider-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/edu1.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"inline-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-thumbs-o-up\"></i>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--<span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span><br>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star-o\"></i><i class=\"fa fa-star-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-usd\"></i> &nbsp;&nbsp;&nbsp;740</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-calendar\"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a class=\"list_block\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-type-physical\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>In-Person</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Algebra G3-G4</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"provider-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/edu1.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"inline-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-thumbs-o-up\"></i>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--<span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"rating star\"></span><br>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star-o\"></i><i class=\"fa fa-star-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-usd\"></i> &nbsp;&nbsp;&nbsp;740</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;&nbsp;10 Class Meetings</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-calendar\"></i>&nbsp;&nbsp;&nbsp; All Year Round</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
