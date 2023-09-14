package org.example.modelos;

import org.example.validaciones.OfertaValidacion;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private Double costoPersona;
    private Empresa empresa;

    private OfertaValidacion validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, String fechaInicio, String fechaFin, Double costoPersona, Empresa empresa) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.empresa = empresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        try {
            validacion.validarTitulo(titulo);
            this.titulo = titulo;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            validacion.validarFormatoFecha(fechaInicio);
            this.fechaInicio = fechaInicio;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            validacion.validarFechas(fechaInicio, fechaFin);
            this.fechaFin = fechaFin;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try {
            validacion.validarCostoPorPersona(costoPersona);
            this.costoPersona = costoPersona;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public Empresa getLocal() {
        return empresa;
    }

    public void setLocal(Empresa empresa) {
        this.empresa = empresa;
    }

}

