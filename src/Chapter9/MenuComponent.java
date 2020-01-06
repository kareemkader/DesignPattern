package Chapter9;
import java.util.Iterator;
import java.util.*;
public abstract class MenuComponent{
	 String name;
	 String description;
	 
	 public void add(MenuComponent menu){
	 	throw new UnsupportedOperationException();
	 }
	 public void remove(MenuComponent menu){
	 	throw new UnsupportedOperationException();
	 }
	 public MenuComponent getChild(int i){
	 	throw new UnsupportedOperationException();
	 }
	 // the operation functions 
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
	 public Iterator createIterator(){
	 	throw new UnsupportedOperationException();
	 }
}