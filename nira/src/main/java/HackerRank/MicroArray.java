package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MicroArray {

	public MicroArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String input = s.nextLine(); 
		int numOfTests = Integer.valueOf(input);
		int numOfElements = 0;
		int intToCompare = 0;
		List<Integer> tempList = new ArrayList();
		int[] result = new int[numOfTests];
		Integer var = null;
		for(int i=0; i<numOfTests; i++) 
		{
			//s = new Scanner(System.in);
			String s1 = s.nextLine();  
			String s2 = s.nextLine();   
			String[] elements1 = s1.split(" "); 
			numOfElements= Integer.valueOf(elements1[0]);
			intToCompare = Integer.valueOf(elements1[1]);
			String[] elements2 = s2.split(" ");
			
			for(int j=0; j<numOfElements; j++) {
				tempList.add(Integer.valueOf(elements2[j]));
			}
			var = tempList.stream()
                    .min((a, b) -> a.compareTo(b))
                    .get();
			System.out.println(intToCompare + " " + var);
			result[i] = intToCompare-var;
			tempList = new ArrayList();
		}
		
		for(int i=0; i<numOfTests; i++) {
			System.out.println(result[i]);
		}
		
	}
}
