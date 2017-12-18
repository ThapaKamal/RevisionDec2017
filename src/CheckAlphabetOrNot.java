import java.util.Scanner;

/**
 * CheckAlphabetOrNot.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 3, 2017
 * 
 */

public class CheckAlphabetOrNot {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Character.");
		char ch=scan.next().charAt(0);
		
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch + " is an Alphabet");
		}else{
			System.out.println(ch + " is Not an Alphabet");
		}
	}

}

