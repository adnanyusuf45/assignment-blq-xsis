package assignment_blq;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Soal2 {

	
	static int dendabuku = 100;
	
	static int dendatotal=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hari_peminjaman = 8;

		methodPerhitungandenda(hari_peminjaman);
	}

	//procedute hitung semua denda
	public static void methodPerhitungandenda(int hari_peminjaman) { //method procedure
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		LocalDate start = LocalDate.parse("28 February 2016", formatter);
		LocalDate end = LocalDate.parse("07 March 2016", formatter);
		
		int lama_peminjaman = 8;
		
				
		int batas_hari_peminjaman_buku_a=14;
		int batas_hari_peminjaman_buku_b = 3;
		int batas_hari_peminjaman_buku_c =7;
		int batas_hari_peminjaman_buku_d =7;
		
			int hari_denda_buku_a= hari_peminjaman-batas_hari_peminjaman_buku_a;
			int hari_denda_buku_b= hari_peminjaman-batas_hari_peminjaman_buku_b;
			int hari_denda_buku_c= hari_peminjaman-batas_hari_peminjaman_buku_c;
			int hari_denda_buku_d= hari_peminjaman-batas_hari_peminjaman_buku_d;
			
			if(hari_denda_buku_a>0) {
				//hitung denda pelajaran
				//dendatotal=dendapelajaran*pelajaran*hari_peminjaman;
				dendatotal=hitungDendaBuku(hari_denda_buku_a);
			}

			if(hari_denda_buku_b>0) {
				
				//hitung denda novel
				//dendatotal+=dendanovel*novel*hari_peminjaman;
				dendatotal +=hitungDendaBuku(hari_denda_buku_b);
			}
			
			
			if(hari_denda_buku_c>0) {
				//hitung denda skripsi
				//dendatotal+=dendaskripsi*skripsi*hari_peminjaman;
				dendatotal += hitungDendaBuku(hari_denda_buku_c);
			}

		
			
			//dendatotal=(dendapelajaran*pelajaran*hari_peminjaman)+(dendanovel*novel*hari_peminjaman)+(dendaskripsi*skripsi*hari_peminjaman);
			
			System.out.println("Total Denda:"+dendatotal);

		
	}
	
	
	public static int hitungDendaBuku(int hari_peminjaman) {
		int bayar_denda_buku = hari_peminjaman* dendabuku;
		System.out.println("Denda buku :"+ bayar_denda_buku);
		
		return bayar_denda_buku;		
	}

}
