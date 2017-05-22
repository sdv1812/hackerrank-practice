package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> arr = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String s[] = in.nextLine().split(" ");
        for(int i = 0; i< n; i++) {
        	arr.add(Integer.parseInt(s[i]));
        }
        int q = Integer.parseInt(in.nextLine());
        for(int i=0; i<q; i++) {
        	String qtype = in.nextLine();
        	if(qtype.equals("Insert")){
        		String str[] = in.nextLine().split(" ");
        		arr.add(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        	} else if(qtype.equals("Delete")) {
        		arr.remove(Integer.parseInt(in.nextLine()));
        	}
        }
        for(int i=0; i<arr.size(); i++) {
        	System.out.print(arr.get(i) + " ");
        }
    }
}