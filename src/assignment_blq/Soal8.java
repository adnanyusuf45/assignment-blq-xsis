package assignment_blq;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumterkecil = 0;
        int sumterbesar = 0;

        int [] arr_angka = {1,2,4,7,8,6,9};
        int juml_angka_tambah = 4;
        
        
        // proses sorting dari terkecil hingga terbesar
        for (int i = 0; i < arr_angka.length; i++) {
            for (int j = 0; j < arr_angka.length; j++) {
            if (arr_angka[i] < arr_angka[j]) {
                int urut = arr_angka[i];
                arr_angka[i] = arr_angka[j];
                arr_angka[j] = urut;
            }  
            }
        }

        for (int i = 0; i < juml_angka_tambah; i++) {
        	sumterkecil = sumterkecil + arr_angka[i];
        }

        
        // proses sorting dari terbesar hingga terkecil
        for (int i = 0; i < arr_angka.length; i++) {
            for (int j = 0; j < arr_angka.length; j++) {
            if (arr_angka[i] > arr_angka[j]) {
                int urut = arr_angka[i];
                arr_angka[i] = arr_angka[j];
                arr_angka[j] = urut;
            }   
            }
        }

        
        for (int i = 0; i < juml_angka_tambah; i++) {
            sumterbesar = sumterbesar + arr_angka[i];

        }

        System.out.printf("4 ANGKA PENJUMLAHAN TERKECIL ADALAH : "+sumterkecil);
        System.out.println();System.out.println();
        System.out.printf("4 ANGKA PENJUMLAHAN TERBESAR ADALAH : "+sumterbesar);	

	}

}
