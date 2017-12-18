/**
 * ConsoleLogger.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package chainOfResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger {

	//constructor
	public ConsoleLogger(int level){
		this.level=level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Standard Console :: Logger : "+message);
	}

}

