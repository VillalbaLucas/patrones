package com.lucas.creacionales.abstractFactory.impl.fabricas;

import com.lucas.creacionales.abstractFactory.FabricaAbstracta;
import com.lucas.creacionales.abstractFactory.impl.muebles.madera.ComodaMadera;
import com.lucas.creacionales.abstractFactory.impl.muebles.madera.MesaMadera;
import com.lucas.creacionales.abstractFactory.impl.muebles.madera.SillaMadera;
import com.lucas.creacionales.abstractFactory.interfaces.Comoda;
import com.lucas.creacionales.abstractFactory.interfaces.Mesa;
import com.lucas.creacionales.abstractFactory.interfaces.Silla;

public class FabricaMadera implements FabricaAbstracta{

    @Override
    public Silla crearSilla() {
       return new SillaMadera();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaMadera();
    }

    @Override
    public Comoda crearComoda() {
        return new ComodaMadera();
    }
    
}
