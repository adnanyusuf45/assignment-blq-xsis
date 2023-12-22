package assignment_blq;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Soal3 {
	
	public static void Calculate_biaya_parkir(String tanggal_masuk,String tanggal_keluar) {
		
		System.out.println("Tanggal Masuk: "+tanggal_masuk);
		System.out.println("Tanggal Keluar: "+tanggal_keluar);
		
	       String[] arrayMasuk = tanggal_masuk.split(" ");
	        String[] arrayKeluar = tanggal_keluar.split(" ");
	        String[] Bulan = {"Januari","Februari","Maret","April",
	                "Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
	        String formatBulan = "";

	        for (int i = 0; i<Bulan.length;i++){
	            if (Bulan[i].equals(arrayMasuk[1])){
	                formatBulan = "0"+(i+1);
	                break;
	            }
	        }

	        
	        String startDateString = arrayMasuk[2] +"-"+formatBulan+"-"+arrayMasuk[0]+" "+arrayMasuk[4];
	        String endDateString = arrayKeluar[2] +"-"+formatBulan+"-"+arrayKeluar[0]+" "+arrayKeluar[4];


	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        Instant startInstant = LocalDateTime.parse(startDateString, formatter).atZone(ZoneId.systemDefault()).toInstant();
	        Instant endInstant = LocalDateTime.parse(endDateString, formatter).atZone(ZoneId.systemDefault()).toInstant();
	        long diffHours = ChronoUnit.HOURS.between(startInstant, endInstant);
	        long diffminutes = ChronoUnit.MINUTES.between(startInstant, endInstant);
	        long sisaMenit = diffminutes % 60;
	        long diffminutesinSec = ChronoUnit.SECONDS.between(startInstant,endInstant);
	        long sisaSec = diffminutesinSec % 60 ;

	        if (diffHours >= 24 && sisaMenit>=0 && sisaSec > 0){
	            System.out.println("Biaya Parkir:Rp."+(15000 + (diffHours - 24) * 1000));
	        }else if(diffHours==24 && sisaMenit==0 && sisaSec == 0) {
	        	System.out.println("Biaya Parkir:Rp."+8000);
	        }
	        
	        else if (diffHours >= 24 && sisaMenit>=0 && sisaSec == 0){
	            System.out.println("Biaya Parkir:Rp."+(15000 + (diffHours - 24) * 1000));
	        }
	        
	        

	        else if(diffHours >=8 && diffHours<24 && sisaMenit>=0 && (sisaSec==0||sisaSec > 0)){
	            System.out.println("Biaya Parkir:Rp."+8000);
	        }

	        else if(diffHours<8){
	            System.out.println("Biaya Parkir:Rp."+(diffHours * 1000));
	        }
	        
	        System.out.println();
		
	}

    public static void main(String[] args) {

        Calculate_biaya_parkir("27 Januari 2019 | 05:00:01","27 Januari 2019 | 17:45:03");
        Calculate_biaya_parkir("27 Januari 2019 | 07:03:59","27 Januari 2019 | 15:30:06");
        Calculate_biaya_parkir("27 Januari 2019 | 07:05:00","28 Januari 2019 | 00:20:21");
        Calculate_biaya_parkir("27 Januari 2019 | 11:14:23","27 Januari 2019 | 13:20:00");

    }

}
