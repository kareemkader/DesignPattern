package Chapter6;
public class GarageDoorDownCommand implements Command{
	GarageDoor door;
	public GarageDoorDownCommand(GarageDoor door){
		this.door=door;
	}
	public void execute(){
		door.down();
	}

	public void undo(){
		door.up();
	}
}