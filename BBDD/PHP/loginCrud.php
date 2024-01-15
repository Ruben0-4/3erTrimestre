<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
</head>

<style>
    body {
        font-family: 'Roboto', sans-serif;
        margin: 0;
        height: 100vh;
        overflow: hidden;
        animation: backgroundAnimation 10s infinite linear;
    }

    @keyframes backgroundAnimation {
        0% {
            background: linear-gradient(45deg, #3498db, #2ecc71); /* Azul a verde */
        }
        25% {
            background: linear-gradient(45deg, #2ecc71, #1abc9c); /* Verde a turquesa */
        }
        50% {
            background: linear-gradient(45deg, #1abc9c, #3498db); /* Turquesa a azul */
        }
        75% {
            background: linear-gradient(45deg, #3498db, #2ecc71); /* Azul a verde */
        }
        100% {
            background: linear-gradient(45deg, #2ecc71, #1abc9c); /* Verde a turquesa */
        }
    }

    .bg-grey {
        background-color: #f2f2f2; /* Fondo gris claro */
    }

    .formulario {
        margin-top: 50px;
        background-color: #fff; /* Fondo blanco para el formulario */
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    .btn-black {
        background-color: #000;
        color: #fff;
        border: none;
        padding: 10px 15px;
        border-radius: 5px;
        cursor: pointer;
    }

    .btn-black:hover {
        background-color: #333;
    }

    .botonC {
        margin-top: 20px;
    }

    .table {
        margin-top: 30px;
    }

    th, td {
        text-align: center;
    }

    .container {
        max-width: 800px;
        margin: 0 auto;
    }

    .mt-5 {
        margin-top: 5rem;
    }

    /* Agregado para mejorar la visualización de la tabla en dispositivos pequeños */
    @media (max-width: 767px) {
        table {
            width: 100%;
        }

        th, td {
            display: block;
            width: 100%;
            box-sizing: border-box;
        }
    }
</style>



<body class=" align-items-center d-flex bg-grey">

<?php
    session_start();
    include_once("../metodos/metodos.php");
    if (isset($_SESSION["Usuario"])) {
            header("location:login.php");
    }else{
?>

        <div class="container ">

            <div class="row formulario">
                <div class="">
                    <form action="../metodos/añadir.php" method="post">
                        <input type="text" name="Nombre" placeholder="Nombre" required>
                        <input type="text" name="Autor" placeholder="Autor" required>
                            <br>
                            <br>
                        <input class="btn btn-dark btn-black " type="submit" value="Crear">
                    </form>

                    <form action="../metodos/salir.php">
                        <button class="btn btn-dark btn-outline-green d-flex botonC">Cerrar Sesion</button>
                    </form>
        </div>

        <div class="container  mt-5"></div>
                <div class="col-2"></div>
                <div class="">
                    <div>
                        <table class="table table-hover table-light  ">
                            <tr class="">
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Autor</th>
                                <th>Acciones</th>
                                </tr>

                                <?php


                                Metodo::MostrarTabla();

                                ?>
                            

                        </table>
                    </div>
                </div>
            </div>
        </div>

        <?php
        }
        ?>
</body>

</html>