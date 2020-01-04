package Chapter9;
import java.util.*;
import java.util.Iterator;
public class Waitress{
	Menu bfMenu;
	Menu dMenu;
	Menu cMenu;
	public Waitress(Menu bfMenu,Menu dMenu,Menu cMenu){
		this.bfMenu=bfMenu;
		this.dMenu=dMenu;
		this.cMenu=cMenu;
	}
	public void printMenu(){
		Iterator bfIterator=bfMenu.getIterator();
		Iterator dIterator=dMenu.getIterator();
		Iterator cIterator=cMenu.getIterator();
		System.out.println("\nMenu\n------\nBreakFast\n");
		printMenu(bfIterator);
		System.out.println("\nMenu\n------\nDiner\n");
		printMenu(dIterator);
		System.out.println("\nMenu\n------\nCafe\n");
		printMenu(cIterator);
	}
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem item=(MenuItem) iterator.next();
			System.out.println(item);
		}
	}
}
