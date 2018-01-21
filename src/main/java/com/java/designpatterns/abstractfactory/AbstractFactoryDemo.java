package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.color.Color;
import com.java.designpatterns.abstractfactory.shape.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color blue = color.getColor("blue");
        blue.fill();
    }
} 