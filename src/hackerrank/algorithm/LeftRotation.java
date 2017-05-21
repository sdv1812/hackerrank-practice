package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class LeftRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int d = in.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = in.nextInt();
    	}
    	
    	int[] narr = new int [n];
    	
    	for(int i = d; i<n; i++) {
    		narr[i-d] = arr[i];
    	}
    	int c = 0;
    	for(int i = n-d; i<n; i++) {
    		narr[i] = arr[c];
    		c++;
    	}
    	for(int i = 0; i<n; i++) {
    		System.out.print(narr[i]+" ");
    	}
    }
}