package Chapter10;
public class TestGumballMachine{
	public static void main(String[] args) {
		int count=0;
		if(args.length<2){
			System.out.println("shitty things occured");
			System.exit(1);
		}
		count=Integer.parseInt(args[1]);
		GumballMachine gumballMachine=new GumballMachine(count,args[0]);
		GumballMonitor gumballMonitor=new GumballMonitor(gumballMachine);

		System.out.println("start testing our machine ");
		for (int i=0;i<10;i++ ) {
			gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine+"\n");
		}

		// print the report for ceo 
		gumballMonitor.report();
	}
}