<?php
    include_once("metodos.php");
    Metodo::NuevoAlbum($_POST["Nombre"], $_POST["Autor"]);
        header("location:../PHP/loginCrud.php");
?>