package lab09.solution.kiosk;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "하우스 블렌드 커피";
	}

	@Override
	public double cost() {
		return .89;
	}
}