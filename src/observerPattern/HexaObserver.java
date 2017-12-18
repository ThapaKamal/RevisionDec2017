/**
 * HexaObserver.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package observerPattern;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hexa String: "+Integer.toHexString(subject.getState()));
	}

}

