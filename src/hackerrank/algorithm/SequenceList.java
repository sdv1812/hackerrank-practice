package hackerrank.algorithm;
import java.io.*;
import java.util.*;

public class SequenceList {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		int n, x, y, lastAns = 0, seqIndex;
		List<List<Integer>> seqList = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			seqList.add(new ArrayList<Integer>());
		}

		for (int i=0; i<Q; i++) {
			n = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();
			seqIndex = ((x^lastAns)%N);
			if(n==1) {seqList.get(seqIndex).add(y);} 
			else if (n==2) {
				int size = seqList.get(seqIndex).size();
				lastAns = seqList.get(seqIndex).get(y%size);
				System.out.println(lastAns);
			}
		}
	}
}