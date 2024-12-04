package lab05.solution.factorymethod;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "뉴욕 스타일 페퍼로니 피자";
		dough = "얇은 크러스트 도우";
		sauce = "마리나라 소스";

		toppings.add("레지아노치즈");
		toppings.add("페퍼로니");
	}
}
