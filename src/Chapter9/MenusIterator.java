package Chapter9;
import java.util.*;
import java.util.Iterator;
public class MenusIterator implements Menu{
	private Map<String,Menu> menusList;
	public void add(String menuName,Menu menu){
		if(menusList==null){
			menusList=new HashMap<>();
		}
		menusList.put(menuName,menu);
	}

	public Iterator getIterator(){
		return menusList.values().iterator();
	}

}