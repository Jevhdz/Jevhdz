package com.example.practica01;

public class aritmetica {
    //Atributos
    private int n1;
    private int n2;

    //Metodos

    //Constructor
    public aritmetica(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //Contructor por defecto
    public aritmetica() {
        this.n1 = 0;
        this.n2 = 0;
    }

    //Constructor por objeto
    public aritmetica(aritmetica objeto) {
        this.n1 = objeto.n1;
        this.n2 = objeto.n2;
    }

    //Get()
    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    //Set()
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //Sobrecarga - Redefinicion de metodos
    @Override
    public String toString() {
        return "aritmetica{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }

    public int suma(){
        return n1+n2;
    }

    public int resta(){
        return n1-n2;
    }

    public int multiplicacion(){
        return n1*n2;
    }

    public int division(){
        return n1/n2;
    }
}
