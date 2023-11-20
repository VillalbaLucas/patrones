package com.lucas.creacionales.factory.impl;

import com.lucas.creacionales.factory.Transportable;

public class Camion implements Transportable {

    @Override
    public void transportar() {
        System.out.println("Camion transportando...");
    }

}
