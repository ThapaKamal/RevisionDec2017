/**
 * EagerInitialization.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 10, 2017
 * 
 * In Eager Initialization, the instance of Singleton Class is created at the time of class loading.
 * This is the easiest method to create singleton class but if has drawback that instance is created
 * even through client application might not be using it initially.
 * Also there is no exception handling in this process.
 */
package singletonTypes;

public class EagerInitialization {

	private static final EagerInitialization instance= new EagerInitialization();
	
	//Private constructor to avoid client application to use constructor
	private EagerInitialization()
	{}
	
	//Public method to expose the Singleton Object
	public static EagerInitialization getInstance()
	{
		return instance;
	}
}

