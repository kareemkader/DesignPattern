package Chapter1;

public abstract class Duck {
	
	FlyBehavior flybehavior;
	QuacBehavior quackbehavior;
	
	 public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public void setQuackbehavior(QuacBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}

	
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

