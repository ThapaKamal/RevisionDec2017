/**
 * ShapeDecorator.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package decoratorPattern;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	/*
	 * Defining explicit constructor for abstract class
	 * This same signature will be implemented by the class extending this abstract class.
	 */
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape=decoratedShape;
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();

	}

}

