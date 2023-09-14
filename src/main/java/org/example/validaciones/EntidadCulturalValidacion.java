package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EntidadCulturalValidacion {

    public EntidadCulturalValidacion(){

    }
    protected Util util = new Util();
    public boolean validarSecretaria(String secretaria) throws Exception {
        if (secretaria.length()<10 || secretaria.length()>70){
            //1. validar que el nombre tenga como minimo 10 caracteres
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(secretaria, "^[a-zA-Z ]+$")) {
            // 2. nombres solo puede tener letras
            throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
