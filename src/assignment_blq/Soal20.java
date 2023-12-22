package assignment_blq;

public class Soal20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jarak_awal = 2;
		String winner="";
		Boolean flag_winner=false;

		String[] player_a = { "G", "G", "G" };
		String[] player_b = { "K", "K", "B" };

		int jarak_a = jarak_awal;
		int jarak_b = jarak_awal;
		
		System.out.println("Jarak Awal:"+jarak_awal);
		
		System.out.println("A:");
		for(int i=0;i<player_a.length;i++ ) {
			System.out.print(player_a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("B:");
		for(int i=0;i<player_b.length;i++ ) {
			System.out.print(player_b[i]+" ");
		}
		
		System.out.println();
		System.out.println();


		for (int i = 0; i < 3; i++) {
			
			if (player_a[i].equalsIgnoreCase("G")) {
				
				if(player_b[i].equalsIgnoreCase("K")) {
					jarak_a=jarak_a+2;
					jarak_b=jarak_b-1;
				}else if(player_b[i].equalsIgnoreCase("B")) {
					jarak_a=jarak_a-1;
					jarak_b=jarak_b+2;
				}

			} else if (player_a[i].equalsIgnoreCase("K")) {
				
				if(player_b[i].equalsIgnoreCase("B")) {
					jarak_a=jarak_a+2;
					jarak_b=jarak_b-1;
				}else if(player_b[i].equalsIgnoreCase("G")) {
					jarak_a=jarak_a-1;
					jarak_b=jarak_b+2;
				}
				

			} else if (player_a[i].equalsIgnoreCase("B")) {
				
				if(player_b[i].equalsIgnoreCase("G")) {
					jarak_a=jarak_a+2;
					jarak_b=jarak_b-1;
				}else if(player_b[i].equalsIgnoreCase("K")) {
					jarak_a=jarak_a-1;
					jarak_b=jarak_b+2;
				}
			}
			
			if(jarak_a==0 && flag_winner==false) {
				winner="B";
				flag_winner=true;
			}else if(jarak_b==0 && flag_winner==false) {
				winner="A";
				flag_winner=true;
			}
		}
		
		if(flag_winner) {
			System.out.println("Pemenang: "+winner);
		}else {
			System.out.println("Draw");
		}
		
		
		
		
	}

}
