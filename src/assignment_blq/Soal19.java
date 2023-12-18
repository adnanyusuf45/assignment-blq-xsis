package assignment_blq;

public class Soal19 {

	static int size = 26;

	// Function to check if ch is a letter
	static boolean isLetter(char ch) {
		if (!Character.isLetter(ch))
			return false;

		return true;
	}

	// Function to check if a string
	// contains all the letters from
	// a to z
	static void allLetter(String str, int len) {
		
		Boolean flag=true;
		
		System.out.println("Input Kalimat: "+str);

		
		str = str.toLowerCase();

		boolean[] present = new boolean[size];


		for (int i = 0; i < len; i++) {


			if (isLetter(str.charAt(i))) {

				// Mark current letter as present
				int letter = str.charAt(i) - 'a';
				present[letter] = true;
			}
		}

		// Traverse for every letter
		// from a to z
		for (int i = 0; i < size; i++) {

			if (!present[i]) {

				flag=false;
				break;
			}

		}
		
		if(flag) {
			System.out.println("Kalimat ini adalah Pangram");
			
		}else {
			System.out.println("Kalimat ini adalah Bukan Pangram");
		}
		

	}

	public static void main(String args[]) {

		// Given string str
		String str1 = "Sphinx of black quartz, judge my vow";
		String str2 = "Brawny gods just flocked up to quiz and vex him";
		String str3 = "Check back tomorrow; I will see if the book has arrived.";

		
		allLetter(str1, str1.length());
		allLetter(str2, str2.length());
		allLetter(str3, str3.length());

	}

}
