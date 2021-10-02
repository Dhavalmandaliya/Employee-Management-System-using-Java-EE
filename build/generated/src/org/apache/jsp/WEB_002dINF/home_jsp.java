package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\n");
      out.write("<title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");

Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;
String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost/employee";
String user = "root";
String password = "";
String sql = "select usertype from empdetails";
try {
Class.forName(driverName);
con = DriverManager.getConnection(url, user, password);
ps = con.prepareStatement(sql);
rs = ps.executeQuery(); 

      out.write("\n");
      out.write("<form method=\"post\" action=\"login.jsp\">\n");
      out.write("<center><h2 style=\"color:green\">JSP Login Example</h2></center>\n");
      out.write("<table border=\"1\" align=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td>Enter Your Name :</td>\n");
      out.write("<td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enter Your Password :</td>\n");
      out.write("<td><input type=\"password\" name=\"password\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Select UserType</td>\n");
      out.write("<td><select name=\"usertype\">\n");
      out.write("<option value=\"select\">select</option>\n");

while(rs.next())
{
String usertype = rs.getString("usertype");

      out.write("\n");
      out.write("<option value=");
      out.print(usertype);
      out.write('>');
      out.print(usertype);
      out.write("</option>\n");
 
}
}
catch(SQLException sqe)
{
out.println("home"+sqe);
}

      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("\n");
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
