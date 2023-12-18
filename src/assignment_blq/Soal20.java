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

		for (int i = 0; i < 3; i++) {
			
			int jarak_awal_a=jarak_a;
			int jarak_awal_b=jarak_b;

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
		}
		
		System.out.println("Jarak A: "+jarak_a);
		System.out.println("Jarak B: "+jarak_b);
	}

}
