package hackerrank.algorithm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.print.attribute.standard.RequestingUserName;

public class Grading {

    static int[] solve(int[] grades){
    	int[] roundedGrade = new int[grades.length]; 
    	for (int i = 0; i< grades.length; i++) {
    		if (grades[i]>=38) {
    			roundedGrade[i] = roundOff(grades[i]);
    		} else {
    			roundedGrade[i] = grades[i];
    		}
    		
    	}
    	return roundedGrade;
        
    }
    
    static int roundOff(int n) {
    	int rem = n%5;
    	if(rem>2) {
    		rem = 5 - rem;
    		return n+rem;
    	}else {
    		return n;
    	}
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
