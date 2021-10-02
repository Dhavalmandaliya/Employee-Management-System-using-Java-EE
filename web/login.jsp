<%@ page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
    </head>
    <body>
        <%! String userdbName;
            String userdbPsw;
        %>
        <%
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
                            session.setAttribute("username", userdbName);
                            response.sendRedirect("adminhome.jsp");
                        }
                    } else {
                        response.sendRedirect("errorAdminLogin.html");
                    }
                    rs.close();
                    ps.close();
                } catch (SQLException sqe) {
                    out.println(sqe);
                }
            } else {
        %>
    <center><p style="color:red">Error In Login</p></center>
        <%
                getServletContext().getRequestDispatcher("/home.jsp").include(request, response);
            }
        %>
</body>
</html>