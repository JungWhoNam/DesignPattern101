package lab07.solution.command.appliance;

import lab07.solution.appliance.CeilingFan;
import lab07.solution.command.Command;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.high();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}
}
