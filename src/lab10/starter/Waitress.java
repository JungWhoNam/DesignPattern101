package lab10.starter;

import java.util.*;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	CafeMenu cafeMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		System.out.println("\n메뉴");
		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			printMenuItem(breakfastItems.get(i));
		}

		System.out.println("\n메뉴");
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		for (int i = 0; i < lunchItems.length; i++) {
			if (lunchItems[i] != null) {
				printMenuItem(lunchItems[i]);
			}
		}

		System.out.println("\n메뉴");
		Map<String, MenuItem> dinnerItems = cafeMenu.getMenuItems();
		for (MenuItem item : dinnerItems.values()) {
			printMenuItem(item);
		}
	}

	// 이름, 가격, 설명 출력
	void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}
}
