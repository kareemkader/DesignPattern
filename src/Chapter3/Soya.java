package Chapter3;

public class Soya extends Decorator{

	public Soya(Beverage beverage){
		this.beverage=beverage;
	}

	public String getDescription(){
		return beverage.getDescription()+" , Soya";
	}

	public double cost() throws RuntimeException{
		double price=0.0;
		CupSize size=beverage.getSize();
		switch(size){
			case SMALL:
				price=0.5;
				break;
			case MEDUIM:
				price=0.6;
				break;
			case LARGE:
				price=0.7;
				break;
			default:
				throw new RuntimeException("this size not avaliable");
		}
		System.out.println(size);
		
		return price+beverage.cost();
	}

}