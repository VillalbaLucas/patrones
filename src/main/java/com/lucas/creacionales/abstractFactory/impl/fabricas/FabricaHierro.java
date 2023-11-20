package com.lucas.creacionales.abstractFactory.impl.fabricas;

import com.lucas.creacionales.abstractFactory.FabricaAbstracta;
import com.lucas.creacionales.abstractFactory.impl.muebles.hierro.ComodaHierro;
import com.lucas.creacionales.abstractFactory.impl.muebles.hierro.SillaHierro;
import com.lucas.creacionales.abstractFactory.interfaces.Comoda;
import com.lucas.creacionales.abstractFactory.interfaces.Mesa;
import com.lucas.creacionales.abstractFactory.interfaces.Silla;

public class FabricaHierro implements FabricaAbstracta {

    @Override
    public Silla crearSilla() {
        return new SillaHierro();
    }

    // @Override
    // public Mesa crearMesa() {
    //     return new MesaHierro();
    // }

    @Override
    public Comoda crearComoda() {
        return new ComodaHierro();
    }

    @Override
    public Mesa crearMesa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearMesa'");
    }
    
}
