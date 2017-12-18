/**
 * BillPughSingleton.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 * Prior to java 1.5 there were lot of memory issues due to multi threaded Environment.
 * Solution to those was to use Singleton Method by Bill Pugh.
 * This method uses inner static helper class to create Object instance.
 */
package singletonTypes;

public class BillPughSingleton {
	
	//private constuctor
	private BillPughSingleton(){}
	
	//Static inner class
	private static class SingletonHelper{
		private static final BillPughSingleton Instance = new BillPughSingleton();
	}
	
	//public method to access the Singleton Object
	public static BillPughSingleton getInstance(){
		return SingletonHelper.Instance;
	}

	/*
	 * Notice the use of inner class, when the singleton Class is loaded (BillPughSingleton.class)
	 * the instance is not created in the memory. Only when getInstance is called, it creates the object
	 * instance using the SingletonHelper class.
	 * This method is fast and thread safe as even without using the sync block.
	 */
}

