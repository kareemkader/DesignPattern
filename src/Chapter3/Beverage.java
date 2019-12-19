package Chapter3;
import java.util.*;

public class Beverage{
	// private boolean milk,soy,mocha,whip;
	private Map<String,Topic> additions;
	private String description;
	
	public Beverage() {
		additions=new HashMap<>();
	}
	
	public Map<String,Topic> getAdditions(){
		return additions;
	}

	public void setAddiotions(Map<String,Topic> ad){
		additions=ad;
	}

	public void addNewTopic(String key,Topic topic){
		additions.put(key,topic);
	}

	public void removeTopic(String key){
		additions.remove(key);
	}

	public void setDescription(String desc){
		description=desc;
	}


	public String getDescription(){
		return description;
	}



// 	public void setMilk(){
// 		milk=true;
// 	}

// 	public boolean hasMilk(){
// 		return milk;

// 	}
// public void setSoy(){
// 		soy=true;
// 	}

// 	public boolean hasSoy(){
// 		return soy;

// 	}

// 	public void setMocha(){
// 		mocha=true;
// 	}

// 	public boolean hasMocha(){
// 		return mocha;

// 	}

// 	public void setWhip(){
// 		whip=true;
// 	}

// 	public boolean hasWhip(){
// 		return whip;

// 	}

	public float cost(){
		float result=0;
		for (Map.Entry<String, Topic> entry : additions.entrySet()) {
    
    	Topic topic= entry.getValue();
    	if(topic.getState()) result+=topic.getPrice();
    
		}
		return result;
	}
	}