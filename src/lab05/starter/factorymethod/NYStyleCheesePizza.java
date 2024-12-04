package lab05.starter.factorymethod;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "뉴욕 스타일 치즈 피자";
		dough = "얇은 크러스트 도우";
		sauce = "마리나라 소스";

		toppings.add("레지아노치즈");
	}
	
	public void box() {
		System.out.println("비닐 봉투에 담기");
	}
}
