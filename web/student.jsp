<%@page  import= "p1.ConnectionProvider" %>
<%@page  import="java.sql.*"%>
<%
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
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/employee", "root","root");
        pst = con.prepareStatement("insert into empdetails (department,ename,mail,c_no,dob,gender,address)values(?,?,?,?,?,?,?)");
        pst.setString(1, num);
        pst.setString(2, name);
        pst.setString(3, mail);
        pst.setString(4, contact);
        pst.setString(5, dob);
        pst.setString(6, gender);
        pst.setString(7, address);
        pst.executeUpdate();
    }
%>