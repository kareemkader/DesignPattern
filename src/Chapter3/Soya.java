package Chapter3;

public class Soya extends Decorator{

	public Soya(Beverage beverage){
		this.beverage=beverage;
	}

	public String getDescription(){
		return beverage.getDescription()+" , Soya";
	}

	public double cost(){
		return beverage.cost()+0.5;
	}
}