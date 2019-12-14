package Chapter1;

public abstract class Duck {
	
	 FlyBehavior flybehavior;
	 QuacBehavior quackbehavior;
	
	abstract public void display() ;
	
	public void swim() {
		System.out.println("default swimming!!");
	}
	
	
	public void performFlying() {
		flybehavior.fly();
	}
	
	public void performQuacking() {
		quackbehavior.quack();
	}
	
	

}

