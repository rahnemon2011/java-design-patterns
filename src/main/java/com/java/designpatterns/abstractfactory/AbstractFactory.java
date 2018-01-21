package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.color.Color;
import com.java.designpatterns.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    protected abstract Shape getShape(String shape) throws Exception;
    protected abstract Color getColor(String color) throws Exception;
}