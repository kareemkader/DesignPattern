package Chapter4;

public class NYPizzaStore extends PizzaStore{
	public NYPizzaStore(){
		System.out.println("this pizza from NYPizza Style");
	}
	public Pizza createPizza(String type){
		Pizza pizza;
		switch(type){
			case "cheese":
				 pizza=new CheesePizza();
				break;
			case "classic":
				pizza=new ClassicPizza();
				break;
			case "calm":
				pizza=new CalmPizza();
				break;
			default:
				System.out.println("this type is not valid ");
				pizza=null;
		}
		return pizza;
	}
}