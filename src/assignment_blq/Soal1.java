package assignment_blq;

import java.util.Arrays;
import java.util.Scanner;

public class Soal1 {

	public static void perhitungan_barang(int jumlah_uang) {

		System.out.println("Uang: " + jumlah_uang);
		int count = 0;
		String messagekacamata = " ";
		String messagebaju = " ";
		String messagesepatu = " ";
		String messagebuku = " ";
		String message = " ";
		int[] hargaKacamata = { 500, 600, 700, 800 };
		int[] hargaBaju = { 200, 400, 350 };
		int[] hargaSepatu = { 400, 350, 200, 300 };
		int[] hargaBuku = { 100, 50, 150 };

		Arrays.sort(hargaKacamata);
		Arrays.sort(hargaBaju);
		Arrays.sort(hargaSepatu);
		Arrays.sort(hargaBuku);

		int iKacamata = 0;
		int iBaju = 0;
		int iSepatu = 0;
		int iBuku = 0;

		for (iKacamata = 0; iKacamata < hargaKacamata.length && jumlah_uang >= hargaKacamata[iKacamata]; iKacamata++) {
			jumlah_uang = jumlah_uang-hargaKacamata[iKacamata];
			count++;
			messagekacamata = "kaca_mata " + hargaKacamata[iKacamata];
			if (messagekacamata != null && !messagekacamata.isEmpty()) {
				message += messagekacamata + " ";
			}
			for (iBaju = 0; iBaju < hargaBaju.length && jumlah_uang >= hargaBaju[iBaju]; iBaju++) {
				jumlah_uang = jumlah_uang-hargaBaju[iBaju];
				count++;
				messagebaju += "baju " + hargaBaju[iBaju];
				if (messagebaju != null && !messagebaju.isEmpty()) {
					message += messagebaju + " ";
				}

				for (iSepatu = 0; iSepatu < hargaSepatu.length && jumlah_uang >= hargaSepatu[iSepatu]; iSepatu++) {
					jumlah_uang = jumlah_uang-hargaSepatu[iSepatu];
					count++;
					messagesepatu = "sepatu " + hargaSepatu[iSepatu];
					if (messagesepatu != null && !messagesepatu.isEmpty()) {
						message += messagesepatu + " ";
					}
					for (iBuku = 0; iBuku < hargaBuku.length && jumlah_uang >= hargaBuku[iBuku]; iBuku++) {
						jumlah_uang = jumlah_uang-hargaBuku[iBuku];
						count++;
						messagebuku = "buku " + hargaBuku[iBuku];
						// iBuku++;
						if (messagebuku != null && !messagebuku.isEmpty()) {
							message += messagebuku + " ";
						}
					}
					
				}
				
			}
			
		}
		System.out.println("Jumlah item yang dibeli: " + count);
		System.out.print("(" + message + ")");

	}

	public static void main(String[] args) {

		perhitungan_barang(1000);
	}

}
