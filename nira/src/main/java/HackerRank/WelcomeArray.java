package HackerRank;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WelcomeArray {

	/*
	5
	1 2 3 4 5
	4 5 3 2 10
	
	output:
	5 7 6 6 15
	*/
	
	public WelcomeArray() {}

	public static void main(String[] args) 
	{


		Scanner s = new Scanner(System.in);
		String input = s.nextLine(); 
		int countOfElements = Integer.valueOf(input);
		String s1 = s.nextLine();  
		String s2 = s.nextLine();   
		
		String[] elements1 = s1.split(" ");
		String[] elements2 = s2.split(" ");
		List<Integer> resList = new ArrayList();
		for(int i=0; i<countOfElements; i++) {
			System.out.print(Integer.valueOf(elements1[i]) + 
			Integer.valueOf(elements2[i]) + " " );
		}
		
	}

}
