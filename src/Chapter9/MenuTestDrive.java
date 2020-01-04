package Chapter9;
public class MenuTestDrive{
	public static void main(String[] args) {
		BreakFastMenu bfMenu=new BreakFastMenu();
		DinnerMenu dMenu=new DinnerMenu();
		Waitress waitress=new Waitress(bfMenu,dMenu);
		waitress.printMenu();
		
	}
}