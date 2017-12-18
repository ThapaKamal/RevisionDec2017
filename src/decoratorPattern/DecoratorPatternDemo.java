/**
 * DecoratorPatternDemo.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package decoratorPattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {

		Shape circle = new Circle();
		
		Shape redCircle= new RedShapeDecorator(new Circle());
		Shape redRectangle=new RedShapeDecorator(new Rectangle());
		
		//Drawing now
		
		System.out.println("Drawing Circle without Red Border..");
		circle.draw();
		
		System.out.println("Drawing Circle with Red Border..");
		redCircle.draw();
		
		System.out.println("Drawing Rectangle with Red Border..");
		redRectangle.draw();
		

	}

}

