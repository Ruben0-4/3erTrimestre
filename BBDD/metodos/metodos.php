<?php
    class Metodo {
        public static function crearTabla() {
            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $conexion = mysqli_connect($host, $usuario, $contraseña);

                $sql = "CREATE DATABASE IF NOT EXISTS Practica_2Trim";
                $crearTabla = "CREATE TABLE IF NOT EXISTS Usuarios( ID INT, DNI INT(9) AUTO_INCREMENT PRIMARY KEY, Nombre VARCHAR(40), Contraseña VARCHAR(40), Autor VARCHAR(50));";
                $tablaJugadores = "CREATE TABLE IF NOT EXISTS Album( ID INT, Nombre VARCHAR(40), Autor VARCHAR(50));";

            mysqli_query($conexion, $sql);
            mysqli_select_db($conexion, "Practica_2Trim");
            mysqli_query($conexion, $crearTabla);
            mysqli_query($conexion, $tablaJugadores);
            mysqli_close($conexion);
        }

        public static function Crear($dni, $user, $contraseñas, $Autor) {
            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";

                $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);
                $ConsultaInsertar = "INSERT INTO Usuarios VALUES(?,?,?,?)";
                $stmtInsertar = mysqli_prepare($conexion, $ConsultaInsertar);

            mysqli_stmt_bind_param($stmtInsertar, "isss",$dni, $user, $contraseñas, $Autor);
            mysqli_stmt_execute($stmtInsertar);
            mysqli_stmt_close($stmtInsertar);
            mysqli_close($conexion);
        }

        public static function RegistroExistente($user) {

            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";
            $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);
            $Existe = false;

                $consultaUsuarios = "SELECT * FROM Usuarios WHERE Nombre=?";
                $stmtUsuario = mysqli_prepare($conexion, $consultaUsuarios);

            mysqli_stmt_bind_param($stmtUsuario, "s", $user);
            mysqli_stmt_execute($stmtUsuario);
            mysqli_stmt_store_result($stmtUsuario);

                if (mysqli_stmt_num_rows($stmtUsuario) > 0) {
                    $Existe = true;
                }

            mysqli_stmt_close($stmtUsuario);
            mysqli_close($conexion);
                return $Existe;
        }

        public static function Inicio($user, $contraseñas) {

            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";

                $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);
                $Existe = false;
                $consulta = "SELECT Contraseña FROM Usuarios WHERE Nombre=?";
                $stmt = mysqli_prepare($conexion, $consulta); 

            mysqli_stmt_bind_param($stmt, "s", $user);
            mysqli_stmt_execute($stmt);
            mysqli_stmt_bind_result($stmt, $claveColumna);
            mysqli_stmt_fetch($stmt); 
            
                if ($contraseñas == $claveColumna) {
                    $Existe = true;
                }
            
            mysqli_stmt_close($stmt); 
            mysqli_close($conexion);
                return $Existe;
        }
        
        public static function NuevoAlbum($nombre, $Autor) {
            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";
            $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);

                $ConsultaInsertar = "INSERT INTO Album (Nombre,Autor) VALUES(?,?)";
                $stmtInsertar = mysqli_prepare($conexion, $ConsultaInsertar);

            mysqli_stmt_bind_param($stmtInsertar, "ss", $nombre, $Autor);
            mysqli_stmt_execute($stmtInsertar);
            mysqli_stmt_close($stmtInsertar);
            mysqli_close($conexion);
        }

        public static function EliminarAlbum($id) {
            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";

                $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);
                $consultaEliminar = "DELETE FROM Album WHERE ID=$id";
                $stmt = mysqli_prepare($conexion, $consultaEliminar); 
 
            mysqli_stmt_execute($stmt);
            mysqli_stmt_store_result($stmt);
            mysqli_stmt_close($stmt);
            mysqli_close($conexion);
        }

        public static function MostrarTabla() {
            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";

                $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);
                $consultaJugadores = "SELECT * FROM Album";
                $Stmt = mysqli_prepare($conexion, $consultaJugadores);

            mysqli_stmt_execute($Stmt);
            mysqli_stmt_store_result($Stmt);
            mysqli_stmt_bind_result($Stmt, $id, $Nombre, $contraseña);

            while (mysqli_stmt_fetch($Stmt)) {
                echo "<tr'>";
                echo "<td style='color:grey;'>$id</td>";
                echo "<td>$Nombre</td>";
                echo "<td>$contraseña</td>";
                echo "<td><form method='post' action='../metodos/Borrar.php'> <button name='id' value='$id' class='btn-yellow '> <svg xmlns='http://www.w3.org/2000/svg' fill='none' viewBox='0 0 24 24' stroke-width='1.5' stroke='currentColor' class='w-6 h-6'> <path stroke-linecap='round' stroke-linejoin='round' d='M12 4.5v15m7.5-7.5h-15' /> </svg></button></form></td>";
                echo "<td><form method='post' action='../PHP/Modificar.php'> <button name='id' value='$id' class='btn-yellow '> </button></form></td>";
                echo "</tr>";
            }

            mysqli_stmt_close($Stmt);
            mysqli_close($conexion);
        }

        public static function Actualiza($id, $Nombre, $contraseña) {

            $host = "localhost";
            $usuario = "root";
            $contraseña = "";
            $baseDatos = "Practica_2Trim";
            $conexion = mysqli_connect($host, $usuario, $contraseña, $baseDatos);
            
                $update = "UPDATE Album SET Nombre=?, contraseña=? WHERE ID=?";
                $stmt = mysqli_prepare($conexion, $update);

            mysqli_stmt_bind_param($stmt, "iss",$id, $Nombre, $contraseña);
            mysqli_stmt_execute($stmt);
            mysqli_stmt_close($stmt);
            mysqli_close($conexion);
        }
    }
