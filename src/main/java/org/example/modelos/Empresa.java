package org.example.modelos;

import org.example.validaciones.LocalValidacion;

public abstract class Empresa {
    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;

    private Empresa empresa;

    private LocalValidacion validacion = new LocalValidacion();

    public Empresa() {
    }

    public Empresa(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, Empresa empresa) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.empresa = empresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
            validacion.validarNit(nit);
            this.nit = nit;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            validacion.validarNombreEmpresa(nombre);
            this.nombre = nombre;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[31m");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empresa getLocal() {
        return empresa;
    }

    public void setLocal(Empresa empresa) {
        this.empresa = empresa;
    }

    public abstract Double cobrar();

}


