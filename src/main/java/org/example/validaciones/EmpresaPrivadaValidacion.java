package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaPrivadaValidacion {
    public EmpresaPrivadaValidacion() {
    }

    protected Util util = new Util();
    public boolean validarEmpresa(String representanteLegal) throws Exception {
        if (representanteLegal.length()>10){
            //1. validar que el nombre tenga como minimo 10 caracteres
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(representanteLegal, "^[a-zA-Z ]+$")) {
            // 2. nombres solo puede tener letras
            throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
