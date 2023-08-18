package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class LocalValidacion {

    public boolean validarNit(String nit) throws Exception {
        if (!nit.matches("\\d{10}")) {
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

    public boolean validarNombreEmpresa(String nombreEmpresa) throws Exception {
        if (nombreEmpresa.length() > 30) {
            throw new Exception(Mensaje.NOMBRE_EMPRESA_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }
}

