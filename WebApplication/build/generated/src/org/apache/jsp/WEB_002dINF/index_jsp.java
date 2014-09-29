package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\r\n");
      out.write("\t\t<title>GoodLuck Learning</title>\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tbackground: url('images2.jpg') no-repeat center center fixed; \r\n");
      out.write("\t\t\t  -webkit-background-size: cover;\r\n");
      out.write("\t\t\t  -moz-background-size: cover;\r\n");
      out.write("\t\t\t  -o-background-size: cover;\r\n");
      out.write("\t\t\t  background-size: cover;\r\n");
      out.write("\t\t\t  right:0;\r\n");
      out.write("\t\t\t  overflow: hidden;\r\n");
      out.write("\t\t\tleft: 0;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t.mainbar\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\theight:70px;\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\tright:0;\r\n");
      out.write("\t\t\tleft: 0;\r\n");
      out.write("\t\t\tbackground: rgba(46,46,46,0.9);\r\n");
      out.write("    \t\tbox-shadow: 0 0 5px rgba(46,46,46,0.9);\r\n");
      out.write("\t\t\tmargin-top:50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.mainbar_cointainer\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth: 800px;\r\n");
      out.write("\t\t\tmargin-left:auto;\r\n");
      out.write("\t\t\tmargin-right:auto;\r\n");
      out.write("\r\n");
      out.write("\t\t\tpadding-top:13px;\r\n");
      out.write("\t\t\tdisplay: block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.class\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth:auto;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.class_textbox\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth:300px;\r\n");
      out.write("\t\t\tfont-size: 20pt;\r\n");
      out.write("\r\n");
      out.write("\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.categories\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth:auto;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.categories_select\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfont-size: 20pt;\r\n");
      out.write("\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.zipcode\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth:auto;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.zipcode_textbox\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth:120px;\r\n");
      out.write("\t\t\tfont-size: 20pt;\r\n");
      out.write("\r\n");
      out.write("\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.search\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth:auto;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.search_button\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfont-size: 20pt;\r\n");
      out.write("\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.nav{\r\n");
      out.write("\t\t\twidth: 990px;\r\n");
      out.write("  \t\t\tmargin: 0px auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.nav h1{\r\n");
      out.write("\t\t\tmargin-top: 15px;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    \r\n");
      out.write("    text-transform: none;\r\n");
      out.write("    font-size: 30px;\r\n");
      out.write("    font-family: 'Open Sens', sans-serif;\r\n");
      out.write("    color:#fff;\r\n");
      out.write("    text-shadow: 0px 2px 2px rgba(121,121, 121, 0.4); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login{\r\n");
      out.write("\t\t\tfloat:right;\r\n");
      out.write("\t\t\tmargin-top: 25px;\r\n");
      out.write("\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t    font-family: 'Open Sens', sans-serif;\r\n");
      out.write("\t\t    color:#fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login a{\r\n");
      out.write("\t\t\ttext-transform: uppercase;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tcolor:#fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login a:hover{\r\n");
      out.write("\t\t\ttext-transform: uppercase;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ta{\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\th1{\r\n");
      out.write("\t\t\ttext-transform: uppercase;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tcolor:#fff;\r\n");
      out.write("\t\t\tfont-size: 34px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t    font-family: 'Raleway', sans-serif;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\th3{\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tcolor:#f7f7f7;\r\n");
      out.write("\t\t\tfont-weight: none;\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t    font-family: 'Raleway', sans-serif;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<div style=\"float:left;width: 200px;\">\r\n");
      out.write("\t\t\t<a href=\"\"><h1>GoodLuckLearning</h1><a></div>\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\">Login   </a>|  <a href=\"\">Sign Up </a>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clr\" style=\"height:150px;\"></div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>Better way to find Educational Programs</h1>\r\n");
      out.write("\t\t\t\t<h3>from Personal Tutors, Local Educational Centers to online educations</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"mainbar\">\r\n");
      out.write("\t\t\t<!--<div class=\"mainbar_cointainer\">\r\n");
      out.write("\t\t\t\t<span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"class\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"class_textbox\" placeholder=\"Class Name\"/></text>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"categories\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"categories_select\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"english\">English</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"mathematics\">Mathmatics</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"computer_science\">Computer Science</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"physics\">Physics</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"chemistry\">Chemistry</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"biology\">Biology</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"zipcode\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"zipcode_textbox\" placeholder=\"Zip Code\"/></text>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" class=\"search_button\" value=\"Search\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</div>-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<div  style=\"float:none;width:650px;margin-left:auto;margin-right:auto;margin-top:18px;\">\t\r\n");
      out.write("\t\t\t\t\t\t<form class=\"searchform\">\r\n");
      out.write("\t\t\t\t\t\t\t<select class=\"search_category\" value=\"Category\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Category</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>English</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Mathematics</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Science</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Computer</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Language</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Music</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"searchfield\" style=\"width: 200px;\"type=\"text\" placeholder=\"Keywords: Javascript, Afterschool...\" onfocus=\"if (this.value == 'Keywords: Javascript, Afterschool...') {this.value = '';}\" onblur=\"if (this.value == '') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"searchfield\" style=\"width: 100px;\" type=\"text\" placeholder=\"Near: zipcode\" onfocus=\"if (this.value == 'Search...') {this.value = '';}\" onblur=\"if (this.value == 'zipcode') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"searchbutton\" type=\"button\" value=\"Go\" onClick=\"parent.location='result.html'\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t</div></div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
