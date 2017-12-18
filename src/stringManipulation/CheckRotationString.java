/**
 * CheckRotationString.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 10, 2017
 * 
 * Problem :

If s1 and s2 are two given strings, then write a java program to check whether s2 is a rotated version of s1?

Examples :

If “JavaJ2eeStrutsHibernate” is a string then below are some rotated versions of this string.

“StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”.

 */
package stringManipulation;

public class CheckRotationString {

	public static void main(String[] args) {
		
		String s1="JavaJ2eeStrutsHibernate";
		String s2="HibernateJavaJ2eeStruts";
		
		String s3=s1+s1;
		if(s3.contains(s2)){
			System.out.println("True..");
		}else{
			System.out.println("False..");
		}
	}

}

