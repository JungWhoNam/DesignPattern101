package lab07.solution.appliance;

public class Television {
	public static final int MIN_CHANNEL = 0;
	public static final int MAX_CHANNEL = 30;

	private int channel;

	public Television() {
	}

	public void setChannel(int channel) {
		if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
			throw new IllegalArgumentException("Invalid argument: " + channel);
		}

		this.channel = channel;

		System.out.println("TV 채널이 " + channel + "번으로 설정되었습니다.");
	}

	public int getChannel() {
		return channel;
	}

	public static void main(String[] args) {
		Television tv = new Television();
		tv.setChannel(0);
		tv.setChannel(1);
		tv.setChannel(2);
		tv.setChannel(10);

		// tv.setChannel(-1); // 에러 발생
		// tv.setChannel(31); // 에러 발생
	}
}