package Chapter9;
public abstract class MenuItemComponent implements OperationforItemComponent{
	String name;
	String description;
	public String getName(){
	 	throw new UnsupportedOperationException();
	 }
	 public String getDescription(){
	 	throw new UnsupportedOperationException();
	 }
	 public int getPrice(){
	 	throw new UnsupportedOperationException();
	 }
	 public boolean isVegetarian(){
	 	throw new UnsupportedOperationException();
	 }
	 public void print(){
	 	throw new UnsupportedOperationException();
	 }

}