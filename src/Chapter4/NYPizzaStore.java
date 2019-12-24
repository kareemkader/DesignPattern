package Chapter4;

public class NYPizzaStore extends PizzaStore{
	public NYPizzaStore(){
		System.out.println("this pizza from NYPizza Style");
	}
	public Pizza createPizza(String type){
		Pizza pizza;
		PizzaIngredientFactory ingredientFactory =
						new NYPizzaIngredientFactory();
		switch(type){
			case "cheese":
				 pizza=new CheesePizza(ingredientFactory);
				break;
			case "classic":
				pizza=new ClassicPizza(ingredientFactory);
				break;
			case "calm":
				pizza=new CalmPizza(ingredientFactory);
				break;
			default:
				System.out.println("this type is not valid ");
				pizza=null;
		}
		return pizza;
	}
}