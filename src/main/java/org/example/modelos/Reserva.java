package org.example.modelos;

import org.example.validaciones.ReservaValidacion;

public class Reserva {
    private Integer id;
    private Usuario usuario;
    private Double costoTotal;
    private String fechaReserva;

    private Oferta oferta;

    private ReservaValidacion validacion = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(Integer id, Usuario usuario, Double costoTotal, String fechaReserva, Oferta oferta) {
        this.id = id;
        this.usuario = usuario;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.oferta = oferta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try {
            validacion.validarFormatoFecha(fechaReserva);
            this.fechaReserva = fechaReserva;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

}


