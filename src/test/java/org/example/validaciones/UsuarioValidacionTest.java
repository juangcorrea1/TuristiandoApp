package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    private UsuarioValidacion usuarioValidacion;

    //preparar las pruebas que vamos a realizar
    @BeforeEach
    public void configurarPruebas(){
        this.usuarioValidacion = new UsuarioValidacion();
        System.out.println("Iniciando Prueba...");
    }
    //Programamos nuestras pruebas unitarias
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba = "Juan Gabriel Corre Vasquez"; // preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectoPorNumeroCaracteres(){
        String nombrePrueba = "Juan";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombresFuncionaIncorrectoPorCaracteresInvalidos(){
        String nombrePrueba = "1234567890";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarCorreoFuncionaCorrectamente(){
        String correoPrueba="juan@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFuncionaIncorrectoPorFormato(){
        String correoPrueba = "juan";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta(){
        Integer ubicacionPrueba = 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta(){
        Integer ubicacionPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(), respuesta.getMessage());
    }
}