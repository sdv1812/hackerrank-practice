package hackerrank.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FujiXeroxUniqueChar {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String [] str = new String[n];
		for(int i = 0; i<n; i++) {
			str[i] = in.nextLine();
		}
		for(int i=0; i< str.length; i++) {
			getUniqueMax(str[i]);
		}
		in.close();
		
	}

	private static void getUniqueMax(String str) {
		String[] arr = str.split(" ");
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int len=0;
		String word = "";
		for(int i=1; i<arr.length; i++){
			String charArr [] = arr[i].split("");
			Set<String> charSet = new HashSet<>(Arrays.asList(charArr));
			len = charSet.size();
			if(len>max){
				max = len;
				word = arr[i];
			}
		}
		
		System.out.println(arr[0]+" " + word);
	}
}
