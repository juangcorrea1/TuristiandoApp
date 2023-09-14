package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaPrivadaValidacionTest {

    private EmpresaPrivadaValidacion empresaPrivadaValidacion;

    //preparar las pruebas que vamos a realizar
    @BeforeEach
    public void configurarPruebas(){
        this.empresaPrivadaValidacion = new EmpresaPrivadaValidacion();
        System.out.println("Iniciando Prueba...");
    }

    @Test
    public void validarEmpresaFuncionaCorrectamente() {
        String empresaPrueba = "abcderedf";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.empresaPrivadaValidacion.validarEmpresa(empresaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarEmpresaFuncionaIncorrectamenteNumeroCaracteres(){
        String empresaPrueba = "JuanGabrielcorrreavasquez";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.empresaPrivadaValidacion.validarEmpresa(empresaPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarEmpresaFuncionaIncorrectamenteCaracteresIncorrecto(){
        String empresaPrueba = "7878";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.empresaPrivadaValidacion.validarEmpresa(empresaPrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(), respuesta.getMessage());
    }
}