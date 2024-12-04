package lab07.starter;

import lab07.starter.appliance.*;
import lab07.starter.command.*;
import lab07.starter.command.appliance.*;

public class TestUndo {
	public static void main(String[] args) {
		// 사용할 가전제품
		Light light = new Light("주방");
		CeilingFan fan = new CeilingFan("부엌");
		Television tv = new Television();

		// 형광등 관련 커멘드
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		// 선풍기 관련 커맨드
		Command fanHigh = new CeilingFanHighCommand(fan);
		Command fanOff = new CeilingFanOffCommand(fan);
		// TV 관련 커멘드
		Command showEBS = new TVSetChannelCommand(tv, 18);
		Command showKBS = new TVSetChannelCommand(tv, 10);

		// 버튼이 하나인 리모컨
		RemoteControlOne remote = new RemoteControlOne();
		
		System.out.println("=========== undo test ===========");

		// undo 테스트를 위해서 TV 채널을 0으로 리셋
		tv.setChannel(0);
		System.out.println();

		System.out.println("> 버튼 누르기");
		Command[] undoTest = { lightOn, fanHigh, showEBS, showKBS };
		remote.setCommand(new MacroCommand(undoTest));
		remote.buttonWasPressed();
		System.out.println();

		System.out.println("> 되돌아가기");
		remote.undoButtonWasPressed();
		System.out.println();
	}
}
