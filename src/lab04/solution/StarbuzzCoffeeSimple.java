package lab04.solution;

public class StarbuzzCoffeeSimple {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + ", $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + ", $" + beverage2.cost());

		Beverage beverage3 = new Whip(new Mocha(new Soy(new Decaf())));
		System.out.println(beverage3.getDescription() + ", $" + beverage3.cost());

//		예상 결과
//		에스프레소, $1.99
//		다크로스트 커피 + 모카 + 휘핑크림, $1.29
//		디카페인 커피 + 두유 + 모카 + 휘핑크림, $1.5
	}
}
