package lab08.solution;

import java.util.ArrayList;

public class PilotDroneTestDriveV2 {

	public static void main(String[] args) {
		ArrayList<Duck> ducks = new ArrayList<Duck>();

		Duck duck = new MallardDuck();
		ducks.add(duck);

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		ducks.add(turkeyAdapter);

		Drone drone = new FlyableDrone();
		Duck droneAdaptor = new DroneAdapter(drone);
		ducks.add(droneAdaptor);

		Drone drone2 = new FlyableDrone();
		Pilot pilot = new ExpertPilot("남정후");
		Duck pilotDroneAdaptor = new PilotDroneAdapter(pilot, drone2);
		ducks.add(pilotDroneAdaptor);

		System.out.println("\n오리들이 말하길...");
		for (int i = 0; i < ducks.size(); i++) {
			System.out.println(i + " 번째 오리:");
			ducks.get(i).quack();
		}

		System.out.println("\n오리날다 (feat. 체리필터)...");
		for (int i = 0; i < ducks.size(); i++) {
			System.out.println(i + " 번째 오리:");
			ducks.get(i).fly();
		}
	}

}
