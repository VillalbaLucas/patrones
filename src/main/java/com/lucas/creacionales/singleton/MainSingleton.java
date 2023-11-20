package com.lucas.creacionales.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Perro perroA = Perro.getIntance();
        Perro perroB = Perro.getIntance();
        System.out.println(Perro.getCount());
        
        
        Perro perroC= Perro.getIntance();
        System.out.println(Perro.getCount());
    }
    
}
