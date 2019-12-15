package Chapter1;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flybehavior=new NoFlying();
		quackbehavior=new Mute();	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i'm a rubber duck");
	}

	
}
