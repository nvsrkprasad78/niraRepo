package java8;

import java.util.Arrays;
import java.util.List;



interface Parser {
	String parse(String s);
}

class StringConverter{
	public String convert(String s) {
		return "Helloo ..." + s;
	}
}

class MyPrinter{

	public void print(String s, Parser p) {
		s = p.parse(s);
		System.out.println(s);
	} 
	
}

public class methodRef1 {

	public static void main(String[] args) {
		String s = "RK";
		String s2 = "Rama ";
				
				
		MyPrinter mp = new MyPrinter();
		StringConverter sc = new StringConverter();
		mp.print(s, new Parser() {

			@Override
			public String parse(String s) { 

					return sc.convert(s);
			}
			});
		mp.print(s2, sc::convert);
		// TODO Auto-generated constructor stub
			//	List<String> names = Arrays.asList("one", "two", "three", "four");
				
				/*
				 * Consumer<String> conImp = new Consumer<String>(){
				 * 
				 * @Override public void accept(String t) { // TODO Auto-generated method stub
				 * System.out.println(t); }
				 * 
				 * };
				 */
			//	Consumer<String> conImp = (t)->System.out.println(t);
				
			//	names.forEach(System.out::println);
			
		
	}

}
