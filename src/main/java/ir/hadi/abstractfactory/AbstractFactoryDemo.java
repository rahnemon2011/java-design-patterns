package ir.hadi.abstractfactory;

import ir.hadi.abstractfactory.color.Color;
import ir.hadi.abstractfactory.shape.Shape;

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