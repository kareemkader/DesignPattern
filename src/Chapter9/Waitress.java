package Chapter9;
import java.util.*;
public class Waitress{
	public static void main(String[] args) {
		//start creating two menu to test them 
		BreakFastMenu bfMenu=new BreakFastMenu();
		DinnerMenu dMenu=new DinnerMenu();
		//try to get itemList for each of them
		Iterator bfList=bfMenu.getIterator();
		Iterator dList=dMenu.getIterator();
		//start iterating over each collection to get items of each menu
		// for (int i=0;i<bfList.size();i++) {
		// 	System.out.println(bfList.get(i));
		// }
		// for (int i=0;i<dList.length;i++ ) {
		// 	System.out.println(dList[i]);
		// }

		while(bfList.hasNext()){
			MenuItem item=(MenuItem) bfList.next();
			System.out.println(item);
		}

		while(dList.hasNext()){
			MenuItem item=(MenuItem) dList.next();
			System.out.println(item);
		}

	}
}