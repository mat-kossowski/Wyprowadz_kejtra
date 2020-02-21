<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="utf-8"/>
    <title>Wyprowadz Kejtra</title>
    <meta name="description" content="Pies, opieka, spacer" />
    <meta neme="keywords" content="Pies, opieka, spacer" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link rel="stylesheet"  href="style.css" type="text/css" />
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



        }
        .nav{
            width: 100%;
            padding: 10px 0;
            text-align: center;
            border: 1px solid rgb(99, 66, 24);
            background-color: #FC9105;
        }
        .header{
            width: 100%;
            padding: 40px 0;
        }
        .logo{
            width: 450px;
            font-size: 48px;
            margin-left: auto;
            margin-right: auto;
            font-family: 'Knewave' ;
            color: #FC9105;
            text-align: center;
        }
        .content{
            width: 1000px;
            margin-left: auto;
            margin-right: auto;
            text-align: justify;

        }
        .door_guardian{
            width: 50%;
            float: left;
            text-align: center;
            padding-bottom: 35px;
        }
        .door_owner{
            width: 50%;
            float: left;
            text-align: center;
            padding-bottom: 35px;
        }
        ol{
            width: 1000px;
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
        ol > li:last-child{
            text-align: right;
        }
        .footer{
            text-align: center;
            background-color: #222222;
            padding: 30px;
            color: #ffffff;
        }
    </style>
</head>
<body>
<div id="container">
    <div class="nav">
        <ol>
            <li><a href="/home">Strona glowna</a></li>
            <li><a href="/onas">O Nas</a></li>
            <li><a href="/db_guardian">Opiekunowie</a></li>
            <li><a href="/contact">Kontakt</a></li>
            <li><a href="/login">Zaloguj</a></li>
        </ol>


    </div>
    <div class ="header">
        <div class="logo">Wyprowadz Kejtra</div>
    </div>

    <div class="content">
        <div class="door_guardian">
            <a href="/guardian"><img src="drzwi.jpg" /></a>
        </div>
        <div class="door_owner">
            <a href="/owner"><img src="drzwi.jpg" /></a></div>
    </div>
    <div style="clear:both;"></div>
</div>
<div class="footer">
    Wyprowadz Kejtra &copy; 2020
</div>
</body>