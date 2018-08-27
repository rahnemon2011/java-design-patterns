package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.color.Color;
import com.java.designpatterns.abstractfactory.shape.Shape;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        Shape rectangle = shape.getShape("rectangle");
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color blue = color.getColor("blue");
        blue.fill();
    }
} 