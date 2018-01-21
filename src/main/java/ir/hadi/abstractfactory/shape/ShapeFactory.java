package ir.hadi.abstractfactory.shape;

import java.util.function.Consumer;

import ir.hadi.abstractfactory.AbstractFactory;
import ir.hadi.abstractfactory.color.Color;

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