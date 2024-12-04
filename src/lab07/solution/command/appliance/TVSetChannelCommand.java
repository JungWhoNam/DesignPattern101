package lab07.solution.command.appliance;

import lab07.solution.appliance.Television;
import lab07.solution.command.Command;

public class TVSetChannelCommand implements Command {
	private Television tv;
	private int channel;

	private int prevChannel;

	public TVSetChannelCommand(Television tv, int channel) {
		this.tv = tv;
		this.channel = channel;
	}

	@Override
	public void execute() {
		prevChannel = tv.getChannel();
		tv.setChannel(channel);
	}

	@Override
	public void undo() {
		tv.setChannel(prevChannel);
	}
}