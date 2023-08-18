package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class UsuarioValidacion {

    protected Util util = new Util();

    public UsuarioValidacion() {
    }

    public boolean validarNombres(String nombres) throws Exception {
        if (nombres.length()<10){
            //1. validar que el nombre tenga como minimo 10 caracteres
          throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(nombres, "^[a-zA-Z ]+$")) {
            // 2. nombres solo puede tener letras
            throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

    public boolean validarCorreo(String correo)throws Exception {
        if (!util.validarExpresionRegular(correo, "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")){
            throw new Exception(Mensaje.FORMATO_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarUbicacion(Integer ubicacion)throws Exception {
        if(ubicacion < 1 || ubicacion > 4){
            throw new Exception(Mensaje.UBICACION_INVALIDA.getMensaje());
        }else {
            return true;
        }
    }

}


