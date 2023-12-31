package com.lucas.creacionales.factory;

import com.lucas.creacionales.factory.impl.Avion;
import com.lucas.creacionales.factory.impl.Barco;
import com.lucas.creacionales.factory.impl.Camion;

public class TrasnportarFactory {
    public Transportable trasporte = null;

    public void tomarPedidos(){
        System.out.println("Tomando pedidos...");
    }

    public Transportable crearTransporte(TipoTransporte tipoTransporte){
        switch (tipoTransporte) {
            case AIRE:
                trasporte = new Avion();
                break;
            case AGUA:
                trasporte = new Barco();
                break;
            case TIERRA:
                trasporte = new Camion();
                break;
        }
        return trasporte;
    }

    public static void main(String[] args) {
        TrasnportarFactory transportarFactory = new TrasnportarFactory();
        transportarFactory.crearTransporte(TipoTransporte.AGUA);
        transportarFactory.trasporte.transportar();
    }
}
