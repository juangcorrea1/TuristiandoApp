package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaValidacionTest {

    private LocalValidacion localValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.localValidacion = new LocalValidacion();
        System.out.println("Iniciando Prueba...");
    }

    @Test
    public void validarNitCorrectamente(){
        String nitPrueba = "1909875678";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.localValidacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNitIncorrectamentePorNumeroCaracteres(){
        String nitPrueba = "1234";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.localValidacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(), respuesta.getMessage());
    }



}