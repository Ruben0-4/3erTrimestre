<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background: rgb(165, 255, 246); 
            color: #333;
        }

        form {
            background-color: #fff;
            color: #333;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: 20px auto;
            max-width: 300px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .btn-dark {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn-dark:hover {
            background-color: #222;
        }

    </style>

</head>

<body>

    <form action="../metodos/Actualizar.php" method="post">
        <input name="id" style="background-color: #f0f5f9; color: #333;" type="text" name="id" placeholder="ID">
        <input type="text" name="Nombre" placeholder="Nombre" required>
        <input type="text" name="Autor" placeholder="Autor" required>
        <br>
        <br>
        <input class="btn btn-dark btn-outline-warning " type="submit" value="Modificar">
    </form>

    <form action="../PHP/loginCrud.php" method="post">
        <input class="btn btn-dark btn-outline-warning " type="submit" value="Volver">
    </form>

    <br><br><br>

</body>

</html>
