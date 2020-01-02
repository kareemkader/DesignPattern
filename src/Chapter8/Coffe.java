package Chapter8;

import java.io.*;
public class Coffe extends Beverage{
	

	
	public void brew(){
		System.out.println("Dripping coffe through filter");
	}
	
	public void addCondiments(){
		System.out.println("adding sugar and milk ");
	}

	public boolean customerWantsCondiments(){

		String answer=getUserInput();
		
		return (answer.toLowerCase().startsWith("y")?true:false);
	}
	
	public String getUserInput(){
		String answer=null;
	BufferedReader readeer=new BufferedReader(new InputStreamReader(System.in));
	try
	{
		System.out.println("would you like milk and sugar with your coffe (y/n) ?");

		answer=readeer.readLine();


	}	
	catch(Exception e){
		e.printStackTrace();
	}
	return (answer==null?"no":answer);	
	}
}