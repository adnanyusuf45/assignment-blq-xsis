package assignment_blq;

public class Soal9 {

	public static void deret_penjumlahan(int n){
		
		int total=n;
		
		System.out.print("N = "+n+" -> ");
		
	    for (int i = 0; i < n; ++i) {
	    		
	    	
	    if(i==n-1) {
	    	System.out.print(total);
	    }else {
	    	System.out.print(total + " ");
	    }
	    
	    total=total+n;
	      
	    }
	    System.out.println();
	}

	  public static void main (String[] args) { 		    
		  deret_penjumlahan(3);
		  deret_penjumlahan(4);
		  deret_penjumlahan(5);
	  } 
}
