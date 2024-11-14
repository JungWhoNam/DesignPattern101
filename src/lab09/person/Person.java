package lab09.person;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " 나이: " + age;
	}

	@Override
	public int compareTo(Person other) {
		if (this.age < other.age) {
			return -1;
		} else if (this.age == other.age) {
			return 0;
		} else { // this.age > other.age
			return 1;
		}
	}
}
