package lab09.starter.beverage;

public class BeverageTestDrive {
	public static void main(String[] args) {
		System.out.println("\n===================");
		System.out.println("티 만들기:");
		CaffeineBeverageWithHook tea = new TeaWithHook();
		tea.prepareRecipe();

		System.out.println("\n===================");
		System.out.println("커피 만들기:");
		CaffeineBeverageWithHook coffee = new CoffeeWithHook();
		coffee.prepareRecipe();
	}
}
