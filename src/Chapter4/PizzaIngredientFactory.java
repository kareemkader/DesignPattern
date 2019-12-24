package Chapter4;

public interface PizzaIngredientFactory{

	public Dough createDough();
	public Souce createSouce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Clam createClam();
	public Pepperoni createPepperoni();
}