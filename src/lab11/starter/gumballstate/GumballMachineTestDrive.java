package lab11.starter.gumballstate;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(2);

		System.out.println("0:");
		gumballMachine.insertQuarter();
		System.out.println("\n1:");
		gumballMachine.insertQuarter();
		System.out.println("\n2:");
		gumballMachine.turnCrank();
		System.out.println("\n3:");
		gumballMachine.insertQuarter();
		System.out.println("\n4:");
		gumballMachine.turnCrank();
		System.out.println("\n5:");
		gumballMachine.insertQuarter();
		System.out.println("\n6:");
		gumballMachine.turnCrank();
	}
}
