package assignment_blq;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Soal2 {

	
	static int dendabuku = 100;
	
	static int dendatotal=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hari_peminjaman = 8;
		

		methodPerhitungandenda("28 February 2016","07 March 2016");
		methodPerhitungandenda("29 April 2018","30 May 2018");
	}

	//procedute hitung semua denda
	public static void methodPerhitungandenda(String tanggal_awal,String tanggal_akhir) { //method procedure
		
		System.out.println("Tanggal Peminjaman: "+tanggal_awal+"-"+tanggal_akhir);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		LocalDate start = LocalDate.parse(tanggal_awal, formatter);
		LocalDate end = LocalDate.parse(tanggal_akhir, formatter);
		
		long lama_peminjaman = start.until(end, ChronoUnit.DAYS);;
		
				
		int batas_hari_peminjaman_buku_a=14;
		int batas_hari_peminjaman_buku_b = 3;
		int batas_hari_peminjaman_buku_c =7;
		int batas_hari_peminjaman_buku_d =7;
		
			int hari_denda_buku_a= (int) (lama_peminjaman-batas_hari_peminjaman_buku_a);
			int hari_denda_buku_b= (int) (lama_peminjaman-batas_hari_peminjaman_buku_b);
			int hari_denda_buku_c= (int) (lama_peminjaman-batas_hari_peminjaman_buku_c);
			int hari_denda_buku_d= (int) (lama_peminjaman-batas_hari_peminjaman_buku_d);
			
			if(hari_denda_buku_a>0) {

				dendatotal=hitungDendaBuku(hari_denda_buku_a,"Buku A");
			}

			if(hari_denda_buku_b>0) {
				

				dendatotal +=hitungDendaBuku(hari_denda_buku_b,"Buku B");
			}
			
			
			if(hari_denda_buku_c>0) {

				dendatotal += hitungDendaBuku(hari_denda_buku_c,"Buku C");
			}
			
			if(hari_denda_buku_d>0) {

				dendatotal += hitungDendaBuku(hari_denda_buku_d,"Buku D");
			}

		
			
			
			System.out.println("Total Denda:"+dendatotal);
			
			System.out.println();

		
	}
	
	
	public static int hitungDendaBuku(int hari_peminjaman,String nama_buku) {
		int bayar_denda_buku = hari_peminjaman* dendabuku;
		System.out.println("Denda"+ nama_buku +":"+ bayar_denda_buku);
		
		return bayar_denda_buku;		
	}

}
