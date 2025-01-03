package lab10.lecture.custom;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		// 이름, 설명문, 채식, 가격
		addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 토마토를 얹은 메뉴", true, 2.99);
		addItem("BLT", "통밀 위에 베이컨, 토마토를 얹은 메뉴", false, 2.99);
		addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
		addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도기", false, 3.05);
		// 기타 메뉴 항목이 추가되는 부분
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		// 메뉴 항목 개수 제한
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	// 더 이상 필요 없음 - createIterator()로 대채
	// public MenuItem[] getMenuItems() {
	// return menuItems;
	// }

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
