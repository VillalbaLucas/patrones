package com.lucas.creacionales.abstractFactory;

import com.lucas.creacionales.abstractFactory.impl.fabricas.FabricaMadera;
import com.lucas.creacionales.abstractFactory.interfaces.Comoda;
import com.lucas.creacionales.abstractFactory.interfaces.Mesa;

public class MainFactory {

    public static void main(String[] args) {
        
        FabricaAbstracta fabrica = new FabricaMadera();
        Mesa mesaMadera = fabrica.crearMesa();
        Comoda comodaMadera = fabrica.crearComoda();
    
        mesaMadera.apoyar();
        comodaMadera.meterEnCajon();
    }
}
