package com.lucas.creacionales.abstractFactory.impl.muebles.madera;

import com.lucas.creacionales.abstractFactory.interfaces.Silla;

public class SillaMadera implements Silla {

    @Override
    public void sentar() {
        System.out.println("Sentandose en silla de madera...");
    }
    
}
