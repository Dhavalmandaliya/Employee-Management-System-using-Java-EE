<%@ page language="java" %>
<%@page import="java.sql.*,java.util.*"%>
<%

    String username = request.getParameter("username");
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select * from users where username='" + username + "' and password='" + password + "'");
    try {
        rs.next();
        if (rs.getString("password").equals(password) && rs.getString("username").equals(username)) {
            response.sendRedirect("adminhome.jsp");
        } else {
            out.println("Invalid password or username.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>







