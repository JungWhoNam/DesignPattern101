package lab08.solution;

public class PilotDroneTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		System.out.println("\n오리가 말하길...");
		testDuck(duck);

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("\n칠면조 어댑터가 말하길...");
		testDuck(turkeyAdapter);

		Drone drone = new FlyableDrone();
		Duck droneAdaptor = new DroneAdapter(drone);
		System.out.println("\n드론 어댑터가 말하길...");
		testDuck(droneAdaptor);

		Drone drone2 = new FlyableDrone();
		Pilot pilot = new ExpertPilot("남정후");
		Duck pilotDroneAdaptor = new PilotDroneAdapter(pilot, drone2);
		System.out.println("\n조종사 드론 어댑터가 말하길...");
		testDuck(pilotDroneAdaptor);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
