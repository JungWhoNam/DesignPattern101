package lab05.starter.simplefactory;

public class Test {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
