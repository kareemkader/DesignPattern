package Chapter9;
public class MenuTestDrive{
	public static void main(String[] args) {
		MenuComponent headMenu=new Menu("All menus","All menus Combined");
		MenuComponent dinerMenu=new Menu("DINER MENU","Lunch");
		MenuComponent breakFast=new Menu("Break fast","for break fast");
		// create Menu Item now
		MenuItemComponent steak=new MenuItem("meat","meat steak",2,false);
		MenuItemComponent pate=new MenuItem("sweet bread","eat it with cafe",5,true);
		
		dinerMenu.add(steak);
		breakFast.add(pate);
		headMenu.add(dinerMenu);
		headMenu.add(breakFast);

		Waitress waitress=new Waitress(headMenu);
		waitress.printMenu();

	}
}