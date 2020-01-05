package Chapter9;
import java.util.*;
import java.util.Iterator;
public class Waitress{
	// Menu bfMenu;
	// Menu dMenu;
	// Menu cMenu;
	private Map<String,Menu> menusList;

	public Waitress(Map<String,Menu> menusList){
		this.menusList=menusList;
		
	}

	public Waitress(){
		menusList=null;
	}

	public void addMenuToList(String name,Menu newMenu){
		if(menusList==null){
			menusList=new HashMap<>();
		}
		menusList.put(name,newMenu);
	}
	public void printMenus(){
		Iterator iterator=menusList.values().iterator();
		while(iterator.hasNext()){
			Menu menu=(Menu)iterator.next();
			printMenu(menu);
		}

	}
	public void printMenu(Menu menu){
		// Iterator bfIterator=bfMenu.getIterator();
		// Iterator dIterator=dMenu.getIterator();
		// Iterator cIterator=cMenu.getIterator();
		// System.out.println("\nMenu\n------\nBreakFast\n");
		// printMenu(bfIterator);
		// System.out.println("\nMenu\n------\nDiner\n");
		// printMenu(dIterator);
		// System.out.println("\nMenu\n------\nCafe\n");
		Iterator iterator=menu.getIterator();
		printMenuItem(iterator);
	}
	public void printMenu(String name){
		Menu menu=menusList.get(name);
		printMenu(menu);
	}
	private void printMenuItem(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem item=(MenuItem) iterator.next();
			System.out.println(item);
		}
	}
}
