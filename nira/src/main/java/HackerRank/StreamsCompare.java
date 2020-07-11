package HackerRank;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.compiler.lang.dsl.DSLMapParser.mapping_file_return;

class Person{
	String name;
	int age;
	String gender;
	
	Person(String n, int a, String g){
		this.name = n;
		this.age = a;
		this.gender = g;
	}
	public static int getAge(Person p) {
		return p.age;
	}
	public static String getName(Person p) {
		return p.name;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.gender;
		
	}
}

public class StreamsCompare {

	public StreamsCompare() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = List.of(new Person("AAA", 18, "Male"),
										new Person("BBB", 8, "Male"),
										new Person("CCC", 76, "Female"),
										new Person("DDD", 45, "Male"),
										new Person("EEE", 73, "Female"),
										new Person("AAA", 38, "Male"));
		
		
		
		//printSorted( people, comparing(Person::getAge).thenComparing(Person::getName));
		
	/*
		System.out.println(
				
				people.stream()
				.collect(groupingBy(Person::getName))
				
				);
		*/	
		
		// group by Name
		/*
		Map<String, List<Person>> personMap = new HashMap(
				people.stream()
				.collect(groupingBy(Person::getName))
				);
				*/
		
		// group by Name
		Map<String, List<Person>> personMap = new HashMap(
				people.stream()
				.collect(groupingBy(Person::getName, mapping(Person::getAge, toList())))
				);
	
		System.out.println(	personMap.get("AAA"));
		
	}
	
	@SuppressWarnings("unchecked")
	public static void printSorted(List<Person> l, Comparator c) {
		
		l.stream()
		.filter(p -> p.age>18)
		.sorted(c)
		.forEach(System.out::println);
	}

}
