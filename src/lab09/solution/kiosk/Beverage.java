package lab09.solution.kiosk;

public abstract class Beverage implements Comparable<Beverage>{
	public String description = "제목 없음";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
	
	@Override
	public int compareTo(Beverage other) {
		if (this.cost() < other.cost()) {
			return -1;
		} else if (this.cost() == other.cost()) {
			return 0;
		} else { // this.cost() > other.cost()
			return 1;
		}
	}
}
