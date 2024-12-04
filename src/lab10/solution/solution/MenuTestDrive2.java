package lab10.solution.solution;

public class MenuTestDrive2 {
	public static void main(String args[]) {
		// 메뉴 생성
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		// 종업원 생성, 세 메뉴를 인자로 전달
		WaitressWithList waitress = new WaitressWithList();
		waitress.AddMenu(pancakeHouseMenu);
		waitress.AddMenu(dinerMenu);
		waitress.AddMenu(cafeMenu);
		
		// 메뉴 출력
		waitress.printMenu();
	}
}
