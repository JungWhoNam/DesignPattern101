package lab10.lecture.starter;

import java.util.*;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		System.out.println("메뉴\n---\n아침 메뉴");
		List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			printMenuItem(breakfastItems.get(i));
		}

		System.out.println("\n점심 메뉴");
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		for (int i = 0; i < lunchItems.length; i++) {
			if (lunchItems[i] != null) {
				printMenuItem(lunchItems[i]);
			}
		}
	}

	// 이름, 가격, 설명 출력
	void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}
}
