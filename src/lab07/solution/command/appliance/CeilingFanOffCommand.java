package lab07.solution.command.appliance;

import lab07.solution.appliance.CeilingFan;
import lab07.solution.command.Command;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}
	
	@Override
	public void undo() {
		ceilingFan.high();
	}
}
