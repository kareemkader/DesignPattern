package Chapter6;
public class GarageDoorUpCommand implements Command{
	GarageDoor door;
	public GarageDoorUpCommand(GarageDoor door){
		this.door=door;
	}
	public void execute(){
		door.up();
	}

	public void undo(){
		door.down();
	}
}