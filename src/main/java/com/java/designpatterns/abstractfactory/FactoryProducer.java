package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.color.ColorFactory;
import com.java.designpatterns.abstractfactory.shape.ShapeFactory;

class FactoryProducer {
    static AbstractFactory getFactory(String type) throws UnsupportedOperationException {
        switch (type.toLowerCase()) {
            case "color":
                return new ColorFactory();
            case "shape":
                return new ShapeFactory();
            default:
                throw new UnsupportedOperationException("Invalid Input");
        }
    }
} 