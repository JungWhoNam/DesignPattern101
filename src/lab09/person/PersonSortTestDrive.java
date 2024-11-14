package lab09.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonSortTestDrive {

	static void TestArray() {
		Person[] persons = { new Person("Daffy", 8), new Person("Dewey", 2), new Person("Howard", 7),
				new Person("Louie", 2), new Person("Donald", 10), new Person("Huey", 2) };

		System.out.println("정렬 전:");
		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println("정렬 후:");
		Arrays.sort(persons);
		for (Person p : persons) {
			System.out.println(p);
		}
	}

	static void TestList() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Daffy", 8));
		persons.add(new Person("Dewey", 2));
		persons.add(new Person("Howard", 7));
		persons.add(new Person("Louie", 2));
		persons.add(new Person("Donald", 10));
		persons.add(new Person("Huey", 2));

		System.out.println("정렬 전:");
		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println("정렬 후 (오름차순):");
		Collections.sort(persons);
		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println("정렬 후 (내림차순):");
		Collections.sort(persons, Collections.reverseOrder());
		for (Person p : persons) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("배열 정렬 테스트:");
		TestArray();

		System.out.println("\n===================");
		System.out.println("리스트 정렬 테스트:");
		TestList();
	}

}
