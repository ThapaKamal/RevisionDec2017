/**
 * SwapValues.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 11, 2017
 * 
 */
package stringManipulation;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int swap;
		
		swap=a;
		a=b;
		b=swap;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int x=30;
		int y=40;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		
	}

}

