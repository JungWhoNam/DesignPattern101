package lab07.starter.appliance;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	private String location = "";
	private int level;

	public CeilingFan(String location) {
		this.location = location;
	}

	public void high() {
		level = HIGH;
		System.out.println(location + " 선풍기 속도가 HIGH로 설정되었습니다.");
	}

	public void medium() {
		level = MEDIUM;
		System.out.println(location + " 선풍기 속도가 MEDIUM으로 설정되었습니다.");
	}

	public void low() {
		level = LOW;
		System.out.println(location + " 선풍기 속도가 LOW로 설정되었습니다.");
	}

	public void off() {
		level = OFF;
		System.out.println(location + " 선풍기가 꺼졌습니다.");
	}

	public String getLocation() {
		return location;
	}

	public int getSpeed() {
		return level;
	}

	public static void main(String[] args) {
		CeilingFan fan0 = new CeilingFan("거실");
		fan0.high();
		fan0.off();

		CeilingFan fan1 = new CeilingFan("주방");
		fan1.low();
		fan1.off();
	}
}
