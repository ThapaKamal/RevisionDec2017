/**
 * VegBurger.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package builderPattern;

public class VegBurger extends Burger {

	@Override
	public String name() {
		
		return "Burger - Veg..";
	}

	@Override
	public float price() {
		
		return 2.5f;
	}
}

