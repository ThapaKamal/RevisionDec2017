/**
 * ReverseAString.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 10, 2017
 * 
 */
package stringManipulation;

public class ReverseAString {

	public static void stringbuff(String input){
		
		StringBuffer rev = new StringBuffer(input);
		
		System.out.println("Reverse :"+ rev.reverse());
		String reverse=rev.reverse().toString();
	}
	
	public static void charRev(String input){
		
		char[] chars=input.toCharArray();
		for(int i=chars.length-1;i>=0;i-- ){
			System.out.print(chars[i]);
		}
	}
	
	public static void main(String[] args) {
		stringbuff("an15f0");
		charRev("asdfh231");
	}

}

