<%@page  import="java.sql.*"%>
<%
        String id = request.getParameter("id");
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
        pst = con.prepareStatement("delete from empdetails where id=?");
        pst.setString(1,id);
        pst.executeUpdate();
        response.sendRedirect("adminhome.jsp");
%>
<script>
    alert("Record Deleted");
</script>
    