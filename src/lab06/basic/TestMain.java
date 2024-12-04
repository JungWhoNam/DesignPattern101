package lab06.basic;

public class TestMain {
	public static void main(String[] args) {
		Singleton singleton0 = Singleton.getInstance();
		
		Singleton singleton1 = Singleton.getInstance();
		
		System.out.println(singleton0 == singleton1);
		System.out.println(singleton0.getDescription());
		System.out.println(singleton1.getDescription());
	}

}
