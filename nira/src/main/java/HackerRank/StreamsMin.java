package HackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsMin {

	public StreamsMin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> list = Arrays.asList(2, 2, 5, 1);
         
		/*
		 * Comparator<Integer> minComparator = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer n1, Integer n2) { return
		 * n1.compareTo(n2); } };
		 */
 
       int minNumber = list.stream()
                                .min((a, b) -> a.compareTo(b))
                                .get();
 
        System.out.println(minNumber);
	}

}
