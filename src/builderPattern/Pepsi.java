/**
 * Pepsi.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package builderPattern;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {

		return "Cold Drink - Pepsi..";
	}
	
	
	@Override
	public float price() {
		
		return 1.5f;
	}

}

