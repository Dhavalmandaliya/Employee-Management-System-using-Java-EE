<%@page import="java.sql.Connection"%>
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


%>
<script>
    alert("Record Inserted");
</script>
<%    }
%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .mydiv{
                margin-top: 10px;
                border: 5px solid #add8e6;
                background-color: #0E4D92;
                text-align: center;
                font-family: Georgia, 'Times New Roman', Times, serif; 
                color: #B0DFE5;

            }
            .mydiv1{
                width: 31.4em;
                height: 35.5em;
                border: 5px solid #add8e6;
                background-color: #0E4D92;
                color: #B0DFE5;


            }
            .mydiv2{
                width: 62em;
                height: 35.5em;
                border: 5px solid #add8e6;
                background-color: #0E4D92;
                color: #B0DFE5;
                position: absolute;
                top: 100px;        
                left: 515px; 

            }
            .mydiv3{
                width: 60.5em;
                height: 28em;
                border: 5px solid #add8e6;
                background-color:#0E4D92;
                color: #B0DFE5;
                position:absolute;
                top: 190px;        
                left: 525.5px;    
                overflow: auto;

            }
            .mydiv5{
                width:60.5em;
                height:4em;
                border: 5px solid #add8e6;
                background-color:#0E4D92;
                color: #B0DFE5;
                position:absolute;
                top: 115px;        
                left: 525.5px;    
                overflow: auto;
            }
            .mydiv4{
                width : 94.8em;
                height : 46em;
                border: 2px solid #add8e6;
                background-color: #0E4D92;
                color: #B0DFE5;
                position:absolute;
            }

            .manage{
                margin-left: 30px;
                font-size: 18px;
                font-family: Georgia, 'Times New Roman', Times, serif;
            }
            .buttons{
                width: 25em;
                border: 5px solid #add8e6;
                margin-left: 20px;
            }
            .button {
                background-color: #1b73d1; /* Green */
                border: none;
                color: white;
                padding: 12px 27px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 10px;
                margin: 4px 2px;
                transition-duration: 0.4s;
                cursor: pointer;
                font-family: Georgia, 'Times New Roman', Times, serif;
            }
            .button1:hover {
                background-color: white; 
                color: black; 
                border: 1px solid #4CAF50;
            }
            .button2{
                background-color: #1b73d1; /* Green */
                border: none;
                color: white;
                padding: 8px 25px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 10px;
                margin: 4px 2px;
                transition-duration: 0.4s;
                cursor: pointer;
                font-family: Georgia, 'Times New Roman', Times, serif;
            }
            .button2:hover {
                background-color: white; 
                color: black; 
                border: 1px solid #4CAF50;
            }
            .input {

                transition: 180ms box-shadow ease-in-out;
            }
            .input:focus {
                outline: 3px solid transparent;
            }



        </style>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
        <title>Employee System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body  >

        <form name="employee" method="POST" action="#">

            <div class="mydiv4">

                <div class="mydiv" style="top:15em;">

                    <h2><b>
                            <marquee behavior="alternate" scrollamount="10">Employee Management System</marquee>

                    </h2></b>


                </div><br>
                <div class="mydiv1">
                    <h2 style="font-family: Georgia, 'Times New Roman', Times, serif; margin-top: 2px;"><marquee behavior="alternate" scrollamount="10">  Manage Employee </marquee>
                    </h2><br>

                    <a1 class="manage">Employee Department<input  style="margin-left: 10px; " type="text" name="department" required ></a1><br><br>
                    <a1 class="manage">Employee Name<input style="margin-left: 57px;" type="text" name="ename" required></a1><br><br>
                    <a1 class="manage">Employee Email<input style="margin-left: 57px;" type="email" pattern=".+@gmail.com" name="mail" required></a1><br><br>
                    <a1 class="manage">Contact Number<input style="margin-left: 55px;" type="text" name="c_no" required></a1><br><br>
                    <a1 class="manage">Date of Birth<input style="margin-left: 85px; width: 200px" type="date" name="dob"  required></a1><br><br>
                    <label for="gender" class="manage">Gender</label>
                    <select name="gender" style="margin-left:120px; width: 200px;">
                        <option value="none" selected>Gender</option>
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                        <option value="other">other</option>
                    </select><br><br>
                    <a1 class="manage">Address<input style="margin-left: 120px;" type="text" name="address" required></a1><br><br>
                    <div class="buttons">
                        <main>
                            <center>
                                <button class="button button1"  type="submit" name="add"  >ADD</button>
                                <button class="button button1 " type="reset" name="clr">CLEAR</button>


                            </center>
                        </main>
                    </div>

                    <br>
                </div>
        </form>
        <form>
            <div class="mydiv2" >


                </select>

            </div>
            <div class="mydiv5">
                <!--<a1 class="manage" style="margin-top:2px;">Search by</a1>-->
                <label for="search" class="manage" style="margin-top:14px;">Search by:</label>
                <select name="search" id="search">
                    <option value=""></option>
                    <option value="dept">Department</option>
                </select>
                <input  style="margin-left: 10px; " type="text" name="depts" required >
                <button class="button button1"  type="submit" name="srch"  >SEARCH</button>
                <a href="adminhome.jsp"class="button button1">SHOW ALL</a>

            </div>

            <!-- Show ALL Employee Details  -->
            <div class="mydiv3">
                <table class="table table-bordered table-dark table-wrapper"  >
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Department</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Contact</th>
                            <th>DOB</th>
                            <th>Gender</th>
                            <th>Address</th>
                            <th>Update</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>

                        <%@page import ="java.sql.*"%>
                        <% Connection con;
                            PreparedStatement pst;
                            ResultSet rs;

                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
                            Statement st = con.createStatement();
                            String data = request.getParameter("depts");
                            String shall = request.getParameter("sall");
                            String query;
                            if (data != null) {
                                query = "select * from empdetails where department like '%" + data + "%' or ename like '%" + data + "%' or address like '%" + data + "%'";
                            } else {
                                query = "select * from empdetails";
                            }

                            rs = st.executeQuery(query);

                            while (rs.next()) {
                                String id = rs.getString("id");
                        %>
                        <tr>
                            <td><%=rs.getString("id")%></td>
                            <td><%=rs.getString("department")%></td>
                            <td><%=rs.getString("ename")%></td>
                            <td><%=rs.getString("mail")%></td>
                            <td><%=rs.getString("c_no")%></td>
                            <td><%=rs.getString("dob")%></td>
                            <td><%=rs.getString("gender")%></td>
                            <td><%=rs.getString("address")%></td>
                            <td><a class="btn btn-primary" href="update.jsp?id=<%=id%> ">Update</a></td>
                            <td><a class="btn btn-primary" href="delete.jsp?id=<%=id%>">Delete</a></td>

                        </tr>
                    </tbody>
                    <%
                        }

                    %>
                </table>
            </div>
            <footer class="footer footer-transparent">
                <div class="text-center p-3" style=" color: white;">
                    © 2021-2022 
                    <a style="float:right;" class="btn btn-primary" href="logout.jsp">LogOut</a>
                </div>

            </footer>
        </div>

    </form>

</body>
</html>