package com.lucas.creacionales.prototype;

import com.lucas.creacionales.prototype.impl.Robot;

public class MainPrototype {
    public static void main(String[] args) {
        Robot robotA = new Robot("AR-32", 150);
        Robot robotCopia = robotA.clonar();
        
        System.out.println(robotA.toString());
        System.out.println(robotCopia.toString());
    }
}
