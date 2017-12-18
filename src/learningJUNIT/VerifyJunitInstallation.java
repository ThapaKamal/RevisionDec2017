/**
 * VerifyJunitInstallation.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 6, 2017
 * 
 */
package learningJUNIT;

import static org.junit.Assert.*;
import org.junit.Test;

public class VerifyJunitInstallation {

		String message= "Hello Junit";
		TestingJunitMessage test = new TestingJunitMessage("8yky");
		
		@Test
		public void testPrintMessage()
		{
			assertEquals(message,test.pringMessage());
		}
	

}

