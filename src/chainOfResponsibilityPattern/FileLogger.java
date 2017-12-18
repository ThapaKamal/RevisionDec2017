/**
 * FileLogger.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package chainOfResponsibilityPattern;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level=level;
	}
	@Override
	protected void write(String message) {
		System.out.println("Standard File :: Logger :"+message);
	}

}

