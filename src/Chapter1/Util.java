package Chapter1;

public class Util {
	public FlyBehavior changeFlyBehavior(FlyBehaviorList behavior) throws Exception {
		switch (behavior) {
		case FLYING:
			
			return new FlyWithNoWings();
			
		case NOFLYING:
			
			return new NoFlying();
			
		default:
			throw new Exception("no avaliable behavior");
		}
	}
	
	public QuacBehavior changeQuackBehavior(QuackBehavoirList behavior) throws Exception {
		switch (behavior) {
		case MUTETED :
			
			return new Mute();
		case SQUEEZ:
			return new Sqezzing();

		default:
			throw new Exception("no avaliable behavior");
		}
	}
}
