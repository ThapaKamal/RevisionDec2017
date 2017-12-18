/**
 * ShapeFactory.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 9, 2017
 * 
 */
package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if(shape==null)
		return null;
		
		if(shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
	}

}

