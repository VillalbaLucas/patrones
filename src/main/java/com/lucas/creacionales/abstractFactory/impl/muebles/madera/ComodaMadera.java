package com.lucas.creacionales.abstractFactory.impl.muebles.madera;

import com.lucas.creacionales.abstractFactory.interfaces.Comoda;

public class ComodaMadera implements Comoda {

    @Override
    public void meterEnCajon() {
        System.out.println("Guardando objeto en comoda de madera...");
    }
    
}
