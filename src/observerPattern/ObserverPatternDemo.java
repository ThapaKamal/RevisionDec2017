/**
 * ObserverPatternDemo.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package observerPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		Subject subject=new Subject();
		
		new BinaryObserver(subject);
		new HexaObserver(subject);
		new OctalObserver(subject);
		
		
		System.out.println("First State Change : 15");
		subject.setState(15);
		
		System.out.println("Second State Change : 10");
		subject.setState(10);
	}

}

