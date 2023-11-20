package com.lucas.creacionales.factory.impl;

import com.lucas.creacionales.factory.Transportable;

public class Barco implements Transportable {

    @Override
    public void transportar() {
        System.out.println("Barco transportando...");
    }
    
}
