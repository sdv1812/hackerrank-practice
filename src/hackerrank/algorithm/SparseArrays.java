package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class SparseArrays {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		HashMap<String, Integer> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		//    	System.out.println(n);
		for(int i = 0; i< n; i++) {
			String str = in.nextLine();
			System.out.println(str);
			if(!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				map.put(str, map.get(str)+1);
			}
		}

		int q = Integer.parseInt(in.nextLine());
		for(int i=0; i<q; i++) {
			if(map.containsKey(in.nextLine()))
				System.out.println(map.get(in.nextLine()));
			else 
				System.out.println(0);
		}
	}
}
