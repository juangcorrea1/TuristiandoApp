package org.example.modelos;

import org.example.modelos.interfaces.Ireporte;
import org.example.validaciones.OcasionalValidacion;

public class Ocasional extends Usuario implements Ireporte {

    private Integer valorEvento;
    private OcasionalValidacion validacion = new OcasionalValidacion();

    public Ocasional() {
    }

    @Override
    public Boolean registrar() {
        return null;
    }

    public Ocasional(Integer id,
                     String documento,
                     String nombres,
                     String correo,
                     Integer ubicacion,
                     Integer valorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorEvento = valorEvento;
    }

    public Integer getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(Integer valorEvento) {
        try {
            this.validacion.validarCostoEvento(valorEvento);
            this.valorEvento = valorEvento;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[31m");
        }
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}