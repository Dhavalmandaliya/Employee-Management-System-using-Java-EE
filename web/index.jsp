<%@ page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">   
        <!--<link rel="stylesheet" type="text/css" href="style.css">  -->
        <style>
            .login-box{
                height: 380px;
            }
            body{
                background-image: url('12.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;  
                background-size: cover;

                font-family: 'Roboto', sans-serif;
            }
            .login-box{
                width: 320px;
                height: 400px;
                background: rgba(0, 0, 0, 0.4);
                color: #fff;
                top: 50%;
                left: 50%;
                position: absolute;
                transform: translate(-50%,-50%);
                box-sizing: border-box; 
                padding: 85px 30px;
            }
            .avatar{
                width: 100px;
                height: 100px;
                position: absolute;
                top: -45px;
                left: calc(50% - 50px);
            }
            h1{
                margin: 0;
                padding: 0 0 20px;
                text-align: center;
                font-size: 22px;
                color:white;
                font-weight: bold;
            }
            .login-box p{
                margin: 0;
                padding: 0;
                font-weight: bold;
            }
            .login-box input{
                width: 100%;
                margin-bottom: 20px;
            }
            .login-box input[type="text"], input[type="password"],input[type="number"],input[type="email"]
            {
                border: none;
                border-bottom: 1px solid black;
                background: transparent;
                outline: none;
                height: 40px;
                color: black;
                font-size: 16px;
            }
            .login-box input[type="submit"]
            {
                border: none;
                outline: none;
                height: 40px;
                background: #1c8adb;
                color: black;
                font-size: 18px;
                border-radius: 20px;
            }
            .login-box input[type="submit"]:hover
            {
                cursor: pointer;
                background:#5aadea;
                color: #000;
            }

            .login-box a{
                text-decoration: none;
                font-size: 14px;
                color: black;
            }
            .login-box a:hover
            {
                color: #39dc79;
            }
            h2
            {
                color:black;
            }
        
        </style>
    </head>
    <body>

        <form method="post" action="login.jsp">
            <div class="login-box">
                <img src="3.png" class="avatar">
                <h1>Login Account</h1>
                <p>Username</p>
                <input type="text"  style="color: #C0C0C0; font-weight: bold;" name="username" placeholder="Enter Username" required="required">
                <p>Password</p>
                <input type="password"  style="color: #C0C0C0; font-weight: bold;" name="password" placeholder="Enter Password" required="required">
                <input type="submit" name="submit" value="Login">
                <b>Don't have an account? <a href="register.jsp">Sign Up</a></b>

            </div>   
        </form>
    </body>
</html>