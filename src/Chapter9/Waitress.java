package Chapter9;
import java.util.*;
import java.util.Iterator;
public class Waitress{
	Menu bfMenu;
	Menu dMenu;
	public Waitress(Menu bfMenu,Menu dMenu){
		this.bfMenu=bfMenu;
		this.dMenu=dMenu;
	}
	public void printMenu(){
		Iterator bfIterator=bfMenu.getIterator();
		Iterator dIterator=dMenu.getIterator();
		System.out.println("Menu\n------\nBreakFast");
		printMenu(bfIterator);
		System.out.println("Menu\n------\nDiner");
		printMenu(dIterator);
	}
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem item=(MenuItem) iterator.next();
			System.out.println(item);
		}
	}
}
