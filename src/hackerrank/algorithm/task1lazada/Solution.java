package hackerrank.algorithm.task1lazada;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		Solution obj = new Solution();
		System.out.println(obj.solution(S));

	}

	public int solution(String S) {
		char[] stringArray = S.toCharArray();
		int count = 0;
		int uppercaseCount = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i< stringArray.length; i++) {

			if(!(Character.isDigit(stringArray[i]))) {
				count ++;
				if (Character.isUpperCase(stringArray[i])) { uppercaseCount++;}
			} else {
				if (uppercaseCount==0) { count = 0; }
				if (count >max) { max = count; }
				if (i!=stringArray.length-1)
					count=0;
			}
			if (i==stringArray.length-1 && uppercaseCount!=0) {
				if (count >max) { max = count;  }
			}
		}
		if(max ==0) { return -1; } 
		else { 	return max; }
	}
}
