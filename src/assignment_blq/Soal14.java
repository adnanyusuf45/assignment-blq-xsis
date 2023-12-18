package assignment_blq;

import java.util.Scanner;

public class Soal14 {
	
	public static void geserKiriDeret(int[] deret,int n){
		
		System.out.print("N = "+n+" ->");
		
		for (int i = 0; i < deret.length; i++) {
			System.out.printf("%2s",deret[i]);
		}
		
		System.out.println();
		
		System.out.println("proses shifting ke kiri:");
		// proses shifting ke kiri
		int temp;
		for (int i = 0; i < n; i++) {
			temp=deret[0];
			for (int j = 0; j < deret.length-1; j++) {
				
			       deret[j]=deret[j+1];
			}
			 deret[deret.length-1]=temp;
			 
			 //looping cetak angka
			for (int k = 0; k < deret.length; k++) {
				System.out.printf("%2s",deret[k]);
			}
			System.out.println();
		} 
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		int[] deret1 ={3,9,0,7,1,2,5} ;
		
		geserKiriDeret(deret1,3);
		geserKiriDeret(deret1,1);
		
		

		
	}

}
