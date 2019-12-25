package Chapter4;

public class ChicagoIngredientFactory extends PizzaIngredientFactory{

	public Dough createDough(){
		return new ThickCrustDough();
	}

	public Souce createSouce(){
		return new PlumTomatoSouce();
	}

	public Cheese createCheese(){
		return new Mozzarella();
	}

	public Clam creatClam(){
		return new FrozenClam();
	}

	public Pepperoni createPepperoni(){
		return new SlicedPepperoni();

	}

	public Veggies[] createVeggies(){
		Veggies[] veggies={new Garlic(),new Onion()};
		return veggies;
	}

}
