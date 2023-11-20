package com.lucas.creacionales.factory.impl;

import com.lucas.creacionales.factory.Transportable;

public class Avion implements Transportable {

    @Override
    public void transportar() {
        System.out.println("Avion transportando...");
    }
}
