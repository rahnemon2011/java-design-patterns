package com.java.designpatterns.abstractfactory.color;

import com.java.designpatterns.abstractfactory.AbstractFactory;
import com.java.designpatterns.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    protected Shape getShape(String shape) {
        return null;
    }

    @Override
    protected Color getColor(String color) throws Exception {
        switch (color.toLowerCase()) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                throw new Exception("Invalid Input");
        }
    }
}