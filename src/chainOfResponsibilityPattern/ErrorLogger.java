/**
 * ErrorLogger.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package chainOfResponsibilityPattern;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level=level;

	}
	
	@Override
	protected void write(String message) {
		System.out.println("Error Console:: Logger :"+message);
	}

}

