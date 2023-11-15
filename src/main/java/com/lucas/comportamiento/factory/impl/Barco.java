package com.lucas.comportamiento.factory.impl;

import com.lucas.comportamiento.factory.Transportable;

public class Barco implements Transportable {

    @Override
    public void transportar() {
        System.out.println("Barco transportando...");
    }
    
}
