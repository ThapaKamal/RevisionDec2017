/**
 * AbstractFactoryPatternDemo.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 9, 2017
 * 
 */
package abstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		//Get Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		
		//Get an Object of Circle from Shape Factory
		Shape shape1=shapeFactory.getShape("Circle");
		//Draw the Cirlce Shape
		shape1.draw();
		
		//Get Object of Rectangle from Shape Factory
		Shape shape2=shapeFactory.getShape("Rectangle");
		//Draw the Rectangle Shape
		shape2.draw();
		
		//Get the Object of Square from Shape Factory
		Shape shape3=shapeFactory.getShape("Square");
		//Draw the Square Shape
		shape3.draw();
		
		
		
		//Get Color Factory
		AbstractFactory colorFactory= FactoryProducer.getFactory("Color");
		
		//Get Object of Red Color from Color Factory
		Color color1=colorFactory.getColor("Red");
		//Fill the Red Color
		color1.fill();
		
		//Get Object of Green Color from Color Factory
		Color color2=colorFactory.getColor("Green");
		//Fill the Green Color
		color2.fill();
		
		//Get the Object of Blue Color from Color Factory
		Color color3=colorFactory.getColor("Blue");
		//Fill the Blue color
		color3.fill();
	
		
		
	}

}

