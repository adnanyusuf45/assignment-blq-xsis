package assignment_blq;

public class Soal17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr= "N N T N N N T T T T T N T T T N T N";
		
		String[] arrInput = arr.split(" ");	
		
		int mdpl=0;
		int lembah=0;
		int gunung=0;
		
		for(int i=0;i<arrInput.length;i++) {
			if(arrInput[i].equalsIgnoreCase("N")) {
				
				if(i==0) {
					mdpl++;
				}else {
					if(mdpl+1==0) {
						lembah++;
						mdpl++;
					}else {
						mdpl++;
					}
				}
				
			}else if(arrInput[i].equalsIgnoreCase("T")) {
				
				if(i==0) {
					mdpl--;
				}else {
					if(mdpl-1==0) {
						gunung++;
						mdpl--;
					}else {
						mdpl--;
					}
				}
				
				
			}
		}
		
		System.out.println("Gunung: "+gunung);
		System.out.println("Lembah: "+lembah);

	}

}
