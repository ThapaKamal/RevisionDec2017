/**
 * StaticBlockSingleton.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 10, 2017
 * 
 * This implementation is similar to Eager Initialization, except that the Object is created in 
 * Static Block which also allows for Exception Handling.
 */
package singletonTypes;

public class StaticBlockSingleton {

	//Private Object 
	private static StaticBlockSingleton instance;
	
	//Private Constructor
	private StaticBlockSingleton()
	{}
	
	//Static Block initialization for Exception Handling
	static{
		try{
			instance=new StaticBlockSingleton();
		}catch(Exception expected){
			throw new RuntimeException("Exception while creating Singleton Instance");
		}
	}
	
	
	//Public method to expose the Singleton Object
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}

