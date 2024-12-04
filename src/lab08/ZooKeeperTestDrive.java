package lab08;

import java.util.HashMap;
import java.util.Scanner;

public class ZooKeeperTestDrive {

	public static void main(String args[]) {
		// 다양한 타입의 Duck 관리 목적 해시맵
		HashMap<String, Duck> ducks = new HashMap<String, Duck>();
		ducks.put("duck", new MallardDuck());
		ducks.put("turkey", new TurkeyAdapter(new WildTurkey()));
		ducks.put("drone", new DroneAdapter(new FlyableDrone()));
		ducks.put("human-drone", new PilotDroneAdapter(new ExpertPilot("남정후"), new FlyableDrone()));

		Scanner scanner = new Scanner(System.in); // 사용자 입력 처리 기능

		while (true) {
			System.out.println("\n-------- 선택창 ---------");

			// 오리 종류 보여주기
			System.out.print("오리 종류: ");
			for (String duck : ducks.keySet()) {
				System.out.print(duck + ", ");
			}
			System.out.println();
			System.out.println();

			// 명령어 옵션 보여주기
			System.out.println("다음 옵션 중 하나를 선택하세요.");
			System.out.println("quack [오리 종류]: 해당 오리 호명하기, 예) quack duck");
			System.out.println("fly [오리 종류]: 해당 오리 날리기, 예) fly duck");
			System.out.println("exit: 끝");

			// 사용자 입력 받기
			System.out.print("\n> ");
			String input = scanner.nextLine();
			input = input.toLowerCase();

			// 받은 명령어 처리하기
			if (input.equals("exit")) { // 어플 종료
				break;
			} else if (input.startsWith("fly")) {
				// 명령행 인자 구하기 (argument)
				String duckType = input.trim().split("\\s+")[1].toLowerCase();

				// 해당 오리 객체 가져오기
				Duck duck = ducks.get(duckType);
				if (duck == null) {
					System.out.println("??? 예외 발생: 모르는 오리입니다.");
				} else {
					duck.fly(); // 오리날다
				}
			} else if (input.startsWith("quack")) {
				// 명령행 인자 구하기 (argument)
				String duckType = input.trim().split("\\s+")[1].toLowerCase();

				Duck duck = ducks.get(duckType);
				if (duck == null) {
					System.out.println("??? 예외 발생: 모르는 오리입니다.");
				} else {
					duck.quack(); // 호명
				}
			} else {
				System.out.println("??? 예외 발생: 모르는 명령어입니다.");
			}
		}

		System.out.println("\n뷁.");

		scanner.close();
	}
}
