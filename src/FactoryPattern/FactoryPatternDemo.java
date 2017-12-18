/**
 * FactoryPatternDemo.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 9, 2017
 * 
 */
package FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory=new ShapeFactory();
		
		//Get an Object of Circle and Call its Draw method.
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		
		//Get an Object of Rectangle and call its Draw method
		Shape shape2=shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		//Get an Object of Square and call its Draw Method.
		Shape shape3=shapeFactory.getShape("Square");
		shape3.draw();

	}

}

