package lab07.command.appliance;

import lab07.appliance.Light;
import lab07.command.Command;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	public static void main(String[] args) {
		Light light = new Light("거실");
		Command lightOff = new LightOffCommand(light);
		lightOff.execute();
	}
}
