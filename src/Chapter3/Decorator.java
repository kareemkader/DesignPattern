package Chapter3;

public abstract class Decorator extends Beverage{
	Beverage beverage;
	public Decorator(Beverage beverage){
		this.beverage=beverage;
	}
	public abstract String getDescription(); 

	public double cost() throws RuntimeException{
		double CupPrice=0.0;
		CupSize size=beverage.getSize();
		switch(size){
			case SMALL:
				CupPrice=0.1;
				break;
			case MEDUIM:
				CupPrice=0.2;
				break;
			case LARGE:
				CupPrice=0.3;
				break;
			default:
				throw new RuntimeException("this size not avaliable");
		}
		System.out.println(size);
		return CupPrice+beverage.cost();
	}
}