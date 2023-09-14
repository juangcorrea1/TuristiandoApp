package org.example.modelos;

import org.example.modelos.interfaces.Ireporte;
import org.example.validaciones.EmpresaPrivadaValidacion;

public class EmpresaPrivada extends Empresa implements Ireporte {
    private String representanteLegal;

    public EmpresaPrivada() {
    }

    protected EmpresaPrivadaValidacion valicacion = new EmpresaPrivadaValidacion();

    @Override
    public Double cobrar() {
        Double base = 200000.0;
        Double iva = (base * 19) / 100;
        Double resultadoACobrar = (base + iva) * 0.90;

        return resultadoACobrar;
    }

    public EmpresaPrivada(Integer id,
                          String nit,
                          String nombre,
                          Integer ubicacion,
                          String descripcion,
                          Empresa empresa,
                          String representanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion, empresa);
        this.representanteLegal = representanteLegal;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        try {
            this.valicacion.validarEmpresa(representanteLegal);
            this.representanteLegal = representanteLegal;
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
