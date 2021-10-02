package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String userdbName;
            String userdbPsw;
        
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/employee";
            String user = "root";
            String dbpsw = "";
            String sql = "select * from users where username=? and password=? ";
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if ((!(username.equals(null) || username.equals("")) && !(password.equals(null)|| password.equals(""))) ) {
                try {
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, dbpsw);
                    ps = con.prepareStatement(sql);
                    ps.setString(1, username);
                    ps.setString(2, password);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        userdbName = rs.getString("username");
                        userdbPsw = rs.getString("password");
                        if (username.equals(userdbName) && password.equals(userdbPsw) ) {
                            session.setAttribute("name", userdbName);
                            response.sendRedirect("adminhome.jsp");
                        }
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                    rs.close();
                    ps.close();
                } catch (SQLException sqe) {
                    out.println(sqe);
                }
            } else {
        
      out.write("\n");
      out.write("    <center><p style=\"color:red\">Error In Login</p></center>\n");
      out.write("        ");

                getServletContext().getRequestDispatcher("/home.jsp").include(request, response);
            }
        
      out.write("\n");
      out.write("</body>\n");
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
