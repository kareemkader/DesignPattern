package Chapter4;
public class CheesePizza extends Pizza{
	PizzaIngredientFactory IngredientFactory;
	public CheesePizza(PizzaIngredientFactory IngredientFactory){
		this.type="Cheese";
		this.IngredientFactory=IngredientFactory;
	}

	public void prepare(){
		System.out.println("preparing " + name);
	dough = ingredientFactory.createDough();
	sauce = ingredientFactory.createSauce();
	cheese = ingredientFactory.createCheese();
	clam = ingredientFactory.createClam();
	
	}
}