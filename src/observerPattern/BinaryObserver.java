/**
 * BinaryObserver.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package observerPattern;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		
		System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
	}

}

