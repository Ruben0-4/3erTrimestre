<?php
    include_once("metodos.php");
    Metodo::Actualiza($_POST["id"], $_POST["Nombre"], $_POST["Autor"]);
        header("location:../PHP/Modificar.php");
?>