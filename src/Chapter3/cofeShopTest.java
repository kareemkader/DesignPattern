package Chapter3;

public class cofeShopTest{
	public static void main(String[] args) {
		Beverage houseBland=new HouseBland();
		houseBland.setSize(CupSize.LOW);
		System.out.println("the beverage is :"+
			houseBland.getDescription()+" the cost is : "+houseBland.cost());
		Beverage blandWithmilk=new Milk(houseBland);
		System.out.println("the beverage is :"+
			blandWithmilk.getDescription()+" the cost is : "+blandWithmilk.cost());
		
		
	}
}