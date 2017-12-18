/**
 * TestingJunitMessage.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 6, 2017
 * 
 */
package learningJUNIT;

public class TestingJunitMessage {

	private String message;
	
	public TestingJunitMessage(String message) {
		this.message=message;
	}
	
	public String pringMessage()
	{
		System.out.println(message);
		return message;
	}
		
}

