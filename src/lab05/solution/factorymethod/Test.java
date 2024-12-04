package lab05.solution.factorymethod;

public class Test {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore koreanStore = new KoreanPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		
		pizza = koreanStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
