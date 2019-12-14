package Chapter1;

public class RedHeadDuck extends Duck implements Quackable,Flyable{

	@Override
	public void display() {
		System.out.println("i'm a RedHeadDuck");
	}

	@Override
	public void fly() {
		System.out.println("i can fly");
	}

	@Override
	public void quack() {
		System.out.println("quaaaaaaack");
	}
}
