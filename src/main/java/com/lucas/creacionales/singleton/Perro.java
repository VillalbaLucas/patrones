package com.lucas.creacionales.singleton;

public class Perro {
    private static int count;
    private static Perro instance;

    private Perro(){
        count++;
    }

    public static Perro getIntance(){
        if(instance == null)
            instance = new Perro();

        return instance;
    }

    public static int getCount(){
        return count;
    }
    
}
