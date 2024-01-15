<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    <style>
      
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background: linear-gradient(to bottom right, #ffcc66, #ff9966);
        }

        form {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        h1 {
            color: #007bff;
        }

        label {
            display: block;
            margin: 10px 0 5px;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px;
            box-sizing: border-box;
            border: 1px solid #ced4da;
            border-radius: 4px;
        }

        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }

    </style>

</head>

<body>
    
    <?php
      session_start();
        include_once("../metodos/metodos.php");

    if (isset($_SESSION["usuarios"]) || isset($_POST["usuarios"], $_POST["contraseñas"]) && Metodo::Inicio($_POST["usuarios"], $_POST["contraseñas"])) {

        isset($_POST["usuarios"], $_POST["contraseñas"]);
            $_SESSION["usuarios"] = $_POST["usuarios"];
            header("location:loginCrud.php");
    }else{
    ?>

    <form action="loginCrud.php" method="post">
      <h1>Iniciar Sesión</h1>
          <label>Nombre:</label>
            <input type="text" name="usuarios" placeholder="Nombre Usuario">
          <label>Contraseña:</label>
            <input type="password" name="contraseñas" placeholder="Contraseña">

        <div class="botones">
          <button type="submit">Iniciar Sesion</button>
        </div>
    </form>

    <?php
      }
    ?>

</body>

</html>