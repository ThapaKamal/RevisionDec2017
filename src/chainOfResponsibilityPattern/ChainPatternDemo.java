/**
 * ChainPatternDemo.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 * Create Different type of Loggers and assign then error levels and set next Logger.
 * Next logger in each logger represent the part of the chain.
 */
package chainOfResponsibilityPattern;

public class ChainPatternDemo {

	//Static method to get chain logger
	private static AbstractLogger getChainofLogger(){
		
		AbstractLogger errorLogger= new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger= new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {

		AbstractLogger loggerChain=getChainofLogger();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an Information..");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is Debug level info..");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an Error..");
		
	}

}

