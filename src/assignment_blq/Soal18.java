package assignment_blq;

public class Soal18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] kalori = new double[4];
		
		kalori[0]=30;
		kalori[1]=20;
		kalori[2]=50;
		kalori[3]=80;
		
		double[] jam = new double[4];
		
		jam[0]=9;
		jam[1]=13;
		jam[2]=15;
		jam[3]=17;
		
		for(int i=0;i<4;i++){
			System.out.println("Kalori ke-"+(i+1)+": " +kalori[i]);
			System.out.println("Jam ke-"+(i+1)+": " +jam[i]);
		}
		System.out.println();
		
		double start_olahraga=18;
		double waktu_olahraga=0;
		
		for(int i=0;i<4;i++){
			
			waktu_olahraga=waktu_olahraga+(0.1*kalori[i]*(start_olahraga-jam[i]));
			
		}
		
		System.out.println("Jumlah Waktu Berolahraga: "+waktu_olahraga+" menit");
		
		int water=(int)((Math.round(waktu_olahraga/30))*100)+500 ;
		
		System.out.println("Jumlah Air yang diminum: "+water+" cc");

	}

}
