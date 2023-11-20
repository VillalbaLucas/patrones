package com.lucas.creacionales.prototype.impl;

import com.lucas.creacionales.prototype.Prototype;

public class Robot implements Prototype {

    private String modelo;
    private int alto;

    @Override
    public Robot clonar() {
        return new Robot(this);
    }
    
    public Robot(Robot proto){
        modelo=proto.getModelo();
        alto=proto.getAlto();
    }

    public Robot(String modelo, int alto) {
        this.modelo = modelo;
        this.alto = alto;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Robot [modelo=" + modelo + ", alto=" + alto + "]";
    }

    
}
