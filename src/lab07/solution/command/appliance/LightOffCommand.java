package lab07.solution.command.appliance;

import lab07.solution.appliance.Light;
import lab07.solution.command.Command;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

	public static void main(String[] args) {
		Light light = new Light("거실");
		Command lightOff = new LightOffCommand(light);
		lightOff.execute();
	}
}
