/**
 * OctalObserver.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package observerPattern;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);

	}
	
	@Override
	public void update() {
		System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
	}

}

