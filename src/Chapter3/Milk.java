package Chapter3;

public class Milk extends Decorator {
	
	public Milk(Beverage beverage){
		this.beverage=beverage;
	}

	public String getDescription(){
		return beverage.getDescription()+" , Milk";
	}

	public double cost() throws RuntimeException{
		double price=0.0;
		CupSize size=beverage.getSize();
		switch(size){
			case SMALL:
				price=0.1;
				break;
			case MEDUIM:
				price=0.2;
				break;
			case LARGE:
				price=0.3;
				break;
			default:
				throw new RuntimeException("this size not avaliable");
		}
		System.out.println(size);
		return price+beverage.cost();
	}

}