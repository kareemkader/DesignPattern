package Chapter9;
public interface OperationForMenuComponent extends Component{

	public void add(Component menu);
	public void remove(Component menu);
	public Component getChild(int i);
}