package com.lucas.comportamiento.factory.impl;

import com.lucas.comportamiento.factory.Transportable;

public class Avion implements Transportable {

    @Override
    public void transportar() {
        System.out.println("Avion transportando...");
    }
}
