/**
 * StringImmutable.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 11, 2017
 * 
 */
package stringManipulation;

public class StringImmutable {

	public static void main(String[] args) {

		/*String s1=new String("JAVA");
		System.out.println(s1);
		s1.concat("J2EE");
		//String s2=s1.concat("J2EE");
		
		System.out.println(s1);
		//System.out.println(s2);
*/	
		String s1="JAVA";
		String s2="JAVA";
		
		//s1=s1.trim();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}

