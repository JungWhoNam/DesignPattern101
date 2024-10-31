package lab07.invoker;

import lab07.command.Command;
import lab07.command.NoCommand;

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
