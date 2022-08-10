package com.ctd.java.semana2.clase6;

public class main {
    public static void main(String[] args) {

    Perro perro1 = new Perro(true,"Golden Retriever",2021,3,false,false,"Freya");
    System.out.println("La edad del perro "+perro1.edadPerro()+" años");

    System.out.println("Me encuentran facil "+perro1.meEncuentranFacil());

    perro1.mePuedenAdoptar();
    System.out.println("-------------------");
    Perro perro2 = new Perro(10,true,false);
    perro2.mePuedenAdoptar();
    }
}
