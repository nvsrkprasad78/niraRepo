package HackerRank;

import static java.util.function.Predicate.not;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx {

	public PredicateEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p1 = p -> p>5;
		Predicate<Integer> p2 = p -> p%2==0;

		printInfo(7, " is even? ", p2);
		printInfo(4, " is odd? ", not(p2));
		printInfo(4, " is > 5? ", p1);
		

		Function<Integer, Integer> increment = e -> e+1;
		Function<Integer, Integer> doubled = e -> e*2;
		Function <String, String> f2 = st -> st.concat(" Hello Dear .. " + st +" !!!!!");
		printInfo(4, " double ", doubled);
		printInfo(4, " increment and double (4+1)*2 = ", increment.andThen(doubled));
		printInfo(4, " double and increment using compose function 4*2 + 1 = ", increment.compose(doubled));
		printInfo("Rama ", f2);
	}

	public static void printInfo(int val, String info, Predicate<Integer> p) {
		System.out.println(val + info + p.test(val));
		
	}
	public static void printInfo(int val, String info, Function<Integer, Integer> f) {
		System.out.println(val + info + f.apply(val));
		
	}
	public static void printInfo( String info, Function<String, String> f) {
		System.out.println(f.apply(info));
		
	}
}
