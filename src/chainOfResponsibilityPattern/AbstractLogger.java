/**
 * AbstractLogger.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 */
package chainOfResponsibilityPattern;

public abstract class AbstractLogger {

	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	
	protected int level;
	
	//Next element in Chain or responsibility
	protected AbstractLogger nextLogger;
	
	//Set next logger
	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger=nextLogger;
				
	}
	
	//Logging Message
	public void logMessage(int level, String message){
		if(this.level <= level){
			write(message);
		}
		
		//Move to next logger
		if(nextLogger !=null){
			nextLogger.logMessage(level, message);
		}
	}
	
	abstract protected void write(String message);
}

