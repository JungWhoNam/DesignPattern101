package lab06.solution.basic;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public String getDescription() {
		return "나는 유일무이한 존재입니다.";
	}
}
