package com.lucas.creacionales.builder.interfaces;

import com.lucas.creacionales.builder.Car;

public interface CarBuilder {
    public void setHp(int hp);
    public void setPuertas(int puertas);
    public void setRodado(int rodado);
    public void reset(); 
    public Car getCar();
}
