package lab08.solution;

public class FlyableDrone implements Drone {
	@Override
	public void beep() {
		System.out.println("드론: 삐빅 삐빅 삐빅");
	}

	@Override
	public void spin_rotors() {
		System.out.println("드론: 로터가 회전 중입니다.");
	}

	@Override
	public void take_off() {
		System.out.println("드론: 이륙합니다!!");
	}
}
