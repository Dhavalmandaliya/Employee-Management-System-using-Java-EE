<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String id = request.getParameter("id");
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost/";
    String database = "employee";
    String userid = "root";
    String password = "";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<%
    try {
        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = connection.createStatement();
        String sql = "select * from empdetails where id=" + id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
%>
<!DOCTYPE html>
<html>
    <style>
        .mydiv4{
            width : 96em;
            height : 45.9em;

            border: 2px solid #add8e6;
            background-color: #0E4D92;
            color: #B0DFE5;
            position:absolute;
            background: rgb(226,226,226);
            background: linear-gradient(360deg, rgba(226,226,226,1) 0%, rgba(209,214,219,1) 8%, rgba(201,208,216,1) 12%, rgba(165,183,202,1) 26%, rgba(14,77,144,1) 100%);
        }
        .mydiv1{
            width: 31.4em;
            height: 38.5em;
            top: -4em;
            border: 5px solid #add8e6;
            background-color: #0E4D90;
            color: #B0DFE5;


        }
        .manage{
            margin-left:auto;
            font-size: 18px;
            font-family: Georgia, 'Times New Roman', Times, serif;
        }
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
    <title>Employee Update</title>
    <body>
        <div class="mydiv4"><br><br>
            <center>
                <div class="mydiv1">
                    <br>
                    <h1 style="font-family: Georgia, 'Times New Roman', Times, serif; margin-top: 2px;"><marquee behavior="alternate" scrollamount="10">  Update Employee </marquee></h1>
                    <form method="post" action="update-process.jsp">
                        <input type="hidden" name="id" value="<%=resultSet.getString("id")%>">

                        <a1 class="manage" style="margin-left: 0.5em;">Employee ID 
                            <input style="margin-left: 4em;" type="text" name="id" value="<%=resultSet.getString("id")%>">
                            <br><br>

                            <a1 class="manage" style="margin-left: 10px;">Employee Department
                                <input  type="text" name="department" value="<%=resultSet.getString("department")%>"></a1>
                            <br><br>

                            <a1 class="manage" style="margin-left: 0.8em;">Employee Name
                                <input style="margin-left: 2.8em;" type="text" name="ename" value="<%=resultSet.getString("ename")%>"></a1>
                            <br><br>

                            <a1 class="manage" style="margin-left: 0.8em;">Email Id:
                                <input style="margin-left: 5.8em;" type="email" name="mail" value="<%=resultSet.getString("mail")%>"></a1>
                            <br><br>

                            <a1 class="manage" style="margin-left: 0.8em;">Contact No:
                                <input style="margin-left: 4.8em;" type="text" name="c_no" value="<%=resultSet.getString("c_no")%>"></a1>
                            <br><br>

                            <a1 class="manage" style="margin-left: 0.8em;">DOB:
                                <input style="margin-left: 7.8em;" type="text" name="dob" value="<%=resultSet.getString("dob")%>"></a1>
                            <br><br>

                            <a1 class="manage"style="margin-left: 0.8em;">Gender:
                                <input style="margin-left: 6.4em;" type="text" name="gender" value="<%=resultSet.getString("gender")%>"></a1>
                            <br><br>

                            <a1 class="manage" style="margin-left: 0.8em;">Address:
                                <input style="margin-left: 6em;" type="text" name="address" value="<%=resultSet.getString("address")%>"></a1>
                            <br>
                            <br>
                            <a href="adminhome.jsp" class="btn btn-primary">Back</a>

                            <input type="submit" class="btn btn-primary" value="submit">
                            </form>
                            </div>
                            <%
                                    }
                                    connection.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
                            </center>
                            </div>
                            </body>
                            </html>