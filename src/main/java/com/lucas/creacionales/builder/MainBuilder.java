package com.lucas.creacionales.builder;


import com.lucas.creacionales.builder.impl.CarBuilderImp;
import com.lucas.creacionales.builder.interfaces.CarBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilderImp();
        DirectorBuilder.familiarBuilder(carBuilder);
        Car car = carBuilder.getCar();

        System.out.println(car.toString());
    }
}
