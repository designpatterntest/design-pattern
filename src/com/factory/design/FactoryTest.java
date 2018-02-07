package com.factory.design;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shapeCircle = shapeFactory.getShape("CIRCLE");
		shapeCircle.draw();
		
	}

}

/*
 * The Factory Design Pattern is probably the most used design pattern in modern
 * programming languages like Java and C#. It comes in different variants and
 * implementations. If you are searching for it, most likely, you'll find
 * references about the GoF patterns: Factory Method and Abstract Factory. In
 * this article we'll describe a flavor of factory pattern commonly used
 * nowdays. You can also check the original Factory Method pattern which is very
 * similar.
 * 
 * 
 * Intent
 * 
 * creates objects without exposing the instantiation logic to the client.
 * refers to the newly created object through a common interface
 */
