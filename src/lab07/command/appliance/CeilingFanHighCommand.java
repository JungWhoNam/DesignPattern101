package lab07.command.appliance;

import lab07.appliance.CeilingFan;
import lab07.command.Command;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.high();
	}
}
