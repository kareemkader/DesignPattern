package Chapter9;
import java.util.*;
import java.util.Iterator;
public class DinnerMenu{
	public MenuItem[] items;
	private static final int MAXSIZE=6;
	private int numeberOfItem=0;

	public DinnerMenu(){
		items=new MenuItem[MAXSIZE];
		addItem("steak","piece of meat",20,false);
		addItem("cesar salad","more healthy",10,true);
	}
	public void addItem(String name,String descreption,int cost,boolean vegeterian){
		MenuItem item=new MenuItem(name,descreption,cost,vegeterian);
		if(numeberOfItem>=MAXSIZE){
			System.err.println("sorry there is no space enough in the array");

		}else{
			items[numeberOfItem]=item;
			numeberOfItem++;
		}
	}
	public Iterator getIterator(){
		return new DinnerMenuIterator(items);
	}
}