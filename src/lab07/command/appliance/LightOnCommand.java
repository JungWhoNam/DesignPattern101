package lab07.command.appliance;

import lab07.appliance.Light;
import lab07.command.Command;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	public static void main(String[] args) {
		Light light = new Light("거실");
		Command ligthOn = new LightOnCommand(light);
		ligthOn.execute();
	}
}
