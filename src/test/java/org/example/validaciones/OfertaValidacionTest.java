package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void configurarPruebas() {
        this.ofertaValidacion = new OfertaValidacion();
    }

    @Test
    public void validarTituloFuncionaCorrectamente(){
        String nombreTitulo = "comfama aprende";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarTitulo(nombreTitulo));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarTituloFuncionaIncorrectoPorNumeroCaracteres(){
        String nombreTitulo = "Comfama Aprende Rionegro Antioquia";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarTitulo(nombreTitulo));
        Assertions.assertEquals(Mensaje.TITULO_OFERTA_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarCostoPorPersonaFuncionaCorrectamente(){
        double costoPersona = 5;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarCostoPorPersona(costoPersona));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCostoPorPersonaIncorrectoPorValor(){
        double costoPersona = -5;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarCostoPorPersona(costoPersona));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarFechasFuncionaCorrectamente(){
        String primeraFecha = "12/03/2003";
        String segundaFecha = "13/03/2003";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarFechas(primeraFecha,segundaFecha));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechasIncorrectoFechaInicialMayor(){
        String primeraFecha = "12/03/2003";
        String segundaFecha = "10/03/2003";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarFechas(primeraFecha, segundaFecha));
        Assertions.assertEquals(Mensaje.FECHA_INICIO_MAYOR.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarFechasIncorrectoFormatoFecha(){
        String primeraFecha = "sisas";
        String segundaFecha = "10/03/2003";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarFechas(primeraFecha, segundaFecha));
        Assertions.assertEquals(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarFormatoFechaFuncionaCorrectamente(){
        String primeraFecha = "12/03/2003";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarFormatoFecha(primeraFecha));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFormatoFechaIncorrectoFormatoFecha(){
        String primeraFecha = "sisas";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarFormatoFecha(primeraFecha));
        Assertions.assertEquals(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje(), respuesta.getMessage());
    }
}