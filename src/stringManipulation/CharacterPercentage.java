/**
 * CharacterPercentage.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 11, 2017
 * Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String
 */
package stringManipulation;

public class CharacterPercentage {

	public static void main(String[] args) {

		String input="Today's date is 12 Dec 2017:";
		char[] chars=input.toCharArray();
		int totalChars=input.length();
		
		int upCase=0;
		int lowCase=0;
		int num=0;
		int special=0;
		
		for(char ch:chars){
			
			if(Character.isUpperCase(ch)){
				upCase++;
			}else if(Character.isLowerCase(ch)){
				lowCase++;
			}else if(Character.isDigit(ch)){
				num++;
			}else{
				special++;
			}
			
		}
		System.out.println("Total Characters :"+totalChars);
		
		System.out.println("UpperCase Count  :"+upCase);
		System.out.println("UpperCase Percent:"+(upCase*100)/totalChars);
		
		System.out.println("LowerCase Count  :"+lowCase);
		System.out.println("LowerCase Percent:"+(lowCase*100)/totalChars);
		
		System.out.println("Number Count     :"+num);
		System.out.println("Number Percent   :"+(num*100)/totalChars);
		
		System.out.println("Special   Count  :"+special);
		System.out.println("Special Percent: "+(special*100)/totalChars);
		
	}

}

