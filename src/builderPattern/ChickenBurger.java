/**
 * ChickenBurger.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package builderPattern;

public class ChickenBurger extends Burger {

	@Override
	public String name() {

		return "Burger - Chicken..";
	}
	
	@Override
	public float price() {
		
		return 3.5f;
	}

}

