package lab09.solution.kiosk;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "다크로스트 커피";
	}

	@Override
	public double cost() {
		return .99;
	}
}
