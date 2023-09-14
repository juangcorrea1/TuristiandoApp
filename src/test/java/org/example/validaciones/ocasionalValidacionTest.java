package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ocasionalValidacionTest {

    private OcasionalValidacion ocasionalValidacion;

    @BeforeEach
    public void configurarPruebas() {
        this.ocasionalValidacion = new OcasionalValidacion();
    }

    @Test
    public void validarMensualidadCorrecto() {
        Integer costoEvento = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.ocasionalValidacion.validarCostoEvento(costoEvento));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarMensualidadIncorrecto() {
        Integer costoEvento = -10000;
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.ocasionalValidacion.validarCostoEvento(costoEvento));
        Assertions.assertEquals(Mensaje.VALOR_INVALIDO.getMensaje(), respuesta.getMessage());
    }

}