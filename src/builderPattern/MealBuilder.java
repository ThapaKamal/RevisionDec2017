/**
 * MealBuilder.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package builderPattern;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}

}

