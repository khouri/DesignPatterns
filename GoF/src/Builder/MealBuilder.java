/*
 * Implementa o pattern Builder que permite criar objetos grandes
 * adicionando pequenos objetos autosuficientes.
 * 
 * */

package Builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		meal.addItem(new ChickenBurger());
		
		
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
	
}