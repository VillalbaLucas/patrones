package com.lucas.creacionales.builder;

public class Car {
    private int hp;
    private int puertas;
    private int rodado;

    public Car(){}
    public Car(int hp, int puertas, int rodado) {
        this.hp = hp;
        this.puertas = puertas;
        this.rodado = rodado;
    }
    @Override
    public String toString() {
        return "Car [hp=" + hp + ", puertas=" + puertas + ", rodado=" + rodado + "]";
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public int getRodado() {
        return rodado;
    }
    public void setRodado(int rodado) {
        this.rodado = rodado;
    }
}
