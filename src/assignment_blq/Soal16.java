package assignment_blq;

public class Soal16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total=0;
		
		double[] menu = new double[5];
		menu[0]= 42000;//Tuna Sandwich (ikan)
		System.out.println("Tuna Sandwich (ikan):Rp."+menu[0]);
		menu[1]= 50000;// Spaghetti Carbonara	
		System.out.println("Spaghetti Carbonara:Rp."+menu[1]);
		menu[2]= 30000;// Tea pitcher
		System.out.println("Tea pitcher:Rp."+menu[2]);
		menu[3]= 70000;// Pizza
		System.out.println("Pizza:Rp."+menu[3]);
		menu[4]= 30000;// Salad
		System.out.println("Salad:Rp."+menu[4]);
		
		double menu0_total = (menu[0]*1.15); 
		double menu1_total = (menu[1]*1.15); 
		double menu2_total = (menu[2]*1.15); 
		double menu3_total = (menu[3]*1.15); 
		double menu4_total = (menu[4]*1.15);
		
		
		total= menu[0]+menu[1]+menu[2]+menu[3]+menu[4];
		
		double totalincludetax= menu0_total+menu1_total+menu2_total+menu3_total+menu4_total;
		
		System.out.println("Total sebelum Pajak: Rp."+total);
		
		System.out.println("Total setelah Pajak: Rp."+totalincludetax);
		
		double jumlah_a= (totalincludetax-menu0_total)/4;
		
		double jumlah_alergi=Math.ceil(menu0_total/3);
		
		
		double a= jumlah_a+jumlah_alergi;
		double b= jumlah_a+jumlah_alergi;
		double c= jumlah_a+jumlah_alergi;
		double d = jumlah_a;
		
		System.out.println("Si A membayar:Rp."+a);
		System.out.println("Si B membayar:Rp."+b);
		System.out.println("Si C membayar:Rp."+c);
		System.out.println("Si D membayar:Rp."+d);
		
		

	}

}
