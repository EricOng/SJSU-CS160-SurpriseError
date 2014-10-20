package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <title>Login or Register</title>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" />\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/leanStyle.css\" />\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"login\"> \r\n");
      out.write("            <a id=\"modal_trigger\" href=\"#modal\">\r\n");
      out.write("                Login  |  Sign Up  \r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div id=\"modal\" class=\"popupContainer\" style=\"display:none;\">\r\n");
      out.write("                <header class=\"popupHeader\">\r\n");
      out.write("                    <span class=\"header_title\">Login</span>\r\n");
      out.write("                    <span class=\"modal_close\"><i class=\"fa fa-times\"></i></span>\r\n");
      out.write("                </header> \r\n");
      out.write("\r\n");
      out.write("                <section class=\"popupBody\"> \r\n");
      out.write("                    <!-- Social Login -->\r\n");
      out.write("                    <div class=\"social_login\">\r\n");
      out.write("                        <div class=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"centeredText\">\r\n");
      out.write("                            <span>Or use your Email address</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"action_btns\">\r\n");
      out.write("                            <div class=\"one_half\"><a href=\"#\" id=\"login_form\" class=\"btn\">Login</a></div>\r\n");
      out.write("                            <div class=\"one_half last\"><a href=\"#\" id=\"register_form\" class=\"btn\">Sign up</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Username & Password Login form -->\r\n");
      out.write("                    <div class=\"user_login\">\r\n");
      out.write("                        <form action=\"login\">\r\n");
      out.write("                            <label>Email / Username</label>\r\n");
      out.write("                            <input type=\"text\" name=\"User\"/>\r\n");
      out.write("                            <br />\r\n");
      out.write("\r\n");
      out.write("                            <label>Password</label>\r\n");
      out.write("                            <input type=\"password\" name=\"Pass\"/>\r\n");
      out.write("                            <br />\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"checkbox\">\r\n");
      out.write("                                <input id=\"remember\" type=\"checkbox\" />\r\n");
      out.write("                                <label for=\"remember\">Remember me on this computer</label>\r\n");
      out.write("                            </div>\r\n");
      out.write(" \r\n");
      out.write("                            <div class=\"action_btns\">\r\n");
      out.write("                                <div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\r\n");
      out.write("                                <div class=\"one_half last\">\r\n");
      out.write("                                    <button id=\"button_red\" type=\"submit\" class=\"button_red\">Login</button>\r\n");
      out.write("                                </div> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"#\" class=\"forgot_password\">Forgot password?</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Register Form -->\r\n");
      out.write("                    <div class=\"user_register\">\r\n");
      out.write("                        <form>\r\n");
      out.write("                            <label>Full Name</label>\r\n");
      out.write("                            <input type=\"text\" />\r\n");
      out.write("                            <br />\r\n");
      out.write("\r\n");
      out.write("                            <label>Email Address</label>\r\n");
      out.write("                            <input type=\"email\" />\r\n");
      out.write("                            <br />\r\n");
      out.write("\r\n");
      out.write("                            <label>Password</label>\r\n");
      out.write("                            <input type=\"password\" />\r\n");
      out.write("                            <br />\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"checkbox\">\r\n");
      out.write("                                <input id=\"send_updates\" type=\"checkbox\" />\r\n");
      out.write("                                <label for=\"send_updates\">Send me occasional email updates</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"action_btns\">\r\n");
      out.write("                                <div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\r\n");
      out.write("                                <div class=\"one_half last\"><a href=\"#\" class=\"btn btn_red\">Register</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(\"#modal_trigger\").leanModal({top: 200, overlay: 0.6, closeButton: \".modal_close\"});\r\n");
      out.write("\r\n");
      out.write("            $(function() {\r\n");
      out.write("                // Calling Login Form\r\n");
      out.write("                $(\"#login_form\").click(function() {\r\n");
      out.write("                    $(\".social_login\").hide();\r\n");
      out.write("                    $(\".user_login\").show();\r\n");
      out.write("                    return false;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // Calling Register Form\r\n");
      out.write("                $(\"#register_form\").click(function() {\r\n");
      out.write("                    $(\".social_login\").hide();\r\n");
      out.write("                    $(\".user_register\").show();\r\n");
      out.write("                    $(\".header_title\").text('Register');\r\n");
      out.write("                    return false;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // Going back to Social Forms\r\n");
      out.write("                $(\".back_btn\").click(function() {\r\n");
      out.write("                    $(\".user_login\").hide();\r\n");
      out.write("                    $(\".user_register\").hide();\r\n");
      out.write("                    $(\".social_login\").show();\r\n");
      out.write("                    $(\".header_title\").text('Login');\r\n");
      out.write("                    return false;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
