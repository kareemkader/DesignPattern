package Chapter1;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck redduck=new RedHeadDuck();
		Util util=new Util();
		
		
		redduck.performFlying();//test init setting for fly behavior
		redduck.performQuacking();//test init setting for quacking behavior
		try {
			redduck.setFlybehavior(util.changeFlyBehavior(FlyBehaviorList.FLYING));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//change fly behavoir
		redduck.performFlying();//test new value of fly behavior
	}

}
