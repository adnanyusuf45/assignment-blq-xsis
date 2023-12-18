
package assignment_blq;

public class Soal5 {
	
	public static void first_n_fibonaciNumber(int n){
		int firstTerm = 0, secondTerm = 1;
		
	    System.out.println(n + " Bilangan Fibonaci Pertama:");

	    for (int i = 0; i < n; ++i) {
	    	
	    if(i==n-1) {
	    	System.out.print(firstTerm);
	    }else {
	    	System.out.print(firstTerm + ", ");
	    }
	      

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	    System.out.println();
	}

	  public static void main (String[] args) { 		    
		    first_n_fibonaciNumber(5);
		    first_n_fibonaciNumber(10);
	  } 
}
