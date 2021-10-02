package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    if (request.getParameter("add") != null) {
        String num = request.getParameter("department");
        String name = request.getParameter("ename");
        String mail = request.getParameter("mail");
        String contact = request.getParameter("c_no");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
        pst = con.prepareStatement("insert into empdetails (department,ename,mail,c_no,dob,gender,address)values(?,?,?,?,?,?,?)");
        pst.setString(1, num);
        pst.setString(2, name);
        pst.setString(3, mail);
        pst.setString(4, contact);
        pst.setString(5, dob);
        pst.setString(6, gender);
        pst.setString(7, address);
        pst.executeUpdate();



      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"Record Inserted\");\n");
      out.write("</script>\n");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .mydiv{\n");
      out.write("                margin-top: 10px;\n");
      out.write("                border: 5px solid #add8e6;\n");
      out.write("                background-color: #0E4D92;\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: Georgia, 'Times New Roman', Times, serif; \n");
      out.write("                color: #B0DFE5;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mydiv1{\n");
      out.write("                width: 31.4em;\n");
      out.write("                height: 36em;\n");
      out.write("                border: 5px solid #add8e6;\n");
      out.write("                background-color: #0E4D92;\n");
      out.write("                color: #B0DFE5;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mydiv2{\n");
      out.write("                width: 62em;\n");
      out.write("                height: 36em;\n");
      out.write("                border: 5px solid #add8e6;\n");
      out.write("                background-color: #0E4D92;\n");
      out.write("                color: #B0DFE5;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 100px;        \n");
      out.write("                left: 515px; \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mydiv3{\n");
      out.write("                width: 60.5em;\n");
      out.write("                height: 33em;\n");
      out.write("                border: 5px solid #add8e6;\n");
      out.write("                background-color:#0E4D92;\n");
      out.write("                color: #B0DFE5;\n");
      out.write("                position:absolute;\n");
      out.write("                top: 129px;        \n");
      out.write("                left: 525.5px;    \n");
      out.write("                overflow: auto;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mydiv4{\n");
      out.write("                width : 94.8em;\n");
      out.write("                height : 46em;\n");
      out.write("                border: 2px solid #add8e6;\n");
      out.write("                background-color: #0E4D92;\n");
      out.write("                color: #B0DFE5;\n");
      out.write("                position:absolute;\n");
      out.write("            }\n");
      out.write("            .manage{\n");
      out.write("                margin-left: 30px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-family: Georgia, 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            .buttons{\n");
      out.write("                width: 25em;\n");
      out.write("                border: 5px solid #add8e6;\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                background-color: #1b73d1; /* Green */\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 12px 27px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 10px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                transition-duration: 0.4s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-family: Georgia, 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            .button1:hover {\n");
      out.write("                background-color: white; \n");
      out.write("                color: black; \n");
      out.write("                border: 1px solid #4CAF50;\n");
      out.write("            }\n");
      out.write("            .button2{\n");
      out.write("                background-color: #1b73d1; /* Green */\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 8px 25px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 10px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                transition-duration: 0.4s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-family: Georgia, 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            .button2:hover {\n");
      out.write("                background-color: white; \n");
      out.write("                color: black; \n");
      out.write("                border: 1px solid #4CAF50;\n");
      out.write("            }\n");
      out.write("            .input {\n");
      out.write("\n");
      out.write("                transition: 180ms box-shadow ease-in-out;\n");
      out.write("            }\n");
      out.write("            .input:focus {\n");
      out.write("                outline: 3px solid transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <title>Employee System</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body  >\n");
      out.write("\n");
      out.write("        <form name=\"employee\" method=\"POST\" action=\"#\">\n");
      out.write("            \n");
      out.write("            <div class=\"mydiv4\">\n");
      out.write("\n");
      out.write("                <div class=\"mydiv\" style=\"top:15em;\">\n");
      out.write("\n");
      out.write("                    <h2><b>\n");
      out.write("                            <marquee behavior=\"alternate\" scrollamount=\"10\">Employee Management System</marquee>\n");
      out.write("\n");
      out.write("                    </h2></b>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div><br>\n");
      out.write("                <div class=\"mydiv1\">\n");
      out.write("                    <h2 style=\"font-family: Georgia, 'Times New Roman', Times, serif; margin-top: 2px;\"><marquee behavior=\"alternate\" scrollamount=\"10\">  Manage Employee </marquee>\n");
      out.write("                    </h2><br>\n");
      out.write("                    <a1 class=\"manage\">Employee Department<input  style=\"margin-left: 10px; \" type=\"text\" name=\"department\" required ></a1><br><br>\n");
      out.write("                    <a1 class=\"manage\">Employee Name<input style=\"margin-left: 57px;\" type=\"text\" name=\"ename\" required></a1><br><br>\n");
      out.write("                    <a1 class=\"manage\">Employee Email<input style=\"margin-left: 57px;\" type=\"text\" name=\"mail\" required></a1><br><br>\n");
      out.write("                    <a1 class=\"manage\">Contact Number<input style=\"margin-left: 55px;\" type=\"text\" name=\"c_no\" required></a1><br><br>\n");
      out.write("                    <a1 class=\"manage\">Date of Birth<input style=\"margin-left: 85px;\" type=\"text\" name=\"dob\" required></a1><br><br>\n");
      out.write("                    <a1 class=\"manage\">Gender<input style=\"margin-left: 125px;\" type=\"text\" name=\"gender\" required></a1><br><br>\n");
      out.write("                    <a1 class=\"manage\">Address<input style=\"margin-left: 120px;\" type=\"text\" name=\"address\" required></a1><br><br><br>\n");
      out.write("                    <div class=\"buttons\">\n");
      out.write("                        <main>\n");
      out.write("                            <center>\n");
      out.write("                                <button class=\"button button1\"  type=\"submit\" name=\"add\"  >ADD</button>\n");
      out.write("                                <button class=\"button button1 \" type=\"reset\" name=\"clr\">CLEAR</button>  \n");
      out.write("\n");
      out.write("                            </center>\n");
      out.write("                        </main>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("        </form>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"mydiv2\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Show ALL Employee Details  -->\n");
      out.write("            <div class=\"mydiv3\">\n");
      out.write("                <table class=\"table table-bordered table-dark table-wrapper\"  >\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Department</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Contact</th>\n");
      out.write("                            <th>DOB</th>\n");
      out.write("                            <th>Gender</th>\n");
      out.write("                            <th>Address</th>\n");
      out.write("                            <th>Update</th>\n");
      out.write("                            <th>Delete</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        ");

                            Connection con;
                            PreparedStatement pst;
                            ResultSet rs;

                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
                            String query = "select * from empdetails";
                            Statement st = con.createStatement();
                            rs = st.executeQuery(query);
                            while (rs.next()) {
                                String id = rs.getString("id");
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(rs.getString("department"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("ename"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("mail"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("c_no"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("dob"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                            <td><a class=\"btn btn-primary\" href=\"update.jsp?id=");
      out.print(id);
      out.write(" \">Update</a></td>\n");
      out.write("                            <td><a class=\"btn btn-primary\" href=\"delete.jsp?id=");
      out.print(id);
      out.write("\">Delete</a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");

                        }

                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"footer footer-transparent\">\n");
      out.write("                <div class=\"text-center p-3\" style=\" color: white;\">\n");
      out.write("                    © 2021-2022 \n");
      out.write("                    <a style=\"float:right;\" class=\"btn btn-primary\" href=\"logout.jsp\">LogOut</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </form>\n");
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
