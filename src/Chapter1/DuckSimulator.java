package Chapter1;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck redduck=new RedHeadDuck();
		redduck.performFlying();//test init setting for fly behavior
		redduck.performQuacking();//test init setting for quacking behavior
		redduck.setFlybehavior(new FlyWithNoWings());//change fly behavoir
		redduck.performFlying();//test new value of fly behavior
	}

}
