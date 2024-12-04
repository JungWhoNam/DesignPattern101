package lab09.solution.kiosk;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;

	public abstract String getDescription();
}
