package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public boolean validarExpresionRegular(String cadena, String expresionRegular){

        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadena);
        if (coincidencia.matches()){ //si hay coincidencia
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validarFormatoFecha(String cadena, String expresionRegular){

        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadena);
        if (coincidencia.matches()){ //si hay coincidencia
            return true;
        }
        else {
            return false;
        }
    }
}
