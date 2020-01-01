package Chapter8;
public class Coffe{
	

	public void boilWater(){
		System.out.println("the water is boil");
	}
	public void brewCoffe(){
		System.out.println("Dripping coffe through filter");
	}
	public void pourInCup(){
		System.out.println("pouring into cup");
	}
	public void addSugarAndMilk(){
		System.out.println("adding sugar and milk ");
	}

	public void prepareRecipe(){
		boilWater();
		brewCoffe();
		pourInCup();
		addSugarAndMilk();
	}
}