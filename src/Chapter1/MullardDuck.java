package Chapter1;

public class MullardDuck extends Duck {
	
	 public MullardDuck() {
		flybehavior=new FlyWithNoWings();
		quackbehavior=new Sqezzing();
		}
	 
	 
	@Override
	public void display() {
		System.out.println("i'm a mullardDuck");
	}

}
