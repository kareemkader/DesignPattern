package Chapter9;
import java.util.*;
public abstract class MenuComponent implements OperationForMenuComponent{
	 String name;
	 String description;
	 
	 public void add(Component menu){
	 	throw new UnsupportedOperationException();
	 }
	 public void remove(Component menu){
	 	throw new UnsupportedOperationException();
	 }
	 public Component getChild(int i){
	 	throw new UnsupportedOperationException();
	 }
	 // the operation functions 
	 public String getName(){
	 	throw new UnsupportedOperationException();
	 }
	 public String getDescription(){
	 	throw new UnsupportedOperationException();
	 }
	 // public int getPrice(){
	 // 	throw new UnsupportedOperationException();
	 // }
	 // public boolean isVegetarian(){
	 // 	throw new UnsupportedOperationException();
	 // }
	 public void print(){
	 	throw new UnsupportedOperationException();
	 }
}