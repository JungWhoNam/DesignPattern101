package lab11.starter.gumballstate;

public class GumballMachineTestDrive2 {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(8);

		System.out.println("현재 동전 개수: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("\n현재 동전 개수: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("\n현재 동전 개수: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("\n현재 동전 개수: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("\n현재 동전 개수: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
	}
}
