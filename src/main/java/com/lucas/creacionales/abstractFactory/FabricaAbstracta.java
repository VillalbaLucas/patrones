package com.lucas.creacionales.abstractFactory;

import com.lucas.creacionales.abstractFactory.interfaces.Comoda;
import com.lucas.creacionales.abstractFactory.interfaces.Mesa;
import com.lucas.creacionales.abstractFactory.interfaces.Silla;

public interface FabricaAbstracta {
    public Silla crearSilla();
    public Mesa crearMesa();
    public Comoda crearComoda();
}
