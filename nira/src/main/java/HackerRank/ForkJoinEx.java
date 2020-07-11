package HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.function.Predicate;

public class ForkJoinEx{

	public ForkJoinEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		Function<Integer, Integer> doubleIt = e -> e*2;
		Predicate<Integer> isEven = e -> e%2==0;
		
	/*
		ForkJoinPool pool = new ForkJoinPool(50);
		
		pool.submit(() ->
		numbers.parallelStream()
			.filter(ForkJoinEx::isEven)
			.map(doubleIt)
			.forEach(System.out::println)
			);
		
		pool.shutdown();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		
		
		  numbers.parallelStream() .filter(ForkJoinEx::isEven) .map(doubleIt)
		  .forEach(System.out::println);
		 
	}

	public static boolean isEven(int numb) {
		
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		return numb%2==0;
	}
}
