package com.java.designpatterns.abstractfactory.shape;

import com.java.designpatterns.abstractfactory.AbstractFactory;
import com.java.designpatterns.abstractfactory.color.Color;

public class ShapeFactory extends AbstractFactory {

	protected Shape getShape(String shape) throws Exception {

		switch (shape.toLowerCase()) {
		case "rectangle":
			return new Rectangle();
		case "circle":
			return new Circle();
		case "square":
			return new Square();
		default:
			throw new Exception("Invalid Input");
		}

	}

	protected Color getColor(String color) {
		return null;
	}
}