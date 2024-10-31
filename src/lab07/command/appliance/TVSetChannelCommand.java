package lab07.command.appliance;

import lab07.appliance.Television;
import lab07.command.Command;

public class TVSetChannelCommand implements Command {
	private Television tv;
	private int channel;

	public TVSetChannelCommand(Television tv, int channel) {
		this.tv = tv;
		this.channel = channel;
	}

	@Override
	public void execute() {
		tv.setChannel(channel);
	}
}