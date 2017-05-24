package hackerrank.algorithm;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class AlgorithmicCrush {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().split(" ");
    	int n = Integer.parseInt(str[0]);
    	Long m = Long.parseLong(str[1]);
    	
    	BigInteger[] arr = new BigInteger[n];
    	for(int i = 0; i< arr.length; i++) {
    		arr[i] = BigInteger.ZERO;
    	}
    	for (int i = 0; i<m; i++) {
    		String s = in.nextLine();
    		String arraystr[] = s.split(" ");
    		int start = Integer.parseInt(arraystr[0]);
    		int end = Integer.parseInt(arraystr[1]);
    		BigInteger value =  new BigInteger(arraystr[2]);
    		for(int j = start-1; j<end; j++) {
    			arr[j] = arr[j].add(value);
    		}
    	}

    	BigInteger max = BigInteger.valueOf(-1);    	
    	for(int i = 0; i<arr.length; i++) {
    		if(arr[i].compareTo(max)>0) {
    			max = arr[i];
    		}
    		
    	}
    	System.out.println(max);
    }
}