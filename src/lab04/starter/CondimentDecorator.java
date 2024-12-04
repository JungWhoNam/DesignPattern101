package lab04.starter;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;

	@Override
	public abstract String getDescription();
}
