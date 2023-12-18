package assignment_blq;

import java.util.Arrays;

public class Soal12 {

	public static void arraySort(int[] deret){
		
		// creating an instance of an array
		System.out.println("Input Array: "+Arrays.toString(deret));
		System.out.print("Array elements after sorting: ");
		// sorting logic
		for (int i = 0; i < deret.length; i++) {
			for (int j = i + 1; j < deret.length; j++) {
				int tmp = 0;
				if (deret[i] > deret[j]) {
					tmp = deret[i];
					deret[i] = deret[j];
					deret[j] = tmp;
				}
			}
			// prints the sorted element of the array
			if(i==deret.length-1) {
				System.out.print(deret[i]);
			}else {
				System.out.print(deret[i]+" ");
			}
			
		}
		
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 1, 2, 1, 3, 4, 7, 1, 1, 5, 6, 1, 8 };
		arraySort(arr);
		
		
	}
}
