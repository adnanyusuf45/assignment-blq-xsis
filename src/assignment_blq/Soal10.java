package assignment_blq;

public class Soal10 {
	
	public static void maskingSentence(String sentence) {
		
	      String[] subStrings = sentence.split(" ");
	      
	      String maskString="";
	      
	      for(String subString: subStrings) {
	    	  if(subString.length()<2) {
	    		  maskString=maskString+subString+" ";

	    	  }else {
	    		  maskString=maskString+subString.substring(0,1)+"***"+subString.substring(subString.length()-1)+" ";

	    	  }
	    	  
	    	  
	      }
	      
	      System.out.println(maskString.trim());
		
	}

	   public static void main(String[] args) {
		   
		   maskingSentence("Susilo Bambang Yudhoyono");
		   maskingSentence("Rani Tiara");
		   
		   }

}
