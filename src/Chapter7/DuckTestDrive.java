package Chapter7;
public class DuckTestDrive{
	public static void main(String[] args) {
		Duck mallardDuck=new MullardDuck();
		Turkey wildTurkey=new WildTurkey();
		Duck adapter=new TurkeyAdapter(wildTurkey);

		System.out.println("the Turkey says : ");
		wildTurkey.gobble();
		wildTurkey.fly();

		System.out.println("\nthe duck says : ");
		mallardDuck.quack();
		mallardDuck.fly();

		testDuck(adapter);
		testDuck(mallardDuck);

	}
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}