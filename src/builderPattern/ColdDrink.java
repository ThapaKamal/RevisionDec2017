/**
 * ColdDrink.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package builderPattern;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {

		return new Bottle();
	}

	@Override
	public float price() {

		return 0;
	}

}

