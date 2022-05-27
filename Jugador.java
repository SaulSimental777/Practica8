package com.company;


public class Jugador {
    private int numero;
    private String nombre;
    private int puntos;
    private String posicion;
    private float estatura;


    public Jugador(int numero, String nombre, int puntos, String posicion, float estatura) {
        this.numero = numero;
        this.nombre = nombre;
        this.puntos = puntos;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public String toString()
    {
        return "" + "Numero: " + numero + "\nNombre: " + nombre;

    }

}


class Torneo {
    private String nombre;
    private String region;
    private int equipos;
    private int PJ;
    private int PP;

    public Torneo(String nombre, String region, int equipos, int PJ, int PP ) {

        this.nombre=nombre;
        this.region=region;
        this.equipos=equipos;
        this.PJ=PJ;
        this.PP=PP;
    }
    public String toString()
    {
        return "" + "Nombre del torneo: " + nombre + "\nRegion: " + region+ "\nNumero de equipos: " + equipos + "\nPartidos jugados: " + PJ + "\nPartidos pendientes: "+ PP;

    }

}




