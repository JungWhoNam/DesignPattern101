package lab05.solution.simplefactory;

public class KoreanPizza extends Pizza {
	public KoreanPizza() {
		name = "K-Style 피자";
		dough = "얇은 크러스트 도우";
		sauce = "마리나라 소스";
		toppings.add("모차렐라치즈");
		toppings.add("페퍼로니");
		toppings.add("피망");
		toppings.add("올리브");
		toppings.add("옥수수");
	}

	@Override
	public void box() {
		System.out.println("상자에 담기 (피클 추가)");
	}
}
