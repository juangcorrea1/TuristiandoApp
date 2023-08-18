package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class OfertaValidacion {

    protected Util util = new Util();
    public boolean validarTitulo(String titulo) throws Exception {
        if (titulo.length() > 20) {
            throw new Exception(Mensaje.TITULO_OFERTA_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

    public boolean validarFechas(String fechaInicio, String fechaFin) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date primeraFecha = sdf.parse(fechaInicio);
            Date segundaFecha = sdf.parse(fechaFin);
            if (primeraFecha.after(segundaFecha)) {
                throw new Exception(Mensaje.FECHA_INICIO_MAYOR.getMensaje());
            }
            return true;
        } catch (ParseException e) {
            throw new Exception(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje());
        }
    }

    public boolean validarFormatoFecha(String fecha) throws Exception {
        if (!util.validarFormatoFecha(fecha, "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
            throw new Exception(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

    public boolean validarCostoPorPersona(double costoPorPersona) throws Exception {
        if (costoPorPersona < 0) {
            throw new Exception(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }
}

