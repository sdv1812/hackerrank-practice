package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class HourGlass2D {

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<6; i++) {
        	for(int j=0; j<6; j++) {
        		arr[i][j] = in.nextInt();
        	}
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=1; i<5; i++) {
        	for(int j=1; j<5; j++) {
        		sum = arr[i][j]
        			+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]
        			+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
        		if(sum>=max){ max = sum; }
        	}       	
        }
        
        System.out.println(max);
    }
}