/**
 * SwapStrings.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 11, 2017
 * 
 */
package stringManipulation;

public class SwapStrings {

	public static void main(String[] args) {

		String s1="JAVA";
		String s2="J2EE";
		
		System.out.println("Before Swap s1:"+s1);
		System.out.println("Before Swap s2:"+s2);
		
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());		//this copies actual s1 to s2.
		
		s1=s1.substring(s2.length());					//this cuts from length of current s2 
		
		System.out.println("After Swap s1:"+s1);
		System.out.println("After Swap s2:"+s2);
		
	}

}

