package Chapter4;

public abstract class PizzaStore{
	
	
	public Pizza orderPizza(String type){
		Pizza pizza;

		pizza=createPizza(type);
		
		/*
		those methods dirr from style to another
		so we need make them flixiable to be changeable 
		with requirments.
		*/
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	public abstract Pizza createPizza(String type);
}