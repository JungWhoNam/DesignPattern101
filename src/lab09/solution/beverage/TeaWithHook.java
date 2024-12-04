package lab09.solution.beverage;

public class TeaWithHook extends CaffeineBeverageWithHook {
	@Override
	public void brew() {
		System.out.println("찻잎을 우려내는 중");
	}

	@Override
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중");
	}

	@Override
	public boolean customerWantsCondiments() {
		return false;
	}
}
