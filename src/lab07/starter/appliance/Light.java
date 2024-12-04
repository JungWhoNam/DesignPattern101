package lab07.starter.appliance;

public class Light {
	private String location = "";

	public Light(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void on() {
		System.out.println(location + " 조명이 켜졌습니다.");
	}

	public void off() {
		System.out.println(location + " 조명이 꺼졌습니다.");
	}

	public static void main(String[] args) {
		Light light0 = new Light("거실");
		light0.on();
		light0.off();

		Light light1 = new Light("주방");
		light1.on();
		light1.off();
	}
}
