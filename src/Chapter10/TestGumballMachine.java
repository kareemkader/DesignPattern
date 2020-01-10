package Chapter10;
public class TestGumballMachine{
	public static void main(String[] args) {
		GumballMachine gumballMachine=new GumballMachine(30);

		System.out.println("start testing our machine ");
		for (int i=0;i<10;i++ ) {
			gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine+"\n");
		}

	}
}