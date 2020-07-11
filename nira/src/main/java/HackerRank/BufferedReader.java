package HackerRank;

import java.util.Scanner;

public class BufferedReader {

	public BufferedReader() {
		// TODO Auto-generated constructor stub
	} 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        s = new Scanner(System.in);
        name = s.nextLine();                // Reading input from STDIN
        System.out.println("=> " + name + ".");    // Writing output to STDOUT



	}

}
