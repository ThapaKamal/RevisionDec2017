/**
 * CheckAnagram.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 10, 2017
 * Two strings are called anagrams if they contain same set of characters but in different order.
 *  For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” .
 */
package stringManipulation;

import java.util.Arrays;

public class CheckAnagram {

	public static void isAnagram(String s1, String s2){
		
		//First remove all white spaces
		s1=s1.replaceAll("//s", "");
		s2=s2.replaceAll("//s", "");
		
		//convert to lower case to validate
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		boolean status=true;
		
		//First verify if both are of same length
		if(s1.length() != s2.length()){
			status=false;
		}else{
			
			//if both are of same length
			//convert to char array
			
			char[] chars1=s1.toCharArray();
			char[] chars2=s2.toCharArray();
			
			//Sort char arrays
			Arrays.sort(chars1);
			Arrays.sort(chars2);
			
			//now verify if both arrays are equal
			status=Arrays.equals(chars1, chars2);
			
		}
		
		if(status){
			System.out.println(" Anagram..");
		}else{
			System.out.println("Not Anagram..");
		}
	}
	
	public static void main(String[] args) {
		
		isAnagram("aba","abc");
		
	}

}

