package lab07.solution.command.appliance;

import lab07.solution.appliance.Light;
import lab07.solution.command.Command;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

	public static void main(String[] args) {
		Light light = new Light("거실");
		Command ligthOn = new LightOnCommand(light);
		ligthOn.execute();
	}
}
