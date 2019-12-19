package Chapter3;

public class cofeShopTest{
	public static void main(String[] args) {
		HouseBland housebland=new HouseBland();
		Topic milk=new Milk();
		housebland.addNewTopic("milk",milk);
		System.out.println(housebland.cost());
		housebland.changeStateOfTopic("milk",false);
		System.out.println(housebland.cost());

		housebland.changeStateOfTopic("milk",true);
		System.out.println(housebland.cost());
	}
}