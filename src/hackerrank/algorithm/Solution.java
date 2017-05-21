package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }
        
        int pos=0, neg=0, zero=0;
        for (int j = 0; j<n; j++) {
            if(arr[j]<0)
                neg++;
            else if(arr[j]==0) 
                zero++;
                else if (arr[j]>0)
                pos++;
        }

        System.out.printf("%.6f %n",(double)pos/(double)n);
        System.out.printf("%.6f %n",(double)neg/(double)n);
        System.out.printf("%.6f %n",(double)zero/(double)n);
        
    }
}