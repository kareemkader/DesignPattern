package Chapter3;

public class Soya extends Decorator{

	public Soya(Beverage beverage){
		super(beverage);
	}

	public String getDescription(){
		return beverage.getDescription()+" , Soya";
	}

	public double cost() throws RuntimeException{
		return super.cost()+0.5;
	}

}