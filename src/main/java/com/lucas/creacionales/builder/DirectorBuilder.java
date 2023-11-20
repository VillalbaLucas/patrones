package com.lucas.creacionales.builder;

import com.lucas.creacionales.builder.interfaces.CarBuilder;

public class DirectorBuilder {

    public static void deportivoBuilder(CarBuilder builder){
        builder.reset();
        builder.setHp(200);
        builder.setPuertas(2);
        builder.setRodado(17);
    }

    public static void familiarBuilder(CarBuilder builder){
        builder.reset();
        builder.setHp(110);
        builder.setPuertas(4);
        builder.setRodado(15);
    }
}
