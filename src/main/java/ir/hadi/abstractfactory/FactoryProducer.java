package ir.hadi.abstractfactory;

import ir.hadi.abstractfactory.color.ColorFactory;
import ir.hadi.abstractfactory.shape.ShapeFactory;

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