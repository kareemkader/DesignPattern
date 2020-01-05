package Chapter9;
import java.util.*;
public class MenuTestDrive{
	public static void main(String[] args) {
		BreakFastMenu bfMenu=new BreakFastMenu();
		DinnerMenu dMenu=new DinnerMenu();
		CafeMenu cMenu=new CafeMenu();
		Map<String,Menu> list=new HashMap<>();
		list.put(bfMenu.name,bfMenu);
		list.put(dMenu.name,dMenu);
		list.put(cMenu.name,cMenu);
		
		Waitress waitress=new Waitress(list);
		waitress.printMenus();
		waitress.printMenu("BreakFastMenu");
	}
}