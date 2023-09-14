package org.example.utilidades;

public enum Mensaje {
    NUMERO_CARACTERES_INVALIDO("El numero de caracteres es invalido"),
    NOMBRE_INVALIDO("El nombre solo acepta letras y espacios"),
    FORMATO_INVALIDO("Revisa el formato del correo"),
    UBICACION_INVALIDA("La ubicacion solo puede ser un numero entre 1 y 4"),
    NOMBRE_EMPRESA_INVALIDO("El nombre de la empresa no puede sobrepasar los 30 caracteres"),
    TITULO_OFERTA_INVALIDO("El titulo de la oferta no puede sobrepasar los 20 caracteres"),
    FECHA_INICIO_MAYOR("La fecha de inicio no puede ser mayor que la fecha de fin"),
    FECHA_FORMATO_INVALIDO("Todas las fechas deben tener el formato (DD/MM/YYYY)"),
    COSTO_PERSONA_INVALIDO("El costo por persona no puede ser negativo"),

    VALOR_INVALIDO("El Monto debe de ser positivo"),
    NUMERO_PERSONAS_INVALIDO("El número de personas por reserva no puede ser mayor a 4 personas"),
    FECHA_INVALIDA("La facha ingresada no es valida"),
    NIT_INVALIDO("El NIT de debe de tener solo 10 digitos");


    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
