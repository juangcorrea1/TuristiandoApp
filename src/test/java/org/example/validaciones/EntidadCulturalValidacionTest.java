package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntidadCulturalValidacionTest {
    private EntidadCulturalValidacion entidadCulturalValidacion;

    //preparar las pruebas que vamos a realizar
    @BeforeEach
    public void configurarPruebas() {
        this.entidadCulturalValidacion = new EntidadCulturalValidacion();
        System.out.println("Iniciando Prueba...");
    }

    @Test
    public void validarEntidadFuncionaCorrectamente() {
        String entidadPrueba = "janshcnsjsnsnsn";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.entidadCulturalValidacion.validarSecretaria(entidadPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarEmpresaFuncionaIncorrectamenteNumeroCaracteres() {
        String entidadPrueba = "juan";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.entidadCulturalValidacion.validarSecretaria(entidadPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarEmpresaFuncionaIncorrectamenteCaracteresIncorrecto() {
        String entidadPrueba = "7879999908";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.entidadCulturalValidacion.validarSecretaria(entidadPrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(), respuesta.getMessage());
    }

}