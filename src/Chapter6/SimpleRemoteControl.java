package Chapter6;
public class SimpleRemoteControl{

	Command slot;

	
	public void setCommand(Command slot){
		this.slot=slot;
	}

	public void buttonWasPressed(){
		slot.execute();
	}
}