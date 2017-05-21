package hackerrank.algorithm;

import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long arr[] = new long[5];
        arr[0] = b+c+d+e;
        arr[1] = a+c+d+e;
        arr[2] = a+b+d+e;
        arr[3] = a+b+c+e;
        arr[4] = a+b+c+d;
        
        long min = arr[0];
        long max = arr[0];
        for (int i = 0; i < 5; i++) {
        	if(arr[i]<min)
        		min = arr[i];
        	if(arr[i]>max)
        		max = arr[i];
        }
        System.out.println(min + " " + max);
        
	}

}
