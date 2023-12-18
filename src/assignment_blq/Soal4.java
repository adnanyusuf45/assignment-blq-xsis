package assignment_blq;

import java.util.Scanner;

public class Soal4 {

	public static void first_n_PrimeNumber(int n) {
		int status = 1;
		int num = 3;

		if (n >= 1) {
			System.out.println(n + " Bilangan Prima Pertama:");
			System.out.println(2);
		}

		for (int i = 2; i <= n;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.println(num);
				i++;
			}
			status = 1;
			num++;
		}
      System.out.println();
	}

	public static void main(String[] args) {

		first_n_PrimeNumber(5);
		first_n_PrimeNumber(10);

	}
}
