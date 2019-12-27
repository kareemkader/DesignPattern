package Chapter6;

public class RemoteControl{
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl(){
		onCommands=new Command[3];
		offCommands=new Command[3];
		}

		public void setCommand(int slot,Command onCommand,Command offCommand){
			onCommands[slot]=onCommand;
			offCommands[slot]=offCommand;
		}

		public void onButtonWasPushed(int slot){
			onCommands[slot].execute();
		}

		public void offButtonWasPushed(int slot){
			offCommands[slot].execute();
		}

		public String toString(){
			StringBuffer buffer=new StringBuffer();
			buffer.append("\n------ Remote Conrol --------\n");
			for(int i=0;i<onCommands.length;i++){
				buffer.append("[slot "+ i + "] " + onCommands[i].getClass().getName()
+ " "+ offCommands[i].getClass().getName() + "\n");
			}
			return buffer.toString();
		}
}