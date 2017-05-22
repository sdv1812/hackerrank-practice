package hackerrank.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromeSubstring {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Set<String> pals =palindromes(s);
		for(String str: pals) {
			System.out.println(str);
		}
	}
	

	
	public static Set<String> palindromes(final String input) {

	    final Set<String> result = new HashSet<>();

	    for (int i = 0; i < input.length(); i++) {
	         // expanding even length palindromes:
	         expandPalindromes(result,input,i,i+1);
	         // expanding odd length palindromes:
	         expandPalindromes(result,input,i,i);
	     }
	     return result;
	  }

	 public static void expandPalindromes(final Set<String> result, final String s, int i, int j) {
	      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	            result.add(s.substring(i,j+1));
	            i--; j++;
	      }
	  }
	 
	 
}
