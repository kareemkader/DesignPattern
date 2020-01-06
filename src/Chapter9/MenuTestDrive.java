package Chapter9;
public class MenuTestDrive{
	public static void main(String[] args) {
		Component headMenu=new Menu("All menus","All menus Combined");
		Component dinerMenu=new Menu("DINER MENU","Lunch");
		Component breakFast=new Menu("Break fast","for break fast");
		// create Menu Item now
		Component steak=new MenuItem("meat","meat steak",2,false);
		Component pate=new MenuItem("sweet bread","eat it with cafe",5,true);
		
		dinerMenu.add(steak);
		breakFast.add(pate);
		headMenu.add(dinerMenu);
		headMenu.add(breakFast);

		Waitress waitress=new Waitress(headMenu);
		waitress.printMenu();

	}
}