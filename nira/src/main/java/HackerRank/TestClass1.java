package HackerRank;

import java.util.Arrays;
import java.util.List;

public class TestClass1 {

	public TestClass1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(1, 2, 3, 4);
		
		System.out.println(numbers.getClass());
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
		System.out.println(numbers2.getClass());
		List<Integer> numbers3 = List.copyOf(numbers2);
		System.out.println(numbers2==numbers3);
		List<Integer> numbers4 = List.copyOf(numbers);
		System.out.println(numbers==numbers4);
		
	}

}
