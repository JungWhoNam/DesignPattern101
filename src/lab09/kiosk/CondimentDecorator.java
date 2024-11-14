package lab09.kiosk;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;

	public abstract String getDescription();
}
