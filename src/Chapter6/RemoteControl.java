package Chapter6;
import java.util.*;

public class RemoteControl{
	Command[] onCommands;
	Command[] offCommands;
	Stack<Command> undoCommand;
	NoCommand noCommand;
	public RemoteControl(){
		onCommands=new Command[7];
		offCommands=new Command[7];
		undoCommand=new Stack<>();
		noCommand=new NoCommand();
		for(int i=0;i<7;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		undoCommand.push(noCommand);
		}

		public void setCommand(int slot,Command onCommand,Command offCommand){
			onCommands[slot]=onCommand;
			offCommands[slot]=offCommand;
		}

		public void onButtonWasPushed(int slot){
			onCommands[slot].execute();
			undoCommand.push(onCommands[slot]);
		}

		public void offButtonWasPushed(int slot){
		
			offCommands[slot].execute();
			undoCommand.push(offCommands[slot]);
		}

		public void undoing(){
			undoCommand.pop().undo();
		}

		public String toString(){
			StringBuffer buffer=new StringBuffer();
			buffer.append("\n------ Remote Conrol --------\n");
			for(int i=0;i<onCommands.length;i++){
				buffer.append("[slot "+ i + "] " + onCommands[i].getClass().getName()
+ " "+ offCommands[i].getClass().getName() + "\n");
			}
			buffer.append("[undo] "+undoCommand.pop().getClass().getName()+"\n \n");
			undoCommand.forEach(element->buffer.append("undo OBject: "+element.getClass().getName()));
			return buffer.toString();
		}
}