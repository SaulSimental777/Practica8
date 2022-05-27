package com.company;



public class Equipo{
    private String name;
    private String division;
    private String entrenador;
    private int torneo;
    private int ganados;
    private int perdidos;


    public Equipo(String name, String division, String entrenador, int torneo, int ganados, int perdidos) {
        this.name = name;
        this.division = division;
        this.entrenador = entrenador;
        this.torneo = torneo;
        this.ganados = ganados;
        this.perdidos = perdidos;
    }
    public String toString()
    {
        return "" + "Nombre del equipo: " + this.name + "\nDivision: " + this.division;

    }

    public static void main(String[] args) {

        Equipo[] equipo={
                new Equipo("Murcielagos","Central","Martin",5,3,2),
                new Equipo("Maquiavelicos","Central","Jorge",3,2,1),
                new Equipo("Toros","Atlantico","Oscar",2,0,2),
                new Equipo("Leones","Pacifico","Kevin",4,3,1),
                new Equipo("Tigres","Sureste","Ivan",5,2,5),
        };
        Jugador[] jugador = {
                new Jugador(1, "Aaron", 14,"Base", 1.80f),
                new Jugador(5, "Miguel", 11,"Escolta", 1.90f),
                new Jugador(78, "David", 6,"Alero", 1.74f),
                new Jugador(10, "Gabriel", 4,"Base", 1.86f),
                new Jugador(12, "Federico", 10,"Pivot", 1.93f),
                new Jugador(51, "Luis", 15,"Escolta", 1.91f),
                new Jugador(7, "Christian", 5,"Ala-pivot", 1.83f),
                new Jugador(25, "Israel", 9,"Pivot", 1.88f),
                new Jugador(31, "Adam", 15,"Base", 1.95f),
                new Jugador(43, "Pedro", 25,"Ala-pivot", 1.89f)
        };

        Torneo[] torneo={
                new Torneo("Copa Caliz","Liga premier",5,10,15)

        };
        System.out.println("Datos de los equipos: \n"+ equipo[0]);
        System.out.println(equipo[1]);
        System.out.println(equipo[2]);
        System.out.println(equipo[3]);
        System.out.println(equipo[4]+"\n");


        System.out.println("Datos de los jugadores: \n"+ jugador[0]);
        System.out.println(jugador[1]);
        System.out.println(jugador[2]);
        System.out.println(jugador[3]);
        System.out.println(jugador[4]);
        System.out.println(jugador[5]);
        System.out.println(jugador[6]);
        System.out.println(jugador[7]);
        System.out.println(jugador[8]);
        System.out.println(jugador[9]+"\n");

        System.out.println("Datos del torneo: \n"+ torneo[0]);


    }


}