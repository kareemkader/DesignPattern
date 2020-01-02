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
	/*
		this is the hook method so subclasses can now change the algorithm behavoir by implement its own conditional behavoir 
	*/
	public boolean customerWantsCondiments(){
		return true ;
	}
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
}