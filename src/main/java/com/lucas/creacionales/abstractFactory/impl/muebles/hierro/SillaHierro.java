package com.lucas.creacionales.abstractFactory.impl.muebles.hierro;

import com.lucas.creacionales.abstractFactory.interfaces.Silla;

public class SillaHierro implements Silla {

    @Override
    public void sentar() {
        System.out.println("Sentado en silla de Hierro");
    }
    
}
