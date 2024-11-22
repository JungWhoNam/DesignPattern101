package lab10.two.custom;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	// 생성자, 두 메뉴를 인자로 받음
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator iterator0 = pancakeHouseMenu.createIterator();
		Iterator iterator1 = dinerMenu.createIterator();

		System.out.println("메뉴\n---\n아침 메뉴");
		printMenu(iterator0);
		System.out.println("\n점심 메뉴");
		printMenu(iterator1);
	}
	
	void printMenu(Iterator iterator) {
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
