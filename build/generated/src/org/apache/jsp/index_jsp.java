package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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
      response.setContentType("text/html");
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">   \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">  \r\n");
      out.write("        <style>\r\n");
      out.write("            .login-box{\r\n");
      out.write("                height: 380px;\r\n");
      out.write("            }</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("      \r\n");
      out.write("        <form method=\"post\" action=\"login.jsp\">\r\n");
      out.write("            <div class=\"login-box\">\r\n");
      out.write("                <img src=\"user.png\" class=\"avatar\">\r\n");
      out.write("                <h1>Login Account</h1>\r\n");
      out.write("                <p>Username</p>\r\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Enter Username\" required=\"required\">\r\n");
      out.write("                <p>Password</p>\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required=\"required\">\r\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Login\">\r\n");
      out.write("                Don't have an account? <a href=\"register.jsp\">Sign Up</a>\r\n");
      out.write("\r\n");
      out.write("            </div>   \r\n");
      out.write("        </form>\r\n");
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
