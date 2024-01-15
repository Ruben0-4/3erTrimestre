<?php
    include_once("metodos.php");
    Metodo::EliminarAlbum($_POST["id"]);
        header("location:../PHP/loginCrud.php");
?>