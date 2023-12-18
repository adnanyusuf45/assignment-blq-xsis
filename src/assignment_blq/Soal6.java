package assignment_blq;

public class Soal6 {
	
	public static String palindromeCheck(String kata){
		Boolean kata_flag= true;
		
		System.out.println("Input Kata: "+ kata);
		
		String[] pisahKata = kata.split("");
		
		for (int i = 0; i < pisahKata.length; i++) {
			System.out.printf("%2s",pisahKata[i]);
		}
		System.out.println();
		
		for(int i=0;i<pisahKata.length;i++)
		{
		
			if(!pisahKata[i].toLowerCase().equals(pisahKata[(pisahKata.length-1)-i].toLowerCase()))
			{
				//System.out.println("Input 1 bukan palindrome");
				kata_flag=false;
				break;
				
			}

		}
		
		if(kata_flag) {
			return "Input Kata palindrome";
		}else {
			return "Input Kata bukan palindrome";
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	    System.out.println(palindromeCheck("katak"));
	    System.out.println(palindromeCheck("12021"));
	    System.out.println(palindromeCheck("malam"));
	}
	


}
