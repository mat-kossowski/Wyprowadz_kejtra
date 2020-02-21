<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<head>
    <meta charset="utf-8"/>
    <title>Wyprowadz Kejtra</title>
    <meta name="description" content="Pies, opieka, spacer"/>
    <meta neme="keywords" content="Pies, opieka, spacer"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link rel="stylesheet" href="input_style.css" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=Knewave&display=swap&subset=latin-ext" rel="stylesheet">
    <style>
        body
        {
            background-color: white;
            margin: 0 !important;

        }
        #container {
            background-image: url("giftly.png");
            width: 100%;
            height: 550px;


        }
        .nav{
            width: 100%;
            padding: 10px 0;
            text-align: center;
            border: 1px solid rgb(99, 66, 24);
            background-color: #FC9105;
        }



        ol{
            width: 1200px;
            padding: 0;
            margin: 0;
            list-style-type: none;
            font-size: 18px;
            height: 35px;
            line-height: 200%;
            display: inline-block;
            text-align: left;

        }
        ol a{
            color: #ffffff;
            text-decoration: none;
            display: block;
        }
        ol > li{
            float: left;
            width: 200px;
            height: 40px;
        }

        ol > li:first-child{

            font-family: 'Knewave' ;
        }
        ol > li:last-child{
            text-align: right;
        }
        .footer{
            text-align: center;
            background-color: #222222;
            padding: 30px;
            color: #ffffff;
        }
        .inputs{
            background-color: #ffffff;
            width: 300px;
            padding: 50px;
            margin-left: auto;
            margin-right: auto;
            margin-top: 100px;
            box-shadow: 3px 3px 30px 5px rgba(204,204,204,1);


        }
        input[type=text],
        input[type=password]
        {
            width: 300px;
            background-color: #efefef;
            color:#666;
            border: 2px solid #ddd;
            border-radius: 5px;
            font-size: 20px;
            padding: 10px;
            box-sizing: border-box;
            outline: none;
            margin-top: 10px;
        }
        input[type=text]:focus,
        input[type=password]:focus{
            box-shadow: 0px 0px 10px 2px rgba(204,204,204,1);
            border: 2px solid #a5cda5;
            background-color: #e9f3e9 ;
            color: #428c42;
        }

        input[type=submit]{
            width: 300px;
            background-color: #36b03c;
            font-size: 20px;
            color: white;
            padding: 15px 10px;
            margin-top: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            letter-spacing: 2px;
            outline: none;
            margin-top: 20px;
        }
        input[type=submit]:hover{
            background-color: #37b93d;
        }
        input[type=submit]:focus{
            box-shadow: 0px 0px 15px 5px rgba(204,204,204,1);
        }

    </style>
</head>
<body>
<div id="container">
    <div class="nav">
        <ol>
            <li><a href="/home">Wyprowadz Kejtra</a></li>
            <li><a href="/home">Strona glowna</a></li>
            <li><a href="/onas">O Nas</a></li>
            <li><a href="/db_guardian">Opiekunowie</a></li>
            <li><a href="/contact">Kontakt</a></li>
            <li><a href="/login">Zaloguj</a></li>
        </ol>
    </div>
    <div class="inputs">

        <form name='loginForm'
              action="<c:url value='/login' />" method='POST'>
            <input type='text' name='username' placeholder="login"/>
            <input type='password' name='password' placeholder="haslo" />
            <input type="submit" value="Zaloguj sie" />
        </form>
    </div>
</div>
<div class="footer">
    Wyprowadz Kejtra &copy; 2020
</div>

</body>