package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class OcasionalValidacion {

    public boolean validarCostoEvento(Integer valorEvento) throws Exception {
        if (valorEvento < 0) {
            throw new Exception(Mensaje.VALOR_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }
}
