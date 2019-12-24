package Chapter4;
public class ClassicPizza extends Pizza{
PizzaIngredientFactory IngredientFactory;
	public ClassicPizza(PizzaIngredientFactory IngredientFactory){
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