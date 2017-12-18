/**
 * FactoryProducer.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 9, 2017
 * 
 */
package abstractFactoryPattern;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("Color")){
			return new  ColorFactory();
		}
		return null;
	}
}

