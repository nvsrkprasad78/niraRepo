package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackthonTest {

	public HackthonTest() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		

		//Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        String[] strInputArr =  name.split(" ");

		List<Integer> intList = new ArrayList();
		int temp = 0;
        for(int i=0; i<strInputArr.length; i++) {
        	 
        	temp = Integer.valueOf(strInputArr[i]);
        	intList.add(temp);
        }

		Collections.sort(intList);
		System.out.println(intList);

		int minEl = findMin(intList);
		System.out.println(minEl);
		
		
	}
	
	private static int findMin(List<Integer> lst) {
		int listTotal = lst.stream().mapToInt(a -> a).sum();
		int count = lst.size();
		int temp = 0;
		int minEle = 0;
		for(int i = count-1; i>=0; i--) {
			temp = lst.get(i);
			if(temp*count > listTotal) {
				minEle = temp;
			}
		}
		return minEle;
	}
	
	  private static  int findFactors(int a, int b){
          int smallInt = a > b ? b : a;
         int factorsCount = 0;
         for (int i=1; i <= smallInt; i++){
             if (a%i == 0 && b%i == 0){
                // factors.add(i);
                 factorsCount++;
                 
    // System.out.println("factor: "+ factorsCount + "= " + i);
             }
         }
         return factorsCount;
     }
     

}
