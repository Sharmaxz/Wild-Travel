<%--
  Created by IntelliJ IDEA.
  User: Shadow
  Date: 2/18/2019
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
    <head>
        <title>Wild Travel - Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css"> <!-- doesnt working -->
    </head>
    <style>

        /* formLogin.jsp */
        ::selection {
            background: rebeccapurple; /* WebKit/Blink Browsers */
        }
        ::-moz-selection {
            background: rebeccapurple; /* Gecko Browsers */
        }
        .a{
            text-align: center;
            margin: 0 auto;
            width: 400px;

        }

        .container-login {
            top: 50px;
            width: 370px;
            padding: 1em;
            margin: 0 auto;
            text-align: center;
            position: fixed;
            border: 1px solid #CCC;
            border-radius: 1em;
            background-color: rgba(25, 0, 25, 0.4);
            z-index: 1;



        }

        input[type=text]:focus, input[type=password]:focus, input[type=email]:focus, input:invalid {
            color: white;
            outline: none;
            box-shadow: 0 0 0 2px rebeccapurple;
            background-color: rgba(0, 0, 0, 0);
        }

        input:invalid, .form-control:invalid  {
            color: rgba(255, 0, 0, 1);
            box-shadow: 0 0 0 2px red;
        }


        label {
            color: rgba(255, 255, 255, 255);
        }

        .form-control {
            background-color: rgba(0, 0, 0, 0);
        }

        .btn-primary {
            background-color: rgba(0, 0, 0, 0) !important;
            border-color: white !important;
        }

        .btn-primary:focus {
            background-color: rgba(50, 0, 50, 0.5) !important;
            border-color: rgba(50, 0, 50, 0.5) !important;
            box-shadow: 0 0 0 2px rebeccapurple;
        }

        .btn-primary:hover {
            background-color: rgba(50, 0, 50, 0.5) !important;
            border-color: rebeccapurple !important;
        }
        .btn-primary:not(:disabled):not(.disabled):active:focus,
        .btn-primary:not(:disabled):not(.disabled).active:focus,
        .show>.btn-primary.dropdown-toggle:focus {
            box-shadow: 0 0 0 2px rebeccapurple;
        }

        .card-footer {
            background-color: rgba(0, 0, 0, 0) !important;
            border-color: rgba(255, 255, 255, 0.5) !important;
            padding: 30px;
        }

        a, a:hover {
            color: rgba(200, 0, 200, 1);
        }


        /* carousel.jsp */

        #carousel-img {
            height: 100vh;
            width: 100%;
        }
    </style>

    <body>
        <%@ include file="carousel.jsp"%>
        <%@ include file="formLogin.jsp"%>
    </body>
</html>
