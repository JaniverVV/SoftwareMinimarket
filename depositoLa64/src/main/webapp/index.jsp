
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div id="myModal" class="modal">
            <a class="close"><div class="botoncierre">x</div></a>
            <div class="centroRegistro">
                <div class="contenedorRegistro">
                    <div class="tituloNuevoUsu">Registro de clientes</div>

                    <form action="SvCliente" method="post">

                        <div class="item">

                            <label>Nombre Completo</label>
                            <input type="text" name="nombre" />
                        </div>
                        <div class="item">
                            <label>Cédula</label>
                            <input type="text" name="cedula" />
                        </div>
                        <div class="item">
                            <label>Teléfono</label>
                            <input type="text"  name="telefono" />
                        </div>
                        <div class="item">
                            <label>Correo electrónico</label>
                            <input type="text"  name="correo" />
                        </div>
                        <div class="item">
                            <label>Dirección</label>
                            <input type="text"  name="direccion" />
                        </div>
                        <div class="item">
                            <input type="submit" value="Cancelar Registro" class="cancela" />
                            <input type="submit" value="Registrar" class="registra" />
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
