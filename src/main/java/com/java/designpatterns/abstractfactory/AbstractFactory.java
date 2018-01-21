package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.color.Color;
import com.java.designpatterns.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    protected abstract Shape getShape(final String shape) throws UnsupportedOperationException;
    protected abstract Color getColor(final String color) throws UnsupportedOperationException;
}