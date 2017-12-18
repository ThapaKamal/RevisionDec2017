/**
 * DoubleCheckSyncLazySingleton.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 13, 2017
 * 
 * Since due to low performance of Sync only method of getting lazy Initialization'
 * We can use Double check sync method as below to ensure that the performance is not slow.
 * In this approach, the sync block is used inside if condition with additional check to ensure 
 * only one instance of class is created.
 */
package singletonTypes;

public class DoubleCheckSyncLazySingleton {
	
	//private object
	private static DoubleCheckSyncLazySingleton instance;
	
	//private Constructor
	private DoubleCheckSyncLazySingleton(){}
	
	//Public Double check Sync method to return Singleton Instance
	public static DoubleCheckSyncLazySingleton getInstance(){
		if(instance == null){
			synchronized (DoubleCheckSyncLazySingleton.class) {
				if(instance==null){
					instance=new DoubleCheckSyncLazySingleton();
				}
			}
		}
		return instance;
	}
}

