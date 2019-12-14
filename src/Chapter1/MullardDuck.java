package Chapter1;

public class MullardDuck extends Duck implements Quackable,Flyable{

	@Override
	public void display() {
		System.out.println("i'm a mullardDuck");
	}

	@Override
	public void fly() {
		System.out.println("i can fly");
	}

	@Override
	public void quack() {
		System.out.println("quiiick quiiiick");
	}
}
