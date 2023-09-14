package org.example.modelos;

import org.example.modelos.interfaces.Ireporte;
import org.example.validaciones.EntidadCulturalValidacion;
import org.example.validaciones.UsuarioValidacion;

public class EntidadCultural extends Empresa implements Ireporte {
    private String secreataria;
    private String mision;

    protected EntidadCulturalValidacion valicacion = new EntidadCulturalValidacion();

    public EntidadCultural() {
    }

    @Override
    public Double cobrar() {
        Double base = 200000.0;
        Double iva = (base * 19)/100;
        Double resultadoACobrar = (base + iva);

        return resultadoACobrar;
    }

    public EntidadCultural(Integer id,
                           String nit,
                           String nombre,
                           Integer ubicacion,
                           String descripcion,
                           Empresa empresa,
                           String secreataria,
                           String mision) {
        super(id, nit, nombre, ubicacion, descripcion, empresa);
        this.secreataria = secreataria;
        this.mision = mision;
    }

    public String getSecreataria() {
        return secreataria;
    }

    public void setSecreataria(String secreataria){

        try {
            this.valicacion.validarSecretaria(secreataria);
            this.secreataria = secreataria;
        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[31m");
        }
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
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
