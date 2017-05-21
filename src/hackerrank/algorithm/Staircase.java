package hackerrank.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int n = Integer.parseInt(in.nextLine());
	     char[] repeat = new char[n];
	     Arrays.fill(repeat, ' ');
	     repeat[n-1] = '#';
	     String stair = new String(repeat);
	     System.out.println(stair);  
	     
	     for (int i = n-2; i>=0; i--) {
	    	 repeat[i] = '#';
	    	 System.out.println(repeat);
	     }

	 }
}
