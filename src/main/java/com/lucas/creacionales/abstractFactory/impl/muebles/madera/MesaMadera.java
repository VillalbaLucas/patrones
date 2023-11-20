package com.lucas.creacionales.abstractFactory.impl.muebles.madera;

import com.lucas.creacionales.abstractFactory.interfaces.Mesa;

public class MesaMadera implements Mesa {

    @Override
    public void apoyar() {
        System.out.println("Apoyado en Mesa de Madera...");
    }
    
}
