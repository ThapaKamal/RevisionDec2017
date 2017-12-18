/**
 * AbstractFactory.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 9, 2017
 * 
 */
package abstractFactoryPattern;

public abstract class AbstractFactory {

	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}

