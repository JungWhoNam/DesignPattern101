package lab10.starter;

public class MenuTestDrive {
	public static void main(String args[]) {
		// 메뉴 생성
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		// 종업원 생성, 두 메뉴를 인자로 전달
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		// 메뉴 출력
		waitress.printMenu();
	}
}
