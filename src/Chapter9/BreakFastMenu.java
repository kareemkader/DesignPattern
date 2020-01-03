package Chapter9;
import java.util.*;
public class BreakFastMenu{
	private List<MenuItem> items;
	public BreakFastMenu(){
		items=new ArrayList<>();
		addItem("panecake","delcious",5,true);
		addItem("pizza","more faty",10,false);
	}

	public List<MenuItem> getItemList(){
		return items;
	}

	public void addItem(String name,String descreption,int cost,boolean vegeterian){
		MenuItem item=new MenuItem(name,descreption,cost,vegeterian);
		items.add(item);
	}
	// more another methods go here


}