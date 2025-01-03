package lab10.solution;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;

	// 생성자, 두 메뉴를 인자로 받음
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> iterator0 = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> iterator1 = dinerMenu.createIterator();
		Iterator<MenuItem> iterator2 = cafeMenu.createIterator();

		System.out.println("메뉴");
		printMenu(iterator0);
		System.out.println("\n메뉴");
		printMenu(iterator1);
		System.out.println("\n메뉴");
		printMenu(iterator2);
	}

	void printMenu(Iterator<MenuItem> iterator) {
		// 항목이 더 남아 있는지 확인
		while (iterator.hasNext()) {
			// 다음 항목 가져오기
			MenuItem menuItem = iterator.next();
			// 항목 출력
			printMenuItem(menuItem);
		}
	}

	// 이름, 가격, 설명 출력
	void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}
}
