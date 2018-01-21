package ir.hadi.abstractfactory;

import ir.hadi.abstractfactory.color.Color;
import ir.hadi.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    protected abstract Shape getShape(String shape) throws Exception;
    protected abstract Color getColor(String color) throws Exception;
}