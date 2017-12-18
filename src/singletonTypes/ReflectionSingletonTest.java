/**
 * ReflectionSingletonTest.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 * Reflection can be used to break the Singleton implementations.
 */
package singletonTypes;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String args[]){
		
		EagerInitialization instanceOne= EagerInitialization.getInstance();
		EagerInitialization instanceTwo=null;
		
		try{
			Constructor[] constructors = EagerInitialization.class.getConstructors();
			
			for(Constructor constructor:constructors){
				
				//Below code will destroy the Singleton Pattern
				constructor.setAccessible(true);
				instanceTwo=(EagerInitialization)constructor.newInstance();
				break;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("First  : "+instanceOne.hashCode());
		System.out.println("Second : "+instanceTwo.hashCode());
		
	}
	
	
}

