/**
 * ReverseEachWord.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 11, 2017
 * 
 */
package stringManipulation;

public class ReverseEachWord {

	public static void main(String[] args) {

	/*	String input="Good Morning today is Monday";
		StringBuffer output=new StringBuffer();
		String[] words=input.split(" ");
		for(String word: words){
			StringBuffer str=new StringBuffer(word);
			output.append(str.reverse());
			output.append(" ");
		}
		System.out.println("Output :"+output.toString());
		*/
		
		String input="Today is Tuesday.";
		StringBuffer output=new StringBuffer(input);
		String reverse=output.reverse().toString();
		System.out.println(reverse);
	}

}

