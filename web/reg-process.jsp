<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
        Statement st = conn.createStatement();
        int i = st.executeUpdate("insert into users(username,email,password)values('" + username + "','" + email + "','" + password + "')");
        response.sendRedirect("index.jsp");

    } catch (Exception e) {
        System.out.print(e);
        e.printStackTrace();
    }

%>