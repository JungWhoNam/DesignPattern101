package lab08;

public class PilotDroneAdapter implements Duck {
	Pilot pilot;
	Drone drone;

	public PilotDroneAdapter(Pilot pilot, Drone drone) {
		this.pilot = pilot;

		this.drone = drone;
	}

	@Override
	public void quack() {
		pilot.introduce();

		drone.beep();
	}

	@Override
	public void fly() {
		pilot.prepare();
		pilot.fly();

		drone.spin_rotors();
		drone.take_off();
	}
}
