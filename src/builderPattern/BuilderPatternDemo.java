/**
 * BuilderPatternDemo.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 */
package builderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder=new MealBuilder();
		
		Meal vegmeal=mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal..");
		vegmeal.showItems();
		System.out.println("Total Cost :"+vegmeal.getCost());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal..");
		nonVegMeal.showItems();
		System.out.println("Total Cost :"+nonVegMeal.getCost());
	}

}

