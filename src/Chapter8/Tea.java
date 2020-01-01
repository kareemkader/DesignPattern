package Chapter8;
public class Tea{
	

	public void boilWater(){
		System.out.println("the water is boil");
	}

	public void steepTeaBag(){
		System.out.println("Steeping the Tea");
	}

	public void pourInCup(){
		System.out.println("pouring into cup");
	}

	public void addLimon(){
		System.out.println("adding limon ");
	}
	
	public void prepareRecipe(){
		boilWater();
		steepTeaBag();
		pourInCup();
		addLimon();
	}

}