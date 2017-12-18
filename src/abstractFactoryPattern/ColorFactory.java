/**
 * ColorFactory.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 9, 2017
 * 
 */
package abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color==null)
		return null;
		
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(color.equalsIgnoreCase("Blue")){
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}

