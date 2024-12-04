package lab05.solution.factorymethod;

public class KoreanPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new KoreanStyleCheesePizza();
		} else if (item.equals("pepperoni")) {
			return new KoreanStylePepperoniPizza();
		} else
			return null;
	}
}
