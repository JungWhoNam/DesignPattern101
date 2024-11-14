package lab09.kiosk;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + 우유";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
