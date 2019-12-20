package Chapter3;

public class Milk extends Decorator {
	
	public Milk(Beverage beverage){
		this.beverage=beverage;
	}

	public String getDescription(){
		return beverage.getDescription()+" , Milk";
	}

	public double cost(){
		return 0.2+beverage.cost();
	}

}