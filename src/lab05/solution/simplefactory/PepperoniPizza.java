package lab05.solution.simplefactory;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "페퍼로니 피자";
		dough = "얇은 크러스트 도우";
		sauce = "마리나라 소스";
		toppings.add("페퍼로니");
		toppings.add("다진양파");
		toppings.add("파마산치즈");
	}
}
