package lab05.starter.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "시카고 스타일 딥 디쉬 치즈 피자";
		dough = "아주 두꺼운 크러스트 도우";
		sauce = "플럼토마토 소스";

		toppings.add("모짜렐라 치즈");
	}

	public void cut() {
		System.out.println("네모난 모양으로 자르기");
	}

	public void box() {
		System.out.println("비닐 봉투에 담기");
	}
}
