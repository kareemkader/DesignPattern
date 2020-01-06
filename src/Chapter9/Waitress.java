package Chapter9;
import java.util.*;
import java.util.Iterator;
public class Waitress{
	MenuComponent allMenus;
	
	public Waitress(MenuComponent menu){
		this.allMenus=menu;
	}
	
	public void printMenu(){
		allMenus.print();
	}

	public void printVegetarianMenu(){
		Iterator iterator=allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while(iterator.hasNext()){
			MenuComponent component=(MenuComponent)iterator.next();
			try{
				if(component.isVegetarian()){
					component.print();
				}
			}catch(UnsupportedOperationException e){
				
			}

		}
	}
}
