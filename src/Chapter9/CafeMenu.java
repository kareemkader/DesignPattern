package Chapter9;
import java.util.*;
import java.util.Iterator;
public class CafeMenu implements Menu{
	private Map<String,MenuItem> items;
	public CafeMenu(){
		items=new Hashtable<>();
		addItem("cafe normal","delcious",5,true);
		addItem("cappiciono","more faty",10,false);
	}

	public Iterator getIterator(){
		return items.values().iterator();
	}

	public void addItem(String name,String descreption,int cost,boolean vegeterian){
		MenuItem item=new MenuItem(name,descreption,cost,vegeterian);

		items.put(name,item);
	}
	// more another methods go here


}