package com.lucas.comportamiento.factory.impl;

import com.lucas.comportamiento.factory.Transportable;

public class Camion implements Transportable {

    @Override
    public void transportar() {
        System.out.println("Camion transportando...");
    }

}
