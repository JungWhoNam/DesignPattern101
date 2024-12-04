package lab05.starter.simplefactory;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "치즈 피자";
		dough = "얇은 크러스트 도우";
		sauce = "마리나라 소스";
		toppings.add("모차렐라치즈");
		toppings.add("파마산치즈");
	}
	
	public void box() {
		System.out.println("비닐 봉투에 담기");
	}
}
