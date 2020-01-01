package Chapter8;
public abstract class Beverage{
	
	public void boilWater(){
		System.out.println("the water is boil");
	}

	public void pourInCup(){
		System.out.println("pouring into cup");
	}

	public abstract void addCondiments();
	public abstract void brew();
	public void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
}