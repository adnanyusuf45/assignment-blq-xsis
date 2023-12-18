package assignment_blq;

import java.util.Scanner;

public class Soal11 {
	
	public static void cetakKataBintang(String kata) {
		
		System.out.println("Input Kata: "+kata);
		
		String[] pisahKata1 = kata.split("");
		
		//jumlah bintang (*) yang dicetak
		
		int bintang = pisahKata1.length/2;
		
		for (int i = pisahKata1.length-1; i >=0; i--)
		{
			for(int j =0 ; j<bintang; j++)
			{
			 System.out.print("*");
		    }
			System.out.print(pisahKata1[i]);
			
			for(int j =pisahKata1.length-1+bintang ; j>pisahKata1.length-1; j--)
			{
			 System.out.print("*");
		    }
			
			System.out.println();
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		cetakKataBintang("Afrika");
		cetakKataBintang("Jeruk");
		
	}

}
