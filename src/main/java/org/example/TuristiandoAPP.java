package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class TuristiandoAPP {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario();
        Local local = new Local();
        Oferta oferta = new Oferta();
        Reserva reserva = new Reserva();
        Scanner lea = new Scanner(System.in);


        System.out.print("\u001B[34mDigite la fecha inicial : \u001B[0m");
        oferta.setFechaInicio(lea.next());
        System.out.print("\u001B[34mDigite la fecha final : \u001B[0m");
        oferta.setFechaFin(lea.next());
    }
}