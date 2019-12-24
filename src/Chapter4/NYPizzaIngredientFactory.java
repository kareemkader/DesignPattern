package Chapter4;

public class NYPizzaIngredientFactory extends PizzaIngredientFactory{

	public Dough createDough(){
		return new ThinCrustDough();
	}

	public Souce createSouce(){
		return new MarinaraSouce();
	}

	public Cheese createCheese(){
		return new ReggianoCheese();
	}

	public Clam creatClam(){
		return new FreshClam();
	}

	public Pepperoni createPepperoni(){
		return new SlicedPepperoni();

	}

	public Veggies[] createVeggies(){
		Veggies[] veggies={new Garlic(),new Onion()};
		return veggies;
	}

}
