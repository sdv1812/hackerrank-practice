package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class TimeConversionMilitary {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String s = in.nextLine();
    	String ampm = s.substring(s.length()-2);
    	String time = s.substring(0, s.length()-2);
    	String timeArray[] = time.split(":");
    	StringBuilder militarytime = new StringBuilder();
    	String newMilitarytime;
    	if(ampm.equalsIgnoreCase("PM")) {
    		if(Integer.parseInt(timeArray[0])==12) {
    			newMilitarytime = time;
    		} else {
            	militarytime.append(Integer.parseInt(timeArray[0])+12)
            	.append(":")
            	.append(timeArray[1])
            	.append(":")
            	.append(timeArray[2]);
            	
            	newMilitarytime = militarytime.toString();
    		}

    	} else {
    		if(Integer.parseInt(timeArray[0])==12) {
    			militarytime.append(Integer.parseInt(timeArray[0])-12+"0")
    			.append(":")
            	.append(timeArray[1])
            	.append(":")
            	.append(timeArray[2]);
    			newMilitarytime = militarytime.toString();
    		} else {
    			newMilitarytime = time;
    		}
    		
    	}

    	
    	System.out.println(newMilitarytime);
    	
    }
}