package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AfiliadoValidacionTest {

    private AfiliadoValidacion afiliadoValidacion;

    @BeforeEach
    public void configurarPruebas() {
        this.afiliadoValidacion = new AfiliadoValidacion();
    }

    @Test
    public void validarMensualidadCorrecto() {
        Integer mensualidadPrueba = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.afiliadoValidacion.validarCostoMensualidad(mensualidadPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarMensualidadIncorrecto() {
        Integer mensualidadPrueba = -10000;
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.afiliadoValidacion.validarCostoMensualidad(mensualidadPrueba));
        Assertions.assertEquals(Mensaje.VALOR_INVALIDO.getMensaje(), respuesta.getMessage());
    }
}