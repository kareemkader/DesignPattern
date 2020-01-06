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
}
