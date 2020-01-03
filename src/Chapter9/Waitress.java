package Chapter9;
import java.util.*;
public class Waitress{
	public static void main(String[] args) {
		//start creating two menu to test them 
		BreakFastMenu bfMenu=new BreakFastMenu();
		DinnerMenu dMenu=new DinnerMenu();
		//try to get itemList for each of them
		List<MenuItem> bfList=bfMenu.getItemList();
		MenuItem[] dList=dMenu.getItemList();
		//start iterating over each collection to get items of each menu
		for (int i=0;i<bfList.size();i++) {
			System.out.println(bfList.get(i));
		}
		for (int i=0;i<dList.length;i++ ) {
			System.out.println(dList[i]);
		}

	}
}