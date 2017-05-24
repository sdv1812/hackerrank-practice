package hackerrank.algorithm;

public class Quicksort {

	public void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);
			System.out.println(p);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}

	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low; j<=high; j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		return i;
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}



	public static void main(String args[]) {
		int arr[] = {0, 7, -8, 0, 0, 0};
		int n = arr.length;
		
		Quicksort obj = new Quicksort();
		obj.quickSort(arr, 0, n-1);

		System.out.println("sorted array");
		printArray(arr);

	}

}