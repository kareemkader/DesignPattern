package Chapter4;

public class TestPizzaStore{
	public static void main(String[] args) {
		PizzaStore store=new PizzaStore(new SimplePizzaFactory());
		store.orderPizza("cheese");
	}
}