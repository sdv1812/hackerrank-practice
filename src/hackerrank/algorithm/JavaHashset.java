package hackerrank.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
	


	public static void main(String[] args) {
		class Pair {
			String left;
			String right;
			
			Pair(String left, String right) {
				this.left = left;
				this.right = right;
			}
			Pair() {}
			
			public String getLeft() {
				return left;
			}
			public void setLeft(String left) {
				this.left = left;
			}
			public String getRight() {
				return right;
			}
			public void setRight(String right) {
				this.right = right;
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((left == null) ? 0 : left.hashCode());
				result = prime * result + ((right == null) ? 0 : right.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Pair other = (Pair) obj;
				if (left == null) {
					if (other.left != null)
						return false;
				} else if (!left.equals(other.left))
					return false;
				if (right == null) {
					if (other.right != null)
						return false;
				} else if (!right.equals(other.right))
					return false;
				return true;
			}
			
		}
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String [] pair_left = new String[t];
		String [] pair_right = new String[t];
		JavaHashset obj = new JavaHashset();
		Set<Pair> pairs = new HashSet<>();
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
			Pair pair = new Pair(pair_left[i], pair_right[i]);
			
			pairs.add(pair);
			System.out.println(pairs.size());
		}
		
		
	}

}
