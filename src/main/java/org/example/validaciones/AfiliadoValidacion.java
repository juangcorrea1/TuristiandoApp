package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class AfiliadoValidacion {

    //validarCostoMensualidad

    public boolean validarCostoMensualidad(Integer valorMensualidad) throws Exception {
        if (valorMensualidad < 0) {
            throw new Exception(Mensaje.VALOR_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

}
