package org.example.modelos;

import org.example.validaciones.UsuarioValidacion;

public abstract class Usuario {

    //atributos
    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    protected UsuarioValidacion valicacion = new UsuarioValidacion();

    //metodos
    //metodos especiales
    //1. CONSTRUCTOR
    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    //2. GET Y SET (ENCAPSULAMIENTO)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento.length() < 10) {
            System.out.println("Numero de caracteres invalido");
        } else {
            this.documento = documento;
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try {
            this.valicacion.validarNombres(nombres);
            this.nombres = nombres;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[31m");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        try {
            this.valicacion.validarCorreo(correo);
            this.correo = correo;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[31m");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) throws Exception {
        try {
            this.valicacion.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[31m");
        }
    }

    //metodos ordinarios
    public String generarContraseña() {
        return null;
    }

    //como padre declaro que todos mis hijos deben:
    //1. Registrase en plataforma.

    public abstract Boolean registrar();
}
