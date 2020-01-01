package Chapter8;
public class TestDrive{
	public static void main(String[] args) {
		System.out.println("\nstart making the coffe !!");
		Coffe coffe=new Coffe();
		coffe.prepareRecipe();
		System.out.println("\nstart making the tea");
		Tea tea=new Tea();
		tea.prepareRecipe();

	}
}