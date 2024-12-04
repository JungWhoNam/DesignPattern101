package lab10.solution.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaitressWithList {
	List<Menu> menus;

	// 생성자, 두 메뉴를 인자로 받음
	public WaitressWithList() {
		menus = new ArrayList<Menu>();
	}

	public void AddMenu(Menu menu) {
		menus.add(menu);
	}

	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			System.out.println("\n메뉴");
			printMenu(menu.createIterator());
		}
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
