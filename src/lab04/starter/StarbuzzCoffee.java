package lab04.starter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		// 기본 메뉴 설정
		List<Beverage> menu = new ArrayList<>();
		menu.add(new DarkRoast());
		menu.add(new HouseBlend());
		// TODO 새로운 기본 음료 추가: Espresso, Decaf, 첨가물이 추가된 음료를 메뉴에 포함해도 됩니다.

		Beverage curr = null; // 현재 주문하려는 음료
		Scanner scanner = new Scanner(System.in); // 사용자 입력 처리 기능

		while (true) {
			if (curr == null) { // 기본 음료 선택창
				System.out.println("\n-------- 기본 음료 선택창 ---------");

				// 메뉴 프린트
				System.out.println("다음 메뉴 중 하나를 선택하세요 (숫자로 입력)");
				for (int i = 0; i < menu.size(); i++) {
					System.out.println(
							String.format("%d: %s, $%-4.2f", i, menu.get(i).getDescription(), menu.get(i).cost()));
				}

				// 사용자 입력 받기
				System.out.print("> ");
				String input = scanner.nextLine();
				input = input.toLowerCase();

				// 받은 명령어 처리
				if (input.equals("exit")) { // 어플 종료
					break;
				}

				// 메뉴 선택
				try {
					// String 타입을 int 타입으로 변환
					int inputAsInt = Integer.parseInt(input);

					// TODO 메뉴에서 기본 음료 선택
				} catch (Exception e) {
					System.out.println("??? 예외 발생: " + e);
				}

			} else { // 첨가물 선택창 보여주기
				System.out.println("\n-------- 첨가물 선택창 ---------");

				// 현재 선택한 음료 보여주기
				System.out.println(String.format("현재 음료: %s, $%-4.2f", curr.getDescription(), curr.cost()));
				System.out.println();

				// 명령어 옵션 보여주기
				System.out.println("다음 옵션 중 하나를 선택하세요. 예) reset");
				System.out.println("exit: 끝");
				System.out.println("reset: 처음으로");
				System.out.println("save: 메뉴에 저장");
				System.out.println("add [첨가물]: 첨가물 추가, 예) add soy");

				// 사용자 입력 받기
				System.out.print("> ");
				String input = scanner.nextLine();
				input = input.toLowerCase();

				// 받은 명령어 처리하기
				if (input.equals("exit")) { // 어플 종료
					break;
				} else if (input.equals("reset")) {
					// TODO 선택한 음료를 리셋 (기본 음료 선택 창으로 가면 됩니다).
				} else if (input.equals("save")) {
					// TODO 선택한 음료를 기본 메뉴에 저장
					// TODO 선택한 음료를 리셋 (기본 음료 선택 창으로 가면 됩니다).
				} else if (input.startsWith("add")) {
					// 명령행 인자 구하기 (argument)
					String decoratorName = input.trim().split("\\s+")[1].toLowerCase();

					// TODO 그 외 첨가물 추가: Soy, Whip
					if (decoratorName.equals("milk")) {
						curr = new Milk(curr);
					} else if (decoratorName.equals("mocha")) {
						curr = new Mocha(curr);
					} else {
						System.out.println("??? 예외 발생: 모르는 첨가물입니다.");
					}
				} else {
					System.out.println("??? 예외 발생: 모르는 명령어입니다.");
				}
			}

		}

		System.out.println("\n다음에 또 오세요.");
	}
}
