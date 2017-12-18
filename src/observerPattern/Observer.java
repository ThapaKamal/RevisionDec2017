/**
 * Observer.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 14, 2017
 * 
 * Observer pattern is used when there is one-to-many relationship between Objects.
 * Such as if one Object is modified, its dependent Objects are to be notified automatically.
 * This is a behavioral Pattern category.
 */
package observerPattern;

public abstract class Observer {

	protected Subject subject;
	public abstract void update();
}

