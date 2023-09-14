package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    private LocalValidacion localValidacion;

    //preparar las pruebas que vamos a realizar
    @BeforeEach
    public void configurarPruebas(){
        this.localValidacion = new LocalValidacion();
        System.out.println("Iniciando Prueba...");
    }

    @Test
    public void validarNitFuncionaCorrectamente(){
        String nitPrueba = "1234567890"; // preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.localValidacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectoPorNumeroCaracteres(){
        String nitPrueba = "123456783333";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.localValidacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreEmpresaFuncionaCorrectamente(){
        String nombreEmpresaPrueba = "ComfamaPro"; // preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.localValidacion.validarNombreEmpresa(nombreEmpresaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombreEmpresaFuncionaIncorrectoPorNumeroCaracteres(){
        String nombreEmpresaPrueba = "jajajajajajajajajajajajajajajajaja";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.localValidacion.validarNombreEmpresa(nombreEmpresaPrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_EMPRESA_INVALIDO.getMensaje(), respuesta.getMessage());
    }

}