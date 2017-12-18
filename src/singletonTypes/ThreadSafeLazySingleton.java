/**
 * ThreadSafeLazySingleton.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 * This method provide Thread safe Synchronized method to allow access to Singleton Object.
 * It has low performance because of cost associated with sync method.
 */
package singletonTypes;

public class ThreadSafeLazySingleton {

	//Private Object
	private static ThreadSafeLazySingleton instance;
	
	//Private Constructor
	private ThreadSafeLazySingleton(){
		
	}
	
	//Synchronized Thread Safe Lazy Initialization public method to provide Object access.
	public static synchronized ThreadSafeLazySingleton getInstance(){
		
		if(instance ==null){
			instance = new ThreadSafeLazySingleton();
		}
		return instance;
	}
	
}

