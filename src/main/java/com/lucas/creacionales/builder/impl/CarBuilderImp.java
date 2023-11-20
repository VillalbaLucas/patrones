package com.lucas.creacionales.builder.impl;

import com.lucas.creacionales.builder.Car;
import com.lucas.creacionales.builder.interfaces.CarBuilder;

public class CarBuilderImp implements CarBuilder {

    private Car car;

    public CarBuilderImp(){}

    @Override
    public void reset(){
        car = new Car();
    }
    
    @Override
    public void setHp(int hp) {
       car.setHp(hp);
    }

    @Override
    public void setPuertas(int puertas) {
        car.setPuertas(puertas);
    }

    @Override
    public void setRodado(int rodado) {
        car.setRodado(rodado);
    }

    public Car getCar(){
        return car;
    }
    
}
