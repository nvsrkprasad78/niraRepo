package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusSeatPosition {

	public BusSeatPosition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of seats? ");
		int noOfInputs = sc.nextInt();
		
		List<Integer> seatList = new ArrayList();
		
		for(int i=0; i<noOfInputs; i++) {
			System.out.println("Enter sear number "+ (i+1) + " : ");
			seatList.add(sc.nextInt());
		}
		

		for (Integer seat : seatList) {
		    
			System.out.println(oppoSeat(seat) + " " + seatFacing(seat));
			
		} 
		
		/*
		 * 10
19
29
96
33
24
38
66
47
12
4
		 */
			
			
		
	
	}

	private static String seatFacing(int seat) 
	{
   		String facing = ""; 
			if(seat%6 == 0 || seat%6 == 1) {
				//System.out.println(seat + " " + "W");	
				facing =  "WS";
			}else if(seat%3 == 0 || seat%3 == 1) {
				//System.out.println(seat + " " + "A");
				facing = "AS"; 
			}else if(seat%2 == 0 || seat%2 == 1) { 
				//System.out.println(seat + " " + "M");
				facing = "MS"; 
			}
			return facing;  
	}
	
	private static int oppoSeat(int seat) 
	{
		 int retInt = 0;
		  
		 if(seat%6 == 0 || seat%6 == 1) {
             if(seat%12 == 0 )
            	 retInt = seat-11;
             else if(seat%6 == 0)
            	 retInt = seat+1;
             else if(seat%6==1) {
            	 retInt = seat==1 ? seat+11 : seat-1;
             }
            	
         		
			}else if(seat%3 == 0 || seat%3 == 1) {
				 if(seat%12 == 10 )
	            	 retInt = seat-7;
	             else if(seat%3 == 0)
	            	 retInt = seat+7;
	             else if(seat%3==1)
	            	 retInt = seat+5;
				 
			}else if(seat%2 == 0 || seat%2 == 1) { 
				 if(seat%12 == 11)
	            	 retInt = seat-9;
	             else if(seat%2 == 0)
	            	 retInt = seat+9;
	             else if(seat%2==1)
	            	 retInt = seat+3;
	            
	            	 
			}
		 
		 return retInt;
	}

}
