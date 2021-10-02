<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost/employee";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
    String id = request.getParameter("id");
    String num = request.getParameter("department");
    String name = request.getParameter("ename");
    String mail = request.getParameter("mail");
    String contact = request.getParameter("c_no");
    String dob = request.getParameter("dob");
    String gender = request.getParameter("gender");
    String address = request.getParameter("address");
    if (id != null) {
        Connection con = null;
        PreparedStatement ps = null;
        int personID = Integer.parseInt(id);
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, user, psw);
            String sql = "Update empdetails set id=?,department=?,ename=?,mail=?,c_no=?,dob=?,gender=?,address=? where id=" + id;
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, num);
            ps.setString(3, name);
            ps.setString(4, mail);
            ps.setString(5, contact);
            ps.setString(6, dob);
            ps.setString(7, gender);
            ps.setString(8, address);
            int i = ps.executeUpdate();
            if (i > 0) {
                out.print("Record Updated Successfully");
                response.sendRedirect("adminhome.jsp");
            } else {
                out.print("There is a problem in updating Record.");
            }
        } catch (SQLException sql) {
            request.setAttribute("error", sql);
            out.println(sql);
        }
    }
%>