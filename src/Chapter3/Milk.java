package Chapter3;

public class Milk extends Decorator {
	
	public Milk(Beverage beverage){
		super(beverage);
	}

	public String getDescription(){
		return beverage.getDescription()+" , Milk";
	}


	public double cost() throws RuntimeException{
		
		return super.cost()+0.5;
	}

}