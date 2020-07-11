package HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class BracketsSeq {

	public BracketsSeq() {
		// TODO Auto-generated constructor stub
	}
//input : ())))(
//output: 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String inputStr = s.nextLine();
		
		char[] chars = inputStr.toCharArray();
		Stack st = new Stack();
		int count = 0;
		char firstOne = chars[0];
		st.push(chars[0]);
		for(int i=1; i<chars.length; i++) {
			if(chars[i] == firstOne) {
				st.push(chars[i]);
			}else {
				if(!st.empty()) {
					st.pop();
					count++;
				}
			}
		}
		
		System.out.println("number of bracess correct are : " + count);
	}

}
