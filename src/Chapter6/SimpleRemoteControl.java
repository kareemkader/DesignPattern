package Chapter6;

import java.util.*;

public class SimpleRemoteControl{

	List<Command> slot;

	
	public void setCommand(Command slots){
		if(slot ==null){
			slot=new ArrayList<>();
		}
		slot.add(slots);
	}

	public void buttonWasPressed(){
		for(Command slo :slot)
			{
				slo.execute();
			}
	}
}