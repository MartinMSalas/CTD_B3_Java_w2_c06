package com.ctd.java.semana2.clase6;

public class Perro {


    private boolean estoyEnAdopcion = false;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estoyLastimado;
    private String nombrePila;

    public boolean isEstoyEnAdopcion() {
        return estoyEnAdopcion;
    }

    public void setEstoyEnAdopcion(boolean estoyEnAdopcion) {
        this.estoyEnAdopcion = estoyEnAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstoyLastimado() {
        return estoyLastimado;
    }

    public void setEstoyLastimado(boolean estoyLastimado) {
        this.estoyLastimado = estoyLastimado;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public Perro(double peso, boolean tieneChip, boolean estoyLastimado) {
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estoyLastimado = estoyLastimado;
    }

    public Perro(boolean estoyEnAdopcion, String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estoyLastimado, String nombrePila) {
        this.estoyEnAdopcion = estoyEnAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estoyLastimado = estoyLastimado;
        this.nombrePila = nombrePila;
    }

    public int edadPerro(){
        int fechaActual = 2022;
        return fechaActual - anioNacimiento;
    }


    public boolean meEncuentranFacil(){
        return tieneChip;
    }

    public void mePuedenAdoptar(){
        if(!estoyLastimado && peso>5.45){
            System.out.println("Me pueden adoptar !!!");
        }else {
            System.out.println("NO me pueden adoptar !!!");
        }

    }

}
