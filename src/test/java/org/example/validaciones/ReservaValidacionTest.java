package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion reservaValidacion;

    @BeforeEach
    public void configurarPruebas() {
        this.reservaValidacion = new ReservaValidacion();
    }

    @Test
    public void validarNumeroPersonasCorrecta(){
        Integer numeroPersonasPrueba = 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarNumeroPersonas
                (numeroPersonasPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroPersonasIncorrecta(){
        Integer numeroPersonasPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.reservaValidacion.validarNumeroPersonas
                (numeroPersonasPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarFormatoFechaFuncionaCorrectamente(){
        String primeraFecha = "12/03/2003";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFormatoFecha(primeraFecha));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFormatoFechaIncorrectoFormatoFecha(){
        String primeraFecha = "sisas";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.reservaValidacion.validarFormatoFecha(primeraFecha));
        Assertions.assertEquals(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje(), respuesta.getMessage());
    }

}