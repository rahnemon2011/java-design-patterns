package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.color.ColorFactory;
import com.java.designpatterns.abstractfactory.shape.ShapeFactory;

public class FactoryProducer {
    static AbstractFactory getFactory(String type) throws Exception {
        switch (type.toLowerCase()) {
            case "color":
                return new ColorFactory();
            case "shape":
                return new ShapeFactory();
            default:
                throw new Exception("Invalid Input");
        }
    }
} 