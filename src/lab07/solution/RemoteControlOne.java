package lab07.solution;

import lab07.solution.command.Command;
import lab07.solution.command.NoCommand;

public class RemoteControlOne {
	Command slot;

	public RemoteControlOne() {
		slot = new NoCommand();
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

	public void undoButtonWasPressed() {
		slot.undo();
	}
}
