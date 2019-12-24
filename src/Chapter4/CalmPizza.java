package Chapter4;
public class CalmPizza extends Pizza{
PizzaIngredientFactory IngredientFactory;
	public CalmPizza(PizzaIngredientFactory IngredientFactory){
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