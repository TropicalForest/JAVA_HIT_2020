package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class RunMain {
	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(new Person("Tuan", 19));
		listPerson.add(new Person("Tuan", 19));
		listPerson.add(new Person("Tuan", 19));
		
//		Consumer<Person> consumer = (Person p) -> System.out.println(p);
//		listPerson.stream().forEach(p -> System.out.println(p));
//		listPerson.stream().forEach(p -> System.out.println(p));
		listPerson.forEach(System.out::println); // method reference
		
		
	}
}
