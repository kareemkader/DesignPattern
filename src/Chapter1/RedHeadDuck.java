package Chapter1;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flybehavior=new NoFlying();
		quackbehavior=new Mute();	}
	
	@Override
	public void display() {
		System.out.println("i'm a RedHeadDuck");
	}

}
