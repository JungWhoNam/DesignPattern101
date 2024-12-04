package lab07;

import lab07.appliance.*;
import lab07.command.*;
import lab07.command.appliance.*;

public class TestMacro {
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

		System.out.println("=========== macro test ===========");

		// Macro Command 사용하여 한 번에 여러 커멘드 실행 (다 켜고 열기)
		Command[] partyOn = { lightOn, fanHigh, showEBS };
		Command partyOnMacro = new MacroCommand(partyOn);
		// 리모컨에 지정된 커멘드 실행
		remote.setCommand(partyOnMacro);
		remote.buttonWasPressed();
		System.out.println();

		// Macro Command 사용하여 한 번에 여러 커멘드 실행 (다 끄고 닫기)
		Command[] partyOff = { lightOff, fanOff, showKBS };
		Command partyOffMacro = new MacroCommand(partyOff);
		// 리모컨에 지정된 커멘드 실행
		remote.setCommand(partyOffMacro);
		remote.buttonWasPressed();
		System.out.println();
	}
}
