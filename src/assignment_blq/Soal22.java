package assignment_blq;

import java.util.Scanner;

public class Soal22 {

	public static void main(String[] args) {
		 int t1 = 1, t2 = 1;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Masukkan jumlah lilin: ");
		 int n = s.nextInt();
		 
		 System.out.print("Masukkan input lilin: ");
		 int[] lilin = new int[n];
			for (int i = 0; i < n; i++) {
					lilin[i]= s.nextInt();
				}

			
		 for (int i = 0; i <n; i++){
			 if(i==0)
			 {
			    lilin[i] = lilin[i]-t1;
			    System.out.print(lilin[i]+" ");
			 }
			 else if(i==1)
		 	{
		      lilin[i] = lilin[i]-t2;
		      System.out.print(lilin[i]+ " ");
		 	}
			 else
		     {
		      int sum = t1 + t2;
		      lilin[i]=lilin[i]-sum;
		      System.out.print(lilin[i]+" ");
		      t1 = t2;
		      t2 = sum;
		      }
		    }
		 
		 System.out.println();
		 for (int i = 0; i <n; i++){
			 if(lilin[i] <= 0)
			 {
				 System.out.println("Lilin Ke-"+(i+1) + " Pertama Habis");
				 break;
			 }
		 }
	}
}
