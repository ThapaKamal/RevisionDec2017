/**
 * LazyInitializedSingleton.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 10, 2017
 * 
 * This method implement lazy initialization as it creates object when getInstance() method is called.
 * This method has a drawback that it doesn't work in Multi-threaded Environment.
 */
package singletonTypes;

public class LazyInitializedSingleton {

	//Private Object
	private static LazyInitializedSingleton instance;
	
	//Private Constructor
	private LazyInitializedSingleton(){
		
	}
	
	//Pubic method to expose singleton Object
	public static LazyInitializedSingleton getInstance(){
		if(instance==null){
			instance= new LazyInitializedSingleton();
		}
		return instance;
	}
}

