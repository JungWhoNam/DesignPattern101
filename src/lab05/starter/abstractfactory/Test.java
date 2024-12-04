package lab05.starter.abstractfactory;

public class Test {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단이 주문한 " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘이 주문한 " + pizza + "\n");
	}
}
